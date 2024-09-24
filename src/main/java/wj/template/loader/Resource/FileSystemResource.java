package wj.template.loader.Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileSystemResource extends AbstractResource{

    private File file;

    public FileSystemResource(File file) {
        this.file = file;
        this.relativePathName = file.getName();
    }

    @Override
    public boolean exist() {
        return file.exists();
    }

    @Override
    public InputStream openStream() {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
