package com.company;

public class Main {

    public static void main(String[] args) {
        byte[] barcode = "S111111111111111".getBytes();
        byte[] date = "20160414".getBytes();
//        for(int a = 0; a < barcode.length; a++) {
//            System.out.println("barcode "+a+": "+barcode[a]);
//        }
//        for(int a = 0; a < date.length; a++) {
//            System.out.println("date "+a+": "+date[a]);
//        }
        System.out.println(bytesToHexString(barcode));
        System.out.println(bytesToHexString(date));

    }

    //字符序列转换为16进制字符串
    private static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        char[] buffer = new char[2];
        for (int i = 0; i < src.length; i++) {
            buffer[0] = Character.forDigit((src[i] >>> 4) & 0x0F, 16);
            buffer[1] = Character.forDigit(src[i] & 0x0F, 16);

            stringBuilder.append(buffer);

        }
        return stringBuilder.toString();
    }
}
