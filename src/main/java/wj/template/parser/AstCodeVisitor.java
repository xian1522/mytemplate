package wj.template.parser;


import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import wj.template.parser.ast.*;
import wj.template.runtime.parser.grammer.TemplateParser;
import wj.template.runtime.parser.grammer.TemplateParserBaseVisitor;
import wj.template.runtime.parser.grammer.TemplateParserVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AstCodeVisitor extends TemplateParserBaseVisitor<AstNode> implements TemplateParserVisitor<AstNode> {

    @Override
    public AstTemplate visitTemplate(TemplateParser.TemplateContext ctx) {
        AstStatementList astStatementList = accept(ctx.getChild(0));
        return new AstTemplate(astStatementList);
    }

    @Override
    public AstStatementList visitBlock(TemplateParser.BlockContext ctx) {
        List<AstStatement> nodeList = accept(ctx.children);
        int block;
        if(ctx.parent instanceof TemplateParser.Directive_ifContext) {
            block = Token.AST_BLOCK_IF;
        }else if(ctx.parent instanceof TemplateParser.Directive_elseifContext){
            block = Token.AST_BLOCK_ELSEIF;
        }else if(ctx.parent instanceof TemplateParser.Directive_elseContext) {
            block = Token.AST_BLOCK_ELSE;
        }else if(ctx.parent instanceof TemplateParser.Directive_forContext) {
            block = Token.AST_BLOCK_FOR;
        }
        return new AstStatementList(nodeList, 2);
    }

    @Override
    public AstStatement visitValue(TemplateParser.ValueContext ctx) {
        AstExpression expression = accept(ctx.expression());
        return new AstValue(expression);
    }

    @Override
    public AstNode visitExpression_field(TemplateParser.Expression_fieldContext ctx) {
        AstExpression expression = accept(ctx.getChild(0));
        String name = ctx.getChild(2).getText();
        AstInvokeField astInvokeField = new AstInvokeField(expression,name);
        return astInvokeField;
    }

    @Override
    public AstNode visitExpression_identifier(TemplateParser.Expression_identifierContext ctx){
        return ctx.getChild(0).accept(this);
    }

    @Override
    public AstExpression visitIdentifier(TemplateParser.IdentifierContext ctx){
        String name = ctx.getChild(0).getText();
        return new AstIdentifier(name);
    }

    @Override
    public AstStatement visitText(TemplateParser.TextContext ctx) {
        String text = ctx.getText();
        return new AstText(text);
    }

    @Override
    public AstNode visitDirective(TemplateParser.DirectiveContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public AstNode visitDirective_if(TemplateParser.Directive_ifContext ctx) {
        int size = ctx.children.size();
        List<AstDirectiveIf> astElseIfList = new ArrayList<AstDirectiveIf>();
        List<TemplateParser.Directive_elseifContext> directive_elseifContexts = ctx.directive_elseif();
        for(TemplateParser.Directive_elseifContext elseifContext : directive_elseifContexts){
            AstDirectiveIf elseIf = accept(elseifContext);
            astElseIfList.add(elseIf);
        }

        AstExpression operatorEquals = accept(ctx.expression());
        AstStatementList astStatementList = accept(ctx.block());
        AstDirectiveIf astElse = accept(ctx.directive_else());

        return new AstDirectiveIf(operatorEquals, astStatementList, astElseIfList, astElse);
    }
    @Override
    public AstDirectiveIf visitDirective_elseif(TemplateParser.Directive_elseifContext ctx) {
        AstExpression operatorEquals = accept(ctx.expression());
        AstStatementList astStatementList = accept(ctx.block());
        return new AstDirectiveIf(operatorEquals, astStatementList, null, null);
    }

    @Override
    public AstDirectiveIf visitDirective_else(TemplateParser.Directive_elseContext ctx) {
        AstStatementList astStatementList = accept(ctx.block());
        return new AstDirectiveIf(null, astStatementList, null, null);
    }


    @Override
    public AstExpression visitExpression_binary_operator(TemplateParser.Expression_binary_operatorContext ctx) {

        List<AstExpression> expressionList = accept(ctx.expression());
        String operator = ctx.getChild(1).getText();

        return new AstBinaryOperator(expressionList.get(0), operator , expressionList.get(1));
    }

    @Override
    public AstExpression visitConstant(TemplateParser.ConstantContext ctx) {
        org.antlr.v4.runtime.Token token = ((TerminalNode) ctx.getChild(0)).getSymbol();
        int type = token.getType();
        switch (type) {
            case TemplateParser.INTEGER :
                return new AstConstant(Integer.valueOf(ctx.getText()));
            case TemplateParser.STRING_DOUBLE:{
                String value = ctx.getText();
                value = value.substring(1, value.length() - 1);
                return new AstConstant(value);
            }
        }
        return new AstConstant(ctx.getText());
    }

    @Override
    public AstNode visitExpression_constant(TemplateParser.Expression_constantContext ctx){
        return ctx.getChild(0).accept(this);
    }

    @Override
    public AstDirectiveFor visitDirective_for(TemplateParser.Directive_forContext ctx) {
        AstExpression astExpression = accept(ctx.expression());
        AstIdentifier astIdentifier = accept(ctx.identifier());
        AstStatementList astStatementList = accept(ctx.block());

        return new AstDirectiveFor(astExpression, astIdentifier, astStatementList);
    }

    @Override
    public AstExpressionList visitExpression_list(TemplateParser.Expression_listContext ctx) {
        List<AstExpression> expressionList = accept(ctx.expression());
        return new AstExpressionList(expressionList);
    }

    @Override
    public AstInvokeMethod visitExpression_method(TemplateParser.Expression_methodContext ctx) {
        AstExpression astExpression = accept(ctx.expression());
        String name = ctx.IDENTIFIER().getText();
        AstExpressionList astExpressionList = accept(ctx.expression_list());
        return new AstInvokeMethod(astExpression, name, astExpressionList);
    }

    @Override
    public AstIsExist visitExpression_is_exsit(TemplateParser.Expression_is_exsitContext ctx){
        AstExpression astExpression = accept(ctx.expression());
        AstIsExist astIsExist = new AstIsExist(astExpression);
        return astIsExist;
    }

    @Override
    public AstNode visitExpression_buildmethod(TemplateParser.Expression_buildmethodContext ctx) {
        AstExpression astExpression = accept(ctx.expression());
        String name = ctx.IDENTIFIER().getText();
        AstExpressionList astExpressionList = accept(ctx.expression_list());
        return new AstInvokeBuildMethod(astExpression, name, astExpressionList);
    }

    public AstDefaultValue visitExpression_default_value(TemplateParser.Expression_default_valueContext ctx) {
        AstExpression astExpression = accept(ctx.expression());
        String defaultValue = null;
        if(ctx.IDENTIFIER() != null) {
            defaultValue = ctx.IDENTIFIER().getText();
        }
        return new AstDefaultValue(astExpression, defaultValue);
    }

    private <T extends AstNode> T accept(ParseTree node) {
        if(node != null) {
            return (T) node.accept(this);
        }
        return null;
    }

    private <T extends AstNode>List<T> accept(List<? extends ParseTree> nodes) {
        if(nodes != null) {
            if(nodes.size() == 0) {
                return Collections.emptyList();
            }
            List<T> results = new ArrayList<T>();
            for(ParseTree parseTree : nodes) {
                T astNode = (T) parseTree.accept(this);
                results.add(astNode);
            }
            return results;
        }
        return null;
    }
}
