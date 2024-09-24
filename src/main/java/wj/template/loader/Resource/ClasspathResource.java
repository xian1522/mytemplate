package wj.template.loader.Resource;

import wj.util.ClassLoaderUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ClasspathResource extends AbstractResource{
    private URL url;
    private String path;

    public ClasspathResource(String path) {
        this(path, null);
    }

    public ClasspathResource(String path, ClassLoader classLoader) {
        if(classLoader == null) {
            classLoader = ClassLoaderUtils.getDefault();
        }
        URL resourceUrl = null;
        if(classLoader == null) {
            resourceUrl = ClassLoader.getSystemResource(path);
        }
        resourceUrl = classLoader.getResource(path);
        this.relativePathName = path;
        this.path = path;
        this.url = resourceUrl;
    }

    @Override
    public boolean exist() {
        return url != null;
    }

    @Override
    public InputStream openStream() {
        try {
            return url.openStream();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
