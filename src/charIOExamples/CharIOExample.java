package charIOExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Waiting Input...");
        String line = br.readLine();
        System.out.println(line);
    }
}
