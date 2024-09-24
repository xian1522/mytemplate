// Generated from java-escape by ANTLR 4.11.1
package wj.template.parser.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TemplateParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TemplateParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(TemplateParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(TemplateParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TemplateParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TemplateParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_buildmethod}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_buildmethod(TemplateParser.Expression_buildmethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_buildmethod}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_buildmethod(TemplateParser.Expression_buildmethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_identifier}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_identifier(TemplateParser.Expression_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_identifier}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_identifier(TemplateParser.Expression_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_field}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_field(TemplateParser.Expression_fieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_field}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_field(TemplateParser.Expression_fieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_is_exsit}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_is_exsit(TemplateParser.Expression_is_exsitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_is_exsit}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_is_exsit(TemplateParser.Expression_is_exsitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_method}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_method(TemplateParser.Expression_methodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_method}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_method(TemplateParser.Expression_methodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_default_value}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_default_value(TemplateParser.Expression_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_default_value}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_default_value(TemplateParser.Expression_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_binary_operator}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_binary_operator(TemplateParser.Expression_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_binary_operator}
	 * labeled alternative in {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_binary_operator(TemplateParser.Expression_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(TemplateParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(TemplateParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TemplateParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TemplateParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TemplateParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TemplateParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(TemplateParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(TemplateParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#directive_if}.
	 * @param ctx the parse tree
	 */
	void enterDirective_if(TemplateParser.Directive_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#directive_if}.
	 * @param ctx the parse tree
	 */
	void exitDirective_if(TemplateParser.Directive_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#directive_elseif}.
	 * @param ctx the parse tree
	 */
	void enterDirective_elseif(TemplateParser.Directive_elseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#directive_elseif}.
	 * @param ctx the parse tree
	 */
	void exitDirective_elseif(TemplateParser.Directive_elseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#directive_else}.
	 * @param ctx the parse tree
	 */
	void enterDirective_else(TemplateParser.Directive_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#directive_else}.
	 * @param ctx the parse tree
	 */
	void exitDirective_else(TemplateParser.Directive_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#directive_for}.
	 * @param ctx the parse tree
	 */
	void enterDirective_for(TemplateParser.Directive_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#directive_for}.
	 * @param ctx the parse tree
	 */
	void exitDirective_for(TemplateParser.Directive_forContext ctx);
}