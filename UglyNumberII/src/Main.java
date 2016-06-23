import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(14));
    }

    public static int nthUglyNumber(int n) {
        List<Integer> num2List = new ArrayList<Integer>();
        List<Integer> num3List = new ArrayList<Integer>();
        List<Integer> num5List = new ArrayList<Integer>();
        num2List.add(1);
        num3List.add(1);
        num5List.add(1);
        int min = 0;
        for(int i = 0; i < n; i++) {
            min = Math.min(Math.min(num2List.get(0), num3List.get(0)), num5List.get(0));
            if(num2List.get(0) == min) {
                num2List.remove(0);
            }
            if(num3List.get(0) == min) {
                num3List.remove(0);
            }
            if(num5List.get(0) == min) {
                num5List.remove(0);
            }
            num2List.add(min*2);
            num3List.add(min*3);
            num5List.add(min*5);
        }
        return min;
    }
}
