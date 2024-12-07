import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class encryptedText{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the word you want encrypt: ");
        String plainText = scn.nextLine();
        byte[] keyBytes = new byte[32]; // 256-bit key (must be 32 bytes)
        
        // Example key (in a real app, use a securely generated key)
        SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");

        // Initialize cipher for encryption
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt the plain text
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Text: " + plainText);
        System.out.println("Encrypted Text: " + encryptedText);
        String decryptText = decrypt(encryptedText, secretKey);
        System.out.println("Decrypted Text: " + decryptText);
    }

        // Method to decrypt encrypted text
        public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes);
        }
}