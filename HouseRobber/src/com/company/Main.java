package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return nums[0] > nums[1] ? nums[0]:nums[1];
        } else {
            int a = nums[0], b = nums[0] > nums[1] ? nums[0]:nums[1], c = 0;
            for(int i = 2; i < nums.length; i++) {
                c = a + nums[i] > b ? a + nums[i] : b;
                a = b;
                b = c;
            }
            return c;
        }
    }

}
