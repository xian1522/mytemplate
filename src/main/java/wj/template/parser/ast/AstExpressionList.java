package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

import java.util.List;

public class AstExpressionList extends AstExpression{

    private final AstExpression[] EMPTY_ARRAY = new AstExpression[0];
    private AstExpression[] astExpressions;

    public AstExpressionList(List<AstExpression> astExpressions) {
        this.astExpressions = astExpressions.toArray(EMPTY_ARRAY);
    }

    @Override
    public Object[] execute(InterpretContext ctx) {
        int length = astExpressions.length;
        Object[] objects = new Object[length];
        for(int i = 0; i < length; i++) {
            Object execute = astExpressions[i].execute(ctx);
            objects[i] = execute;
        }
        return objects;
    }

    public AstExpression[] getAstExpressions() {
        return astExpressions;
    }
}
