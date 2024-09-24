package wj.common.config;

import wj.util.ClassLoaderUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class ConfigLoader {

    private HashMap<String, String> config = new HashMap<String, String>();

    public ConfigLoader load(String location) {
        if(location.startsWith("classpath:")) {
            location = location.substring("classpath:".length());
            return loadClassPath(location);
        }else if(location.startsWith("file:")) {
            location = location.substring("file:".length());
            return load(new File(location));
        }else {
            return load(new File(location));
        }
    }

    private ConfigLoader load(File file) {
        try {
            return loadInputStream(new FileInputStream(file), file.getName());
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    private ConfigLoader loadClassPath(String classPath) {
        if(classPath.startsWith("/")) {
            classPath = classPath.substring(1);
        }
        InputStream inputStream = ClassLoaderUtils.getDefault().getResourceAsStream(classPath);
        return loadInputStream(inputStream, classPath);
    }

    private ConfigLoader loadInputStream(InputStream inputStream, String location) {
        if(inputStream == null) {
            throw new IllegalStateException("InputSteam not found: " + location);
        }
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            load(properties);
            return this;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ConfigLoader load(Properties properties) {
        for(String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            config.put(key, value);
        }
        return this;
    }

    public Config asConfig() {
        return new Config(config);
    }
}
