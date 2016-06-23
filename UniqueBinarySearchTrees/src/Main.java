public class Main {

    public static void main(String[] args) {
        System.out.println("numTrees"+numTrees(3));
    }

    public static int numTrees(int n) {
        if(n == 0) {
            return 0;
        }
        int d[] = new int[n+1];
        d[0] = 1;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = 1; j <= i; j++)

            d[i] = sum;
        }
        return d[n];
    }
}
