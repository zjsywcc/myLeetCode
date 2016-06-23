package com.company;

import java.security.AlgorithmParameters;

public class Main {

    public static void main(String[] args) {
        //明文
        String plainTextString = "Hello,Bouncy Castle";
        System.out.println("明文 : "+plainTextString);
        byte[] key;
        try {
            //初始化密钥
            key = generateKey();
            //初始化iv
            AlgorithmParameters iv = generateIV();
            System.out.println("密钥 : ");
            //打印密钥
            for (int i = 0; i < key.length; i++) {
                System.out.printf("%x", key[i]);
            }
            System.out.println();

            //进行加密
            byte[] encryptedData = encrypt(plainTextString.getBytes(), key,iv);
            //输出加密后的数据
            System.out.println("加密后的数据 : ");
            for (int i = 0; i < encryptedData.length; i++) {
                System.out.printf("%x", encryptedData[i]);
            }
            System.out.println();

            //进行解密
            byte[] data = decrypt(encryptedData, key,iv);
            System.out.println("解密得到的数据 : " + new String(data));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
