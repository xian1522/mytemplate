package wj.template.resolver;

import wj.common.bean.MethodInfo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodInvokerResolver {

    private Map<String, List<MethodInfo>> extendsionMethod = new HashMap<String, List<MethodInfo>>(32);

    public void registerMethods(Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();

        for(Method method : declaredMethods) {
            MethodInfo methodInfo = new MethodInfo(method);
            String name = methodInfo.getMethod().getName();
            List<MethodInfo> methodInfos = extendsionMethod.get(name);
            if(methodInfos == null) {
                methodInfos = new ArrayList<>(4);
                extendsionMethod.put(name, methodInfos);
            }
            methodInfos.add(methodInfo);
        }
    }

    public MethodInfo resolverMethod(String name, Class<?>[] parameterTypes){
        List<MethodInfo> methodInfos = extendsionMethod.get(name);
        for(MethodInfo methodInfo : methodInfos) {
            Class<?>[] paramTypes = methodInfo.getMethod().getParameterTypes();
            if(parameterTypes.length == paramTypes.length) {
                for(int i = 0; i < parameterTypes.length; i++) {
                    if(!parameterTypes[i].equals(paramTypes[i])){
                        continue;
                    }
                    return methodInfo;
                }
            }
        }
        return methodInfos.get(0);
    }


}
