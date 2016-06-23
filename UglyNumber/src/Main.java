public class Main {

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int num) {
        if(num == 0) {
            return false;
        }
        if(num == 1) {
            return true;
        }
        while(divide(num) != -1) {
            num = divide(num);
        }
        if(num != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static int divide(int num) {
        if(num % 2 == 0) {
            return num / 2;
        } else if(num % 3 == 0){
            return num / 3;
        } else if(num % 5 == 0) {
            return num / 5;
        } else {
            return -1;
        }
    }
}
