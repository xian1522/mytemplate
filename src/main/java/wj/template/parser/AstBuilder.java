package wj.template.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import wj.template.loader.Resource.Resource;
import wj.template.parser.ast.AstTemplate;
import wj.template.runtime.parser.grammer.TemplateLexer;
import wj.template.runtime.parser.grammer.TemplateParser;

import java.io.IOException;

public class AstBuilder {

    public static AstTemplate create(Resource resource) {
        try {
            CharStream charStream = CharStreams.fromStream(resource.openStream());
            TemplateLexer lexer = new TemplateLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            TemplateParser templateParser = new TemplateParser(commonTokenStream);

            AstCodeVisitor astCodeVisitor = new AstCodeVisitor();

            TemplateParser.TemplateContext template = templateParser.template();

//            System.out.println(template.toStringTree());

            return astCodeVisitor.visitTemplate(template);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
