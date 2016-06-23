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
            return nums[1];
        } else if(nums.length == 2) {
            return nums[0] > nums[1] ? nums[0]:nums[1];
        } else {
            int a = nums[0], b = nums[0] > nums[1] ? nums[0]:nums[1], c = 0;
            int visit[] = new int[nums.length];
            for(int i = 0; i < nums.length; i++) {
                visit[i] = 0;
            }
            int i = 2;
            while(visit[i] == 0) {
                if( a + nums[i] > b) {
                    c = a + nums[i];
                    visit[]
                }
                a = b;
                b = c;
            }
            return c;
        }
    }
}
