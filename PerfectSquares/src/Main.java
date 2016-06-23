public class Main {

    public static void main(String[] args) {
        System.out.println("numSquares"+numSquares(13));
    }

    public static int numSquares(int n) {
        if(n == 0) {
            return 0;
        }
        int d[] = new int[n+1];
        d[0] = 0;
        int count = 1;
        for(int i = 1; i <= n; i++) {
            if(i == count * count) {
                d[i] = 1;
                count++;
            } else {
                int min = Integer.MAX_VALUE;
                for(int j = 1; j <= i/2; j++) {
                    if(d[j] + d[i-j] < min) {
                        min = d[j] + d[i-j];
                    }
                }
                d[i] = min;
            }
        }
        return d[n];
    }
}
