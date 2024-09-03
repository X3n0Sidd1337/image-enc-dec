import java.io.File;
import javax.crypto.SecretKey;
import java.util.Scanner;

public class ImageEncryptorApp {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the image to encrypt: ");
        String inputImagePath = scanner.nextLine();
        File inputFile = new File(inputImagePath);
        String parentDirectory = inputFile.getParent();
        File encryptedFile = new File(parentDirectory, "encrypted_image.xenosid");
        File decryptedFile = new File(parentDirectory, "decrypted_image.png");
        
        byte[] imageBytes = ImageEncryptorUtils.imageToBytes(inputFile);
        SecretKey key = ImageEncryptorUtils.generateKey();
        System.out.println("SecretKey: " + ImageEncryptorUtils.bytesToHex(key.getEncoded()));
        byte[] encryptedData = ImageEncryptorUtils.encrypt(imageBytes, key);
        ImageEncryptorUtils.saveEncryptedFile(encryptedData, encryptedFile);
        byte[] loadedEncryptedData = ImageEncryptorUtils.loadEncryptedFile(encryptedFile);
        byte[] decryptedData = ImageEncryptorUtils.decrypt(loadedEncryptedData, key);
        ImageEncryptorUtils.bytesToImage(decryptedData, decryptedFile);
        
        System.out.println("Encryption and Decryption completed successfully.");
    }
}