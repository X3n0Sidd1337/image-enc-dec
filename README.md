# Image Encryption and Decryption in Java

This project demonstrates how to encrypt and decrypt image files using the Advanced Encryption Standard (AES-256) algorithm in Java. The encrypted files are saved with a custom `.xenosid` extension, and the decrypted files are restored to their original format.

## Features

- **Image Encryption**: Encrypts image files to a secure `.xenosid` format, ensuring that they cannot be viewed without the correct decryption key.
- **Image Decryption**: Decrypts the `.xenosid` files back to their original image format.
- **Secure Key Generation**: Uses AES with a securely generated key for encryption and decryption.
- **User Input**: Accepts the input image file path from the user, with the encrypted and decrypted files automatically saved in the same directory.

## Technologies Used

- **Java**: Core programming language.
- **javax.crypto**: For encryption and decryption.
- **java.awt.image**: For image processing.
- **java.io**: For file handling.

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with Java support.

### Sample Console Window

![Screenshot](https://github.com/user-attachments/assets/179b109e-eff4-4a2b-9706-a8c56e0e912a)
