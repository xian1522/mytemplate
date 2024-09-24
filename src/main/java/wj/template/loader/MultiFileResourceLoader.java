package wj.template.loader;

import wj.template.loader.Resource.FileSystemResource;
import wj.template.loader.Resource.Resource;

import java.io.File;

public class MultiFileResourceLoader implements ResourceLoader{

    private String[] filepaths;

    public MultiFileResourceLoader(String[] filepaths) {
        this.filepaths = filepaths;
    }

    @Override
    public Resource load(String name) {
        FileSystemResource fileSystemResource = null;
        for(String value : filepaths) {
            File file = new File(value + "/" + name);
            if(file.exists()) {
                fileSystemResource = new FileSystemResource(file);
                break;
            }
        }
        return fileSystemResource;
    }

}
