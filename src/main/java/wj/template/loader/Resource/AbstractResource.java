package wj.template.loader.Resource;

import wj.util.IoUtils;

import java.nio.charset.Charset;

public abstract class AbstractResource implements Resource {

    protected String relativePathName;

    @Override
    public String getRelativePathName() {
        return relativePathName;
    }

    @Override
    public void setRelativePathName(String relativePathName) {
        this.relativePathName = relativePathName;
    }

    @Override
    public char[] toCharArray(Charset charset) {
        return IoUtils.toCharArray(openStream(), charset);
    }
}
