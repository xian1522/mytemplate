package wj.template.loader;


import wj.template.loader.Resource.Resource;

public interface ResourceLoader {

    public Resource load(String name);
}
