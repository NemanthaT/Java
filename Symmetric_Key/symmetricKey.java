import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class symmetricKey {
    public static void main(String[] args) throws Exception {
        // Create a KeyGenerator for AES
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // Specify key size (128, 192, or 256 bits)

        // Generate the symmetric key
        SecretKey secretKey = keyGen.generateKey();
        System.out.println("Generated Key: " + bytesToHex(secretKey.getEncoded()));
    }

    // Helper method to convert bytes to a hex string
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}