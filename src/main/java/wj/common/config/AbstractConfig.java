package wj.common.config;

import java.util.Map;

public abstract class AbstractConfig {
    protected final Map<String, String> config;

    public AbstractConfig(Map<String, String> config) {
        this.config = config;
    }
}
