package wj.template;

import wj.template.loader.Resource.Resource;

import java.io.Writer;
import java.util.Map;

public interface Template {

    public void reload();

    public void render(Map<String, Object> context, Writer out);

    public String getName();

    public TemplateEngine getTemplateEngine();

}
