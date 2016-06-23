package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(countNumbersWithUniqueDigits(3));
    }

    public static int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[11];
        int sum = 10;
        dp[0] = 1;
        dp[1] = 10;
        for(int i = 2; i <= 10; i++) {
            int pow = 9;
            int temp = 9;
            int j = i;
            while(--j > 0) {
                pow *= temp;
                temp--;
            }
            sum += pow;
            dp[i] = sum;
        }
        if(n <= 10) {
            return dp[n];
        } else {
            return 0;
        }
    }
}
