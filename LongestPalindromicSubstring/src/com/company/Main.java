package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbabba"));
    }

    public static String longestPalindrome(String s) {
        if(s.equals("")) {
            return "";
        }
        if(s.length() == 1) {
            return s;
        }
        String str[] = new String[s.length()];
        String str1[] = new String[s.length()];
        String strMax = "";
        for(int i = 0; i < s.length(); i++) {
            if (i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                str[i] = Character.toString(s.charAt(i));
                for(int j = i, k = i; j >= 0 && k < s.length(); j--, k++) {
                    if(s.charAt(j) == s.charAt(k) && j != k) {
                        str[i] = s.charAt(j) + str[i] + s.charAt(k);
                    }
                }
                if(str[i].length() > strMax.length()) {
                    strMax = str[i];
                }
            } else {
                str1[i] = "";
                for(int j = i, k = i + 1; j >= 0 && k < s.length(); j--, k++) {
                    if(s.charAt(j) == s.charAt(k)) {
                        str1[i] = s.charAt(j) + str1[i] + s.charAt(k);
                    }
                }
                if(str1[i].length() > strMax.length()) {
                    strMax = str1[i];
                }
            }
        }

        return strMax;
    }
}
