package com.company;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by wcc on 2016/4/25.
 */
public class EncryptionUtil {
    private String SHARED_KEY = "";
    static final String HEXES = "0123456789ABCDEF";
    public byte[] encrypt(byte[] plainTextBytes) throws Exception {

        byte[] keyValue = Hex.decodeHex(SHARED_KEY.toCharArray());



        final SecretKey key = new SecretKeySpec(keyValue, "DESede");
        final Cipher cipher = Cipher.getInstance("DESede/ECB/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, key);


        final byte[] cipherText = cipher.doFinal(plainTextBytes);


        return cipherText;
    }

    public String decrypt(byte[] message) throws Exception {
        byte[] keyValue = Hex.decodeHex(SHARED_KEY.toCharArray());



        final SecretKey key = new SecretKeySpec(keyValue, "DESede");
        final Cipher decipher = Cipher.getInstance("DESede/ECB/NoPadding");
        decipher.init(Cipher.DECRYPT_MODE, key);


        final byte[] plainText = decipher.doFinal(message);

        return getHex(plainText);
    }



    public static String getHex( byte [] raw ) {
        if ( raw == null ) {
            return null;
        }
        final StringBuilder hex = new StringBuilder( 2 * raw.length );
        for ( final byte b : raw ) {
            hex.append(HEXES.charAt((b & 0xF0) >> 4))
                    .append(HEXES.charAt((b & 0x0F)));
        }
        return hex.toString();
    }
}
