package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;
import wj.template.runtime.TempForIterator;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class AstDirectiveFor extends AstStatement{

    private AstExpression astExpression;
    private AstIdentifier astIdentifier;
    private AstStatementList astStatementList;

    public AstDirectiveFor(AstExpression astExpression, AstIdentifier astIdentifier, AstStatementList astStatementList) {
        this.astExpression = astExpression;
        this.astIdentifier = astIdentifier;
        this.astStatementList = astStatementList;
    }

    @Override
    public void execute(InterpretContext ctx) {

        Object items = astExpression.execute(ctx);

        TempForIterator tempIterator = new TempForIterator(items);
        while ((tempIterator.hasNext())) {

            Object obj = tempIterator.next();
            if(obj instanceof Map.Entry) {
                obj = ((Map.Entry)obj).getValue();
            }

            ctx.getValueStack().setValue(astIdentifier.getName(), obj);
            ctx.getValueStack().setValue("counter", tempIterator.getIndex());
            astStatementList.execute(ctx);
        }
    }
}
