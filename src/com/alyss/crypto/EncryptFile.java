package com.alyss.crypto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
  
public class EncryptFile {  
    KeyGenerator keyGenerator = null;  
    SecretKey secretKey = null;  
    Cipher cipher = null;      
    public EncryptFile() {  
        try {  
        	LocalConnection localConnection=new LocalConnection();
        	byte []keybyte = new byte[16];
        	 keybyte=localConnection.findKey();
        	secretKey = new SecretKeySpec(keybyte, 0, 16, "RC4");
        	cipher = Cipher.getInstance("RC4");
        
        } catch (NoSuchAlgorithmException ex) {  
            System.out.println(ex);  
        }  catch(Exception e){
        	System.out.print(e);
        }
    }  
  
    /** 
     * Encrypts the file in srcPath and creates a file in destPath 
     */  
    public void encryptFile(String srcPath, String destPath) {  
        File rawFile = new File(srcPath);  
        File encryptedFile = new File(destPath);  
        try {    
             // Initialize the cipher for encryption            
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);            
            //Initialize input and output streams       
            InputStream    inStream = new FileInputStream(rawFile);  
            OutputStream outStream = new FileOutputStream(encryptedFile);  
            byte[] buffer = new byte[1024];  
            int len;  
            while ((len = inStream.read(buffer)) > 0) {  
                outStream.write(cipher.update(buffer, 0, len));  
                outStream.flush();  
            }  
            outStream.write(cipher.doFinal());  
            inStream.close();  
            outStream.close();  
        } catch (IllegalBlockSizeException ex) {  
            System.out.println(ex);  
        } catch (BadPaddingException ex) {  
            System.out.println(ex);  
        } catch (InvalidKeyException ex) {  
            System.out.println(ex);  
        } catch (FileNotFoundException ex) {  
            System.out.println(ex);  
        } catch (IOException ex) {  
            System.out.println(ex);  
        }  
    }  
    public void decryptFile(String srcPath, String destPath) {  
        File encryptedFile = new File(srcPath);  
        File decryptedFile = new File(destPath);  
        InputStream inStream = null;  
        OutputStream outStream = null;  
        try {  
            /** 
             * Initialize the cipher for decryption 
             */  
            cipher.init(Cipher.DECRYPT_MODE, secretKey);  
            /** 
             * Initialize input and output streams 
             */  
            inStream = new FileInputStream(encryptedFile);  
            outStream = new FileOutputStream(decryptedFile);  
            byte[] buffer = new byte[1024];  
            int len;  
            while ((len = inStream.read(buffer)) > 0) {  
                outStream.write(cipher.update(buffer, 0, len));  
                outStream.flush();  
            }  
            outStream.write(cipher.doFinal());  
            inStream.close();  
            outStream.close();  
        } catch (IllegalBlockSizeException ex) {  
            System.out.println(ex);  
        } catch (BadPaddingException ex) {  
            System.out.println(ex);  
        } catch (InvalidKeyException ex) {  
            System.out.println(ex);  
        } catch (FileNotFoundException ex) {  
            System.out.println(ex);  
        } catch (IOException ex) {  
            System.out.println(ex);  
        }  
    }  
    public byte[] encryptText(String plainText) {  
        byte[] cipherBytes = null;  
        try {  
             // Initialize the cipher for encryption 
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);  
             // Convert the text string to byte format 
            byte[] plainBytes = plainText.getBytes();  
            // Perform encryption with method doFinal() 
            cipherBytes = cipher.doFinal(plainBytes);  
        } catch (IllegalBlockSizeException ex) {  
            System.out.println(ex);  
        } catch (BadPaddingException ex) {  
            System.out.println(ex);  
        } catch (InvalidKeyException ex) {  
            System.out.println(ex);  
        }  
  
        return cipherBytes;  
    }  
 // Method for Decryption
    public String decryptText(byte[] cipherBytes) {  
        String plainText = null;  
        try {  
            //  Initialize the cipher for decryption 
            cipher.init(Cipher.DECRYPT_MODE, secretKey);  
             // Perform decryption with method doFinal() 
              
            byte[] plainBytes = cipher.doFinal(cipherBytes);  
             // Convert encrypted text to string format   
            plainText = new String(plainBytes);  
        } catch (IllegalBlockSizeException ex) {  
            System.out.println(ex);  
        } catch (BadPaddingException ex) {  
            System.out.println(ex);  
        } catch (InvalidKeyException ex) {  
            System.out.println(ex);  
        }  
  
        return plainText;  
    }   
      public static void main(String[] args) {  
	    String fileToEncrypt = "Cell Structure_new audio.mp4";  
	    String encryptedFile = "Cell Structure_new audio.encrypt";  
	    String decryptedFile = "decryptedFile.mp4";  
	    String directoryPath = "E:/";  
	    EncryptFile encrypt = new EncryptFile();   
	   
	    System.out.println("Starting Encryption...");  
	    encrypt.encryptFile(directoryPath + fileToEncrypt,directoryPath + encryptedFile);  
	    System.out.println("Encryption completed...");  
	    System.out.println("Starting Decryption...");  
	    encrypt.decryptFile(directoryPath + encryptedFile,  directoryPath + decryptedFile);  
	    
	    System.out.println("Decryption completed...");            
      }  
}  
