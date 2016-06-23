public class Main {

    public static void main(String[] args) {
        int[] a = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(a));
    }

    public static int lengthOfLIS(int[] nums) {
        int size = nums.length;
        if(size == 0) {
            return 0;
        }
        int[] length = new int[size];
        for(int i = 0; i < size; i++) {
            length[i] = 1;
        }
        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(nums[j] > nums[i]) {
                    length[j] = Math.max(length[j], length[i]+1);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < size; i++) {
            if(length[i] > max) {
                max = length[i];
            }
        }
        return max;
    }
}
