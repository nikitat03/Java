package md2html;

import java.io.*;

public class Md2Html extends Parser {
    public static void main(String[] args) {
        File inFile = new File(args[0]);
        try {
            BufferedReader rd = new BufferedReader(new FileReader(inFile));
            Parser p = new Parser();
            p.Parse(rd);
            rd.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


        File outFile = new File(args[1]);
        try {
            FileWriter fWriter = new FileWriter(outFile);

            fWriter.close();
        } catch (IOException e) {
            System.out.println("Can't create out file" + e.getMessage());
        }
    }
}
