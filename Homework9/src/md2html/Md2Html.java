package md2html;

import java.io.*;

public class Md2Html {
    public static void main(String[] args) {

        Document doc = null;

        File inFile = new File(args[0]);
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(inFile));
            doc = Parser.Parse(rd);
            rd.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(doc == null)
            return;

        File outFile = new File(args[1]);
        try {
            FileWriter fWriter = new FileWriter(outFile);

            fWriter.close();
        } catch (IOException e) {
            System.out.println("Can't create out file" + e.getMessage());
        }
    }
}
