package com.company;



public class Main {


    public static void main(String[] args) {
        int[] a = {1, 2};
        System.out.println(maxProfit(1, a));
    }

    public static int maxProfit(int k, int[] prices) {
        int length = prices.length;
        if(k > length/2)
            return maxProfitOne(prices);
        Integer[] dp = new Integer[2 * k + 1];
        for(int i = 0; i <= length; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        int[] BorS = {1, -1};
        dp[0] = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 1; j <= Math.min(2 * k, i + 1); j++) {
                dp[j] = Math.max(dp[j], dp[j - 1] + BorS[j%2] * prices[i]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < dp.length; i++) {
            if(dp[i] > max)
                max = dp[i];
        }
        return max;
    }

    public static int maxProfitOne(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int sum = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }





}
