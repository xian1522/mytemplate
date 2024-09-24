package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public abstract class AstStatement extends AstNode{

    public abstract void execute(InterpretContext ctx);
}
