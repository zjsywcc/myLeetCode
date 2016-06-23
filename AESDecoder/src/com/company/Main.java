package com.company;

import java.security.Key;


public class Main {

    public static void main(String[] args) {
        byte[] key = EncryptionUtil.initSecretKey();
        System.out.println("key："+EncryptionUtil.showByteArray(key));

        Key k = EncryptionUtil.toKey(key);

        String data ="1234567890123456";
        System.out.println("加密前数据: string:"+data);
        System.out.println("加密前数据: byte[]:"+EncryptionUtil.showByteArray(data.getBytes()));
        System.out.println();
        byte[] encryptData = new byte[0];
        try {
            encryptData = EncryptionUtil.encrypt(data.getBytes(), k);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("加密后数据: byte[]:"+EncryptionUtil.showByteArray(encryptData));
        System.out.println("加密后数据: hexStr:"+Hex.encodeHexStr(encryptData));
        System.out.println();
        byte[] decryptData = new byte[0];
        try {
            decryptData = EncryptionUtil.decrypt(encryptData, k);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("解密后数据: byte[]:"+EncryptionUtil.showByteArray(decryptData));
        System.out.println("解密后数据: string:"+new String(decryptData));
    }
}
