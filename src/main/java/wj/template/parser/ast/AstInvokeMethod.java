package wj.template.parser.ast;

import sun.security.util.ArrayUtil;
import wj.common.bean.MethodInfo;
import wj.template.resolver.MethodInvokerResolver;
import wj.template.runtime.InterpretContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AstInvokeMethod extends AstExpression {

    private AstExpression astExpression; //对象名称
    private String name; //方法名称
    private AstExpressionList astExpressionList; //参数列表

    public AstInvokeMethod(AstExpression astExpression, String name, AstExpressionList astExpressionList) {
        this.astExpression = astExpression;
        this.name = name;
        this.astExpressionList = astExpressionList;
    }

    @Override
    public Object execute(InterpretContext ctx) {

        Object object = astExpression.execute(ctx);

        Object[] arguments;
        if(astExpressionList == null) {
            arguments = new Object[0];
        }else {
            arguments = astExpressionList.execute(ctx);
        }

        MethodInvokerResolver methodInvokerResolver = ctx.getGlobalResolver().getMethodInvokerResolver();

        Class<?>[] parameterTypes = getParameterTypes(arguments, object);

        MethodInfo methodInfo = methodInvokerResolver.resolverMethod(name, parameterTypes);
        Method method = methodInfo.getMethod();

        int parameterCount = method.getParameterCount();

        Object[] args = new Object[parameterCount];
        int length = parameterCount - 1;
        System.arraycopy(arguments, 0, args, 1, length);
        args[0] = object;

        try {
            Object result = method.invoke(null, args);
            return result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


    private Class<?>[] getParameterTypes(Object[] arguments, Object target) {
        Class<?>[] argumentsTypes;
        if(arguments.length == 0) {
            argumentsTypes =  new Class[0];
            return argumentsTypes;
        }else {
            argumentsTypes = new Class<?>[arguments.length];

            for(int i = 0; i < arguments.length; i++) {
                Object object = arguments[i];
                argumentsTypes[i] = object == null ? null : object.getClass();
            }

            Class<?>[] extendsionTypes = new Class<?>[arguments.length + 1];
            extendsionTypes[0] = target.getClass();
            System.arraycopy(argumentsTypes, 0, extendsionTypes, 1, arguments.length);

            return extendsionTypes;
        }
    }
}
