package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;
import wj.template.runtime.parser.grammer.TemplateParser;

import java.util.List;

public class AstStatementList extends AstStatement{

    private List<AstStatement> astStatementList;

    public AstStatementList(List<AstStatement> astStatementList, int block) {

        if(astStatementList.size() > 0 && block != 0) {
            trimDirectiveWhiteSpace(astStatementList);
        }
        this.astStatementList = astStatementList;
    }

    private void trimDirectiveWhiteSpace(List<AstStatement> astStatementList) {
        AstStatement astStatement = astStatementList.get(0);
        if(astStatement instanceof AstText) {
            AstText astText = (AstText) astStatement;
            astText.trimDirectiveWhiteSpace();
        }
    }

    @Override
    public void execute(InterpretContext ctx) {
        for(AstStatement astStatement : astStatementList) {
            astStatement.execute(ctx);
        }
    }
}
