package com.company;

public class Main {

    public static void main(String[] args) {
        int a[]  = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        else {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] + sum <= nums[i]) {
                    sum = nums[i];
                } else {
                    sum = nums[i] + sum;
                }
                if(sum > max)
                    max = sum;
            }
            return max;
        }
    }




}
