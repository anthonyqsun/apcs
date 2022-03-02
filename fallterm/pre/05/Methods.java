public class Methods {
    public static void main(String[] args) {
        System.out.println(isDivisible(6, 2));
        System.out.println(isDivisible(6, 4));
        System.out.println(isTriangle(3, 4, 5));
        System.out.println(isTriangle(3, 4, 700));
        System.out.println(ack(1,1));
        System.out.println(ack(2,3));
    }

    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a+b > c && a+c > b && b+c > a) {
            return true;
        }
        return false;
    }

    public static int ack(int m, int n) {
        if (m < 0 || n < 0) {
            return -1;
        }
        else if (m==0) {
            return n+1; // spent 20 minutes figuring out that i forgot my return statement. damn.
        }
        else if (n==0) { // m>0 case not needed because of negative check
            return ack(m-1,1);
        }
        return ack(m-1,ack(m,n-1)); //if reached, m and n are always > 0.

    }
}
