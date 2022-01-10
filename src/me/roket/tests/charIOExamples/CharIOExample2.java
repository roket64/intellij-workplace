package me.roket.tests.charIOExamples;

import java.io.*;

public class CharIOExample2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;
        String fileToRead;
        String fileToWrite;

        try {
            fileToRead = "src/me/roket/tests/charIOExamples/CharIOExample2.java";
            fileToWrite = "src/me/roket/tests/charIOExamples/IOExample02.txt";

            br = new BufferedReader(new FileReader(fileToRead));
            pw = new PrintWriter(new FileWriter(fileToWrite));
            String line = null;

            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
            br.close();
        }
    }
}