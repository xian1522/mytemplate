package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

public class AstIsExist extends AstExpression{

    private AstExpression astExpression;

    public AstIsExist(AstExpression astExpression) {
        this.astExpression = astExpression;
    }

    @Override
    public Object execute(InterpretContext ctx) {

        Object execute = astExpression.execute(ctx);

        return execute != null;
    }
}
