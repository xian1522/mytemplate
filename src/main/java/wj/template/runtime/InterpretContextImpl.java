package wj.template.runtime;

import wj.template.TemplateEngine;
import wj.template.resolver.GlobalResolver;

import java.io.Writer;
import java.util.Stack;

/**
 * 解释上下文
 */
public class InterpretContextImpl extends InterpretContext{

    private ValueStack valueStack;
    private Writer writer;
    private final GlobalResolver globalResolver;

    public InterpretContextImpl(TemplateEngine templateEngine,ValueStack valueStack, Writer writer) {
        this.valueStack = valueStack;
        this.writer = writer;
        this.globalResolver = templateEngine.getGlobalResolver();
    }

    @Override
    public ValueStack getValueStack() {
        return valueStack;
    }
    @Override
    public Writer getWriter() {
        return writer;
    }

    @Override
    public GlobalResolver getGlobalResolver() {
        return globalResolver;
    }
}
