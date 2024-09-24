package wj.template.runtime;

import java.util.Map;
import java.util.Stack;


public final class ValueStack {

    private Map<String, Object> userContext;
    private Stack<Boolean> ifExpreStack = new Stack<Boolean>();

    public ValueStack(Map<String, Object> userContext ) {
        this.userContext = userContext;
    }

    public Object getValue(String name) {
        return userContext.get(name);
    }

    public void setValue(String name, Object value) {
        userContext.put(name, value);
    }

    public Stack<Boolean> getIfExpreStack() {
        return ifExpreStack;
    }
}
