package wj.template.parser.ast;

import wj.template.runtime.InterpretContext;

import java.io.IOException;

public class AstText extends AstStatement{
    private String text;

    public AstText(String text) {
        this.text = text;
    }


    public void trimDirectiveWhiteSpace(){
        if(text == null || text.length() == 0) {
            return;
        }
        int lpos = 0;
        int len = text.length();
        for(int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if(c == '\r') {
                int n = i + 1;
                if(n < len && text.charAt(n) == '\n') {
                    lpos = n + 1;
                }else {
                    lpos = n;
                }
                break;
            }else if( c == '\n'){
                lpos = i;
                break;
            }
        }
        text = text.substring(lpos);
    }


    @Override
    public void execute(InterpretContext ctx) {
        try {
            ctx.getWriter().write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
