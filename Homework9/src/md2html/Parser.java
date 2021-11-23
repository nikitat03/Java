package md2html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Parser {
    public static Document Parse(BufferedReader rd) throws IOException {

        HtmlDocument doc = new HtmlDocument();

        String[] lines = new String[0];

        String line = rd.readLine();
        while (!line.isEmpty()) {
            if (!line.isEmpty()) {
                lines = Arrays.copyOf(lines, lines.length + 1);
            } else {
                //PutSOmewhere(lines);
                lines = new String[0];
            }
        }

        return doc;

    }
}
