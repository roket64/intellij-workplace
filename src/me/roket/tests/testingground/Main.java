package me.roket.tests.testingground;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        byte[] a = br.readLine().getBytes(StandardCharsets.US_ASCII);
        bw.write(String.valueOf(a[0]));
        br.close();
        bw.close();
    }
}