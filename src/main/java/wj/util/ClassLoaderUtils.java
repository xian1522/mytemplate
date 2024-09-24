package wj.util;

import java.net.URL;

public class ClassLoaderUtils {

    /**
     * 获取classLoader
     * @return
     */
    public static ClassLoader getDefault() {
        ClassLoader classLoader = null;

        classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null) {
            classLoader = ClassLoaderUtils.class.getClassLoader();
        }
        if(classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader;
    }

    public static Class<?> loadClass(String className) {
        try {
            return loadClass(className, null);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static Class<?> loadClass(String className, ClassLoader classLoader) throws ClassNotFoundException {
        classLoader = classLoader == null ? getDefault() : classLoader;
        return Class.forName(className, false, classLoader);
    }

    public static URL getResource(String name) {
        return getResource(name, null);
    }

    public static URL getResource(String name, ClassLoader classLoader) {

        if(classLoader != null) {
            URL url = classLoader.getResource(name);
            return url;
        }
        classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader != null) {
            URL url = classLoader.getResource(name);
            return url;
        }
        return ClassLoader.getSystemResource(name);
    }
}
