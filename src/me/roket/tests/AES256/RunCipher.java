package me.roket.tests.AES256;

import java.util.Scanner;

public class RunCipher {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Waiting Input...");
//        String originalString = s.nextLine();
        String originalString = "originalString";

        String encryptedString = Encryptor.encrypt(originalString);
        String decryptedString = Decryptor.decrypt(encryptedString);

        System.out.println("Origianl: " + originalString);
        System.out.println("Encrypted: " + encryptedString);
        System.out.println("Decrypted: " + decryptedString);
    }
}