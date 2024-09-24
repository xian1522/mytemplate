package wj.template;

import wj.common.config.Config;
import wj.common.config.ConfigLoader;
import wj.template.loader.ClasspathResourceLoader;
import wj.template.loader.Resource.Resource;
import wj.template.loader.ResourceLoader;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Properties;

public class TemplateConfig {
    public static final String DEFAULT_CONFIG_FILE = "classpath:/config/config.properties";

    private static final String TEMPLATE_LOADERS = "wj.template.loaders";
    private static final String INPUT_ENCODING = "wj.input.encoding";

    private List<ResourceLoader> templateLoaders;
    private Charset inputEncoding;

    protected TemplateConfig(Properties properties, String location) {
        ConfigLoader configLoader = new ConfigLoader();
        if(properties != null) {
            configLoader.load(properties);
        }
        if(location != null) {
            configLoader.load(location);
        }

        initialize(configLoader.asConfig());
    }

    protected void initialize(Config config) {
        this.templateLoaders = config.asObjectList(TEMPLATE_LOADERS, ResourceLoader.class, ClasspathResourceLoader.class.getName());
//        this.inputEncoding = config.asCharSet(INPUT_ENCODING, "UTF-8");
        this.inputEncoding = Charset.forName("UTF-8");
    }

    public List<ResourceLoader> getTemplateLoaders() {
        return templateLoaders;
    }

    public Charset getInputEncoding() {
        return inputEncoding;
    }

    public void setInputEncoding(Charset inputEncoding) {
        this.inputEncoding = inputEncoding;
    }
}
