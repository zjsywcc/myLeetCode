package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {2,6,8,7,8,7,9,4,1,2,4,5,8};
	    System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if(len <= 1)
            return 0;
        int[] sell = new int[len];
        sell[0] = 0;
        int[] buy = new int[len];
        buy[0] = - prices[0];
        for(int i = 1; i < len; i++) {
            sell[i] = Math.max(buy[i - 1] + prices[i], sell[i - 1]);
            if(i > 1) {
                buy[i] = Math.max(sell[i - 2] - prices[i], buy[i - 1]);
            } else {
                buy[i] = Math.max(- prices[i], buy[i - 1]);
            }
        }
        return sell[len - 1];
    }
}
