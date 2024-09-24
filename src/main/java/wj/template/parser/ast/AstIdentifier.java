package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public class AstIdentifier extends AstExpression{

    private String name;

    public AstIdentifier(String name) {
        this.name = name;
    }

    @Override
    public Object execute(InterpretContext ctx) {
        return ctx.getValueStack().getValue(name);
    }

    public String getName() {
        return name;
    }
}
