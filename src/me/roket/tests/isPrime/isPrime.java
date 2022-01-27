package me.roket.tests.isPrime;

import java.io.*;

public class isPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        if (judgePrime1(n)) {
            bw.write(String.format("%s is prime number.", n));
        } else {
            bw.write(String.format("%s is not prime number.", n));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean judgePrime1(int n) {
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

    public static boolean[] primeList(int n) {
        boolean[] primeList = new boolean[n + 1];
        primeList[0] = false;
        primeList[1] = false;

        for (int i = 2; i <= n; i++) {
            primeList[i] = true;
        }

        for (int i = 2; i <= Math.pow(n, 2); i++) {
            for (int j = (int) Math.pow(i, 2); j <= n; j += i) {
                primeList[j] = false;
            }
        }
        return primeList;
    }
}