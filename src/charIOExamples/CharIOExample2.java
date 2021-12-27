package charIOExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExample2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;

        try{
            br = new BufferedReader(new FileReader("src/charIOExamples/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("testFile.txt"));
            String line = null;
            while((line = br.readLine())!= null){
                pw.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            pw.close();
            br.close();
        }
    }
}