package wj.template;

import wj.template.loader.ResourceLoader;
import wj.template.resolver.GlobalResolver;

/**
 * 模板引擎
 */
public abstract class TemplateEngine {

    public static TemplateEngine create() {
        return new TemplateEngineImpl(new TemplateConfig(null, TemplateConfig.DEFAULT_CONFIG_FILE));
    }

    public abstract Template getTemplate(String name);

    public abstract GlobalResolver getGlobalResolver();

    public abstract void setTemplateLoaders(ResourceLoader resourceLoader);
}
