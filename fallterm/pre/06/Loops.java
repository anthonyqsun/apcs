public class Loops {
    public static void main(String[] args) {
        System.out.println(myexp(1,4));
        double[] checkValues = {0.1,1.0,10.0,100.0,0.1,-1.0,-10.0,-100.0}; // accuracy falls off significantly after 10 and -10
        // can also be done with for loop and multiplying by 10;
        for (double element:checkValues) {
            check(element);
        }
    }

    public static double iterativePower(double x, int n) {
        double product = 1;
        for (int i=1; i <= n; i++) {
            product = product*x;
        }
        return product;
    }

    public static int iterativeFactorial(int n) {
        int product = 1;
        for (int i=1; i<=n; i++) {
            product = product*i;
        }
        return product;
    }

    public static double myexp(double x, int n) {
        // double sum = 0.0;
        // for (int i=0; i<=n; i++) {
        //     sum = sum + iterativePower(x,i)/iterativeFactorial(i);
        // }
        // return sum;
        double sum = 1;
        double predecessor = 1;
        for (double i = 1; i<=n; i++) { // OMG this way is so much simpler
            predecessor = predecessor*x/i;
            sum=sum+predecessor;
        }
        return sum;
    }

    public static void check(double x) {
        System.out.println(x + "\t" + myexp(x, 4) + "\t" + Math.exp(x));
    }
}
