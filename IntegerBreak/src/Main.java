public class Main {

    public static void main(String[] args) {
        System.out.println(integerBreak(44));
    }

    public static int integerBreak(int n) {
        int max = Integer.MIN_VALUE;
        int d = 0;
        for(int i = 2; i <= n; i++) {
            int pow = 1;
            for(int j = 0; j < i; j++) {
                if(j < i-1) {
                    pow *= closeNum(n, i);
                } else {
                    pow *= n - closeNum(n, i) * (i-1);
                }
            }
            if(pow > max) {
                max = pow;
                d = i;
            }
        }
        System.out.println("d: "+d);
        return max;
    }

    public static int closeNum(int n, int m) {
        if((n/m+1)*(m-1) < n) {
            return Math.abs(n/m * m - n) < Math.abs((n/m +1) * m - n) ? n/m : n/m +1;
        } else {
            return n/m;
        }
    }
}
