package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {3,2,6,5,0,3};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int[] lSave = new int[prices.length];
        int[] rSave = new int[prices.length];
        int minL = Integer.MAX_VALUE, maxR = Integer.MIN_VALUE;
        int sumL = 0, sumR = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minL) {
                minL = prices[i];
            }
            if(prices[i] - minL > sumL) {
                sumL = prices[i] - minL;
            }
            lSave[i] = sumL;
        }
        for(int i = prices.length - 1; i >= 0; i--) {
            if(prices[i] > maxR) {
                maxR = prices[i];
            }
            if(maxR - prices[i] > sumR) {
                sumR = maxR - prices[i];
            }
            rSave[i] = sumR;
        }
        int maxProfit = 0;
        for(int i = 0, j = 1; i < prices.length - 1 && j < prices.length; i++, j++) {
            if(lSave[i] + rSave[j] > maxProfit) {
                maxProfit = lSave[i] + rSave[j];
            }
        }
        return maxProfit > lSave[prices.length - 1] ? maxProfit : lSave[prices.length - 1];
    }


}
