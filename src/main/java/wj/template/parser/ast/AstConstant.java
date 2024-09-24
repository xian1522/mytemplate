package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public class AstConstant extends AstExpression{

    private Object value;

    public AstConstant(Object value) {
        this.value = value;
    }


    @Override
    public Object execute(InterpretContext ctx) {
        return value;
    }
}
