import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] a = {0 ,-2, 0};
        System.out.println(maxProduct(a));
    }

    public static int maxProduct(int[] nums) {
        int size = nums.length;
        boolean zeroFlag = false;
        if(size == 1) {
            return nums[0];
        }
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < size; i++) {
            if(nums[i] != 0) {
                arrayList.add(nums[i]);
            } else {
                zeroFlag = true;
                if(arrayList.size() > 0) {
                    arrayLists.add(arrayList);
                }
                arrayList = new ArrayList<Integer>();
            }
        }
        if(arrayList.size() > 0) {
            arrayLists.add(arrayList);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arrayLists.size(); i++) {
            arrayList = arrayLists.get(i);
            int nCount = 0;
            boolean flag = false;
            int lIndex = 0;
            int rIndex = 0;
            int pow = 1;
            int lpow = 1;
            int rpow = 1;
            for(int j = 0; j < arrayList.size(); j++) {
                pow *= arrayList.get(j);
                if(!flag) {
                    lpow *= arrayList.get(j);
                }
                if(arrayList.get(j) < 0) {
                    if(!flag) {
                        lIndex = j;
                        flag = true;
                    }
                    nCount++;
                    rIndex = j;
                }
            }
            for(int k = rIndex; k < arrayList.size(); k++) {
                rpow *= arrayList.get(k);
            }
            int temp;
            if(nCount%2 == 0) {
                temp = pow;
            } else {
                temp = Math.max(pow / lpow, pow / rpow);
            }
            if(arrayList.size() == 1) {
                temp = arrayList.get(0);
            }
            if(temp > max) {
                max = temp;
            }
        }
        return zeroFlag ? Math.max(0, max) : max;
    }
}
