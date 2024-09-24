package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public abstract class AstExpression extends AstNode{

    public abstract Object execute(InterpretContext ctx);
}
