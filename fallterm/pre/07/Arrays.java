import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        double[] a = {1.0,1.5,5.0};
        printArray(powArray(a, 2));
        printArray(histogram(generateHistogram(1000),10));
        printArray(histogram(generateHistogram(1000),20));
        int[] b = {3,4,123,1,-1,2};
        System.out.println(indexOfMax(b));
        printArray(sieve(100));
    }

    
    public static void printArray(double[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    public static void printArray(String[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    public static void printArray(int[] a) { // method overloading
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    public static void printArray(boolean[] a) { // method overloading
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    public static double[] powArray(double[] a, double power) {
        
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], power);
        }
        return a;
    }

    public static int inRange(int[] a, int low, int high) { // inclusive low bound, inclusive high bound, function provided by book (changed exclusive high bound to inclusive high bound to work better)
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] <= high) {
                count++;
            }
        }
        return count;
    }

    public static int[] generateHistogram(int size) {
        Random random = new Random();
        int[] scores = new int[size];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(100);
        }
        return scores;
    }

    public static String[] histogram(int[] scores, int counters) {
        // only takes "counters" inputs that evenly divide 100


        String[] counts = new String[counters]; //number of counters in histogram; made string to have more clear output.
        int interval = 100/counters; // 100/10=10 <- example

        for(int i = 0; i < counters; i++) { //counters = counts.length
            int inclusiveLowBound = i*interval+1;
            int inclusiveHighBound = interval*(i+1);
            counts[i] = inclusiveLowBound+"-"+inclusiveHighBound+": "+inRange(scores, inclusiveLowBound, inclusiveHighBound);
        }

        return counts;
    }

    public static int indexOfMax(int[] a) {
        int max=a[0];
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max=a[i];
                maxIndex=i;
            }
        }
        return maxIndex;
        // This method is not possible with an enhanced for loop, because we lose the ability to access the index of an element
    }
    
    public static boolean[] sieve(int n) {
        int[] numList = new int[n];
        boolean[] boolout = new boolean[n]; // from testing, all values start at false
        
        for (int i=0; i < boolout.length; i++) {
            numList[i] = i; // sets number list to numbers 0 to n-1
        }

        for (int i = 2; i < boolout.length; i++) { // sets all values to true
            boolout[i] = true;
        }

        for (int i : numList) { // for loop index, except it's seperate from boolout so boolout updates

            boolean isPrimeNum = boolout[i];
            if (isPrimeNum) { // chooses a prime number
                for (int x : numList) { // for each
                    if (x > i && x % i == 0) {
                        boolout[x]=false; //sieve TURNS OUT THE PROBLEM WAS THIS SHOULDVE BEEN "X", NOT "I"
                    }
                }
            }
            

            // if (boolout[i]) { // checks if number has not been sieved. i is the index of number as well as the number itself
            //     for (int adder = 0; adder < boolout.length; adder++) {
            //         isMultiple = adder % i == 0 && adder!=0 && adder!=1 && adder != i;
            //         if (isMultiple) {
            //             boolout[i] = false;
            //             // System.out.print(adder); //debug
            //         }
            //         // System.out.print("after: "); //debug
            //         // printArray(boolout); //debug
            //     }
            //     // if (isMultiple) {
            //     //     boolout[i] = true;
            //     // }
            //     // isMultiple=false;
            //     // break;
            // }
            
            // printArray(boolout); //debug
            
        }
        return boolout;
    }
}
