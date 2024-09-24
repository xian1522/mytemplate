package wj.template.loader.Resource;

import java.io.InputStream;
import java.nio.charset.Charset;

public interface Resource {

    public boolean exist();

    public String getRelativePathName();

    public void setRelativePathName(String relativePathName);

    public char[] toCharArray(Charset charset);

    public InputStream openStream();
}
