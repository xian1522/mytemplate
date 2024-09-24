package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public abstract class AstDirective extends AstStatement{

    public abstract void execute(InterpretContext ctx);
}
