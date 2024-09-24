package wj.template;

import sun.awt.SunHints;
import wj.template.loader.Resource.Resource;
import wj.template.parser.AstBuilder;
import wj.template.parser.Source;
import wj.template.parser.ast.AstTemplate;
import wj.template.runtime.InterpretContextImpl;
import wj.template.runtime.ValueStack;

import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Map;

public class TemplateImpl implements Template{

    private TemplateEngine templateEngine;
    private Resource resource;
    private TemplateConfig templateConfig;

    private AstTemplate astNode;

    public TemplateImpl(TemplateEngine templateEngine, Resource resource, TemplateConfig templateConfig) {
        this.templateEngine = templateEngine;
        this.resource = resource;
        this.templateConfig = templateConfig;
    }

    @Override
    public void reload() {
//        String fileName = resource.getRelativePathName();
//        char[] contents = resource.toCharArray(templateConfig.getInputEncoding());
//
//        Source source = new Source(fileName, contents);

        astNode = AstBuilder.create(resource);

    }

    @Override
    public void render(Map<String, Object> context, Writer out) {
        doInterpret(context, out);
    }

    private void doInterpret(Map<String, Object> context, Writer out) {
        InterpretContextImpl ctx = new InterpretContextImpl(templateEngine, new ValueStack(context), out);

        astNode.execute(ctx);

    }

    @Override
    public String getName() {
        return resource.getRelativePathName();
    }

    @Override
    public TemplateEngine getTemplateEngine() {
        return templateEngine;
    }
}
