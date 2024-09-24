package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AstInvokeBuildMethod extends AstExpression{

    private AstExpression astExpression;
    private String name;
    private AstExpressionList astExpressionList;

    public AstInvokeBuildMethod(AstExpression astExpression, String name, AstExpressionList astExpressionList) {
        this.astExpression = astExpression;
        this.name = name;
        this.astExpressionList = astExpressionList;
    }

    @Override
    public Object execute(InterpretContext ctx) {

        Object object = astExpression.execute(ctx);

        Object[] executeArgs = null;

        if(astExpressionList != null) {
            executeArgs = astExpressionList.execute(ctx);
        }

        Method[] declaredMethods = object.getClass().getDeclaredMethods();
        try {
            for(Method method : declaredMethods) {
                if(name.equals(method.getName())) {
                    return method.invoke(object, executeArgs);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
