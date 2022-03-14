package com.mumz.learn.design.patterns.strategy.excercise;

import javax.crypto.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class DESEncrypter implements Encrypter {

    private Cipher cipher;

    public DESEncrypter() {
        generateKey();
    }

    @Override
    public String encrypt(final String message) {
        System.out.println("Encrypting message using DES");
        try {
            return Base64.getEncoder()
                         .encodeToString(cipher.doFinal(message.getBytes(StandardCharsets.UTF_8)));
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return message;
    }

    private void generateKey() {
        try {
            SecretKey key = KeyGenerator.getInstance("DES").generateKey();
            cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
