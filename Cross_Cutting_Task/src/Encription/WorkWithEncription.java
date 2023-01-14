package Encription;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import static readers.TxtFileReaderAndWriter.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;


public class WorkWithEncription {
    public static void Encripted(String inputFileName) throws IOException, NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> mem = new ArrayList<>();
        ReadPlaneTxt(inputFileName, arr);

        Cipher cipher = Cipher.getInstance("AES");
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        SecretKey key = kgen.generateKey();
        cipher.init(Cipher.ENCRYPT_MODE, key);
            for(int i = 0; i < arr.size(); ++i) {
                String m = "a";
                byte[] bytes = cipher.doFinal(arr.get(i).getBytes());
                for(byte b : bytes){
                    m += b;
                }
               m = m.substring(1);
                mem.add(m);
            }
            WritePlaneTxt(inputFileName, mem);
        }


    public static void Encripted(String key, String inputFileName, String outputFileName){
        try {
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);
            Key secretKey = new SecretKeySpec(Arrays.copyOf(key.getBytes(), 128), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = inputStream.readAllBytes();
            byte[] outputBytes;
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputBytes = cipher.doFinal(inputBytes);
            outputStream.write(Base64.getEncoder().encode(outputBytes));

            outputStream.close();
            inputStream.close();
        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                 | InvalidKeyException | BadPaddingException
                 | IllegalBlockSizeException | IOException ex) {
        }
    }

    public static void Decripted(String key, String inputFileName, String outputFileName){
        try {
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);
            Key secretKey = new SecretKeySpec(Arrays.copyOf(key.getBytes(), 128), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = inputStream.readAllBytes();
            byte[] outputBytes;
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputBytes = cipher.doFinal(Base64.getDecoder().decode(inputBytes));
            outputStream.write(outputBytes);

            outputStream.close();
            inputStream.close();
        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                 | InvalidKeyException | BadPaddingException
                 | IllegalBlockSizeException | IOException ex) {
        }
    }

}
