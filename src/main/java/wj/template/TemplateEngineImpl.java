package wj.template;

import wj.template.loader.MultiFileResourceLoader;
import wj.template.loader.Resource.Resource;
import wj.template.loader.ResourceLoader;
import wj.template.resolver.GlobalResolver;
import wj.template.runtime.buildin.WxyMethods;

import java.util.List;

public class TemplateEngineImpl extends TemplateEngine{

    private TemplateConfig config;
    private List<ResourceLoader> templateLoaders;
    private GlobalResolver globalResolver;

    public TemplateEngineImpl(TemplateConfig config) {
        this.config = config;
        this.templateLoaders = config.getTemplateLoaders();
        this.globalResolver = doGetGlobalResolver();
    }

    private GlobalResolver doGetGlobalResolver() {
        GlobalResolver globalResolver = new GlobalResolver();
        globalResolver.registerMethods(WxyMethods.class);
        return globalResolver;
    }

    @Override
    public Template getTemplate(String name) {
        Template template = internalGetTemplate(name);
        if(template != null) {
            template.reload();
            return template;
        }
        return null;
    }

    @Override
    public GlobalResolver getGlobalResolver(){
        return globalResolver;
    }

    private Template internalGetTemplate(String name) {
        for(ResourceLoader resourceLoader : templateLoaders) {

            if(name.startsWith("/")){
                name = name.substring(1);
            }

            Resource templateResource = resourceLoader.load(name);

            if(!templateResource.exist()) {
                continue;
            }

            TemplateImpl template = new TemplateImpl(this, templateResource, config);

            return template;
        }
        return null;
    }

    @Override
    public void setTemplateLoaders(ResourceLoader resourceLoader) {
        templateLoaders.add(resourceLoader);
    }
}
