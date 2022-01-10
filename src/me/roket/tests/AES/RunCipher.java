package me.roket.tests.AES;

import java.util.Scanner;

public class RunCipher {
    public static void main(String[] args) {
        final String secretKey = "my_secret_key";

        System.out.println("Waiting Input...");
        Scanner s = new Scanner(System.in);
        String originalString = s.nextLine();

        String encryptedString = AES.encrypt(originalString, secretKey);
        String decryptedString = AES.decrypt(encryptedString, secretKey);

        System.out.println("origianl text: " + originalString);
        System.out.println("encrypted text: " + encryptedString);
        System.out.println("decrypted text: " + decryptedString);
    }
}