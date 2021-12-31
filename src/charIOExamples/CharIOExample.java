package charIOExamples;

import java.io.*;

public class CharIOExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;
        String fileToWrite01;

        try {
            fileToWrite01 = "src/charIOExamples/testFile01.txt";
            br = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(new FileWriter(fileToWrite01, false));

            System.out.println("Waiting Input...");
            String line = br.readLine();

            pw.println(line);
            File file = new File(fileToWrite01);
            if (file.exists()){
                System.out.println("저장에 성공했습니다.");
            }else{
                System.out.println("저장에 실패했습니다.");
            }
        } finally {
            br.close();
            pw.close();
        }
    }
}
