package wj.template.parser;

public class Source {

    private final static String REGEX_NEWLINE_SPLINT = "\\r?\\n|\\r";

    private String filename;
    private String[] lines;
    private char[] contents;

    public Source(String filename, char[] contents) {
        this.filename = filename;
        this.contents = contents;
        this.lines = new String(contents).split(REGEX_NEWLINE_SPLINT);
    }

    public String getFilename() {
        return filename;
    }

    public char[] getContents() {
        char[] c = contents;
        if(c != null) {
            contents = null;
            return c;
        }
        return null;
    }

    public String[] getLines() {
        return lines;
    }
}
