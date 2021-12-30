package charIOExamples;

import java.io.*;

public class CharIOExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        PrintWriter pw;
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new FileWriter("src/charIOExamples/testFile01.txt", false));
        try {
            System.out.println("Waiting Input...");
            String line = br.readLine();

            pw.println(line);
            File file = new File("src/charIOExamples/testFile01.txt");
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
