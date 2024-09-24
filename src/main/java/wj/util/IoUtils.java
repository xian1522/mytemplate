package wj.util;

import java.io.*;
import java.nio.charset.Charset;

public class IoUtils {

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        char[] buffer = new char[8192];
        int n = 0;
        while ( -1 != (n = reader.read(buffer))){
            writer.write(buffer, 0, n);
        }
        return writer.toCharArray();
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) {
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        try {
            return toCharArray(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
