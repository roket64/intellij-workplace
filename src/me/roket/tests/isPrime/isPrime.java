package me.roket.tests.isPrime;

import java.io.*;

public class isPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        if (judgePrime(n)){
            bw.write(String.format("%s is prime number.", n));
        }else {
            bw.write(String.format("%s is not prime number.", n));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean judgePrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= (Math.sqrt(n)); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
