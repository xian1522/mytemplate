package wj.common.bean;

import java.lang.reflect.Method;

public class MethodInfo {
    private Method method;

    public MethodInfo(Method method) {
        this.method = method;
    }

    public Method getMethod() {
        return method;
    }
}
