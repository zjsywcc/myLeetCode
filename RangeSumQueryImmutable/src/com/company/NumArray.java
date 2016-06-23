package com.company;

public class NumArray {

    public static void main(String[] args) {
	    int nums[] = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 5));
    }


    int save[];


    public NumArray(int[] nums) {
        save = new int[nums.length + 1];
        save[0] = 0;
        int sum = 0;
        for(int i = 1; i <= nums.length; i++) {
            sum += nums[i - 1];
            save[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return save[j + 1] - save[i];
    }


}
