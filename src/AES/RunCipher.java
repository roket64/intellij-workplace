package AES;

import AES256.Decryptor;
import AES256.Encryptor;

import java.util.Scanner;

public class RunCipher {
    public static void main(String[] args) {
        final String secretKey = "my_secret_key";

        Scanner s = new Scanner(System.in);
        String originalString = s.nextLine();
        System.out.println("Waiting Input...");

        String encryptedString = AES.encrypt(originalString, secretKey);
        String decryptedString = AES.decrypt(encryptedString, secretKey);

    }
}