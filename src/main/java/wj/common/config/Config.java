package wj.common.config;

import wj.util.ClassLoaderUtils;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Config extends AbstractConfig{

    public Config(Map<String, String> config) {
        super(config);
    }

    public <T> List<T> asObjectList(String name, Class<T> elementType, String defaultValue) {
        String value = config.get(name);
        if(value == null) {
            value = defaultValue;
        }
        if(value == null) {
            return Collections.emptyList();
        }

        List<T> result = new ArrayList<T>();

        String[] values = value.split(",");
        for (String tempValue : values) {
            Class<?> aClass = ClassLoaderUtils.loadClass(tempValue);
            try {
                Object instance = aClass.newInstance();
                result.add((T) instance);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public Charset asCharSet(String name, String defaultValue) {
        return doGetValue(name, Charset.class, defaultValue);
    }

    protected <T> T doGetValue(String name, Class<T> elementType, String defaultValue) {
        return stringAsObject(name, elementType, defaultValue);
    }

    private <T> T stringAsObject(String name, Class<T> targetClass, String defaultValue) {
        String value = config.get(name);
        if (value == null) {
            value = defaultValue;
        }
        if (value == null) {
            return null;
        }

        Class<?> aClass = ClassLoaderUtils.loadClass(defaultValue);
        try {
            Object instance = aClass.newInstance();
            return (T) instance;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
