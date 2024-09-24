package wj.template.loader;

import wj.template.loader.Resource.ClasspathResource;
import wj.template.loader.Resource.Resource;
import wj.util.ClassLoaderUtils;

import java.net.URL;


public class ClasspathResourceLoader implements ResourceLoader{
    @Override
    public Resource load(String name) {

        ClasspathResource classpathResource = new ClasspathResource(name);

        classpathResource.setRelativePathName(name);

        return classpathResource;
    }
}
