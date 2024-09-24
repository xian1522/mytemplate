package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

import java.lang.reflect.Field;
import java.util.Map;

public class AstInvokeField extends AstExpression{

    private AstExpression expression;
    private String name;

    public AstInvokeField(AstExpression expression, String name) {
        this.expression = expression;
        this.name = name;
    }

    @Override
    public Object execute(InterpretContext ctx) {
        Object object = expression.execute(ctx);

        return doInvokeGetter(object, ctx);
    }

    private Object doInvokeGetter(Object object, InterpretContext ctx) {
        Class invokeClass = object.getClass();
        try {
            if(Map.Entry.class.isAssignableFrom(invokeClass)) {
                return ((Map.Entry)object).getValue();
            }else {
                Field field = invokeClass.getDeclaredField(name);
                field.setAccessible(true);
                return field.get(object);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
