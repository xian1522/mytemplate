package wj.template.runtime;

import wj.template.resolver.GlobalResolver;

import java.io.Writer;

public abstract class InterpretContext {

    public abstract ValueStack getValueStack();

    public abstract Writer getWriter();

    public abstract GlobalResolver getGlobalResolver();
}
