package com.company;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String msg = "0123456789012345";
        System.out.println("【加密前】：" + msg);

        //加密
        byte[] secretArr = EncryptionUtil.encryptMode(msg.getBytes());
        System.out.println("【加密后】：");
        for(int i : secretArr) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

//        //解密
//        byte[] myMsgArr = EncryptionUtil.decryptMode(secretArr);
//        System.out.println("【解密后】：" + new String(myMsgArr));
    }
}
