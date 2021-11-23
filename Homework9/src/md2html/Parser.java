package md2html;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static Document Parse(BufferedReader rd) throws IOException {

        HtmlDocument doc = new HtmlDocument();

        List<String> lines = new ArrayList<String>();

        String line = rd.readLine();
        while (rd.ready()) {
            if (!line.isEmpty()) {
                lines.add(line);
            } else {
                //PutSOmewhere(lines);
                lines.clear();
            }
            line = rd.readLine();
        }

        return doc;

    }
}
