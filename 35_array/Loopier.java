/* NYAH - Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker;
 * APCS pd06
 * HW34: arrays
 * 2021-11-15
 * time spent: 0.5 hrs
 *
 * DISCOS:
 * 1) linSearchR was possible without a helper method
 * 2) The JavaVisualizer is very helpful
 * 3) Our implementation was recursive even though we used a helper procedure since we broke it down
 *    into smaller problems to solve a more complex problem.
 * QCC:
 * 1) How can we determine if there is a way to solve a problem with recursion (without helper procedures)?
 * 2) Is it bad to use a helper procedure when a problem can be done without one?
*/

public class Loopier {
  static int[] randomInts = new int[10];

  public static void populate() {
    populate(10);
  }

  public static void populate(int range) {
    for(int i = 0; i < randomInts.length; i++) {
      randomInts[i] = (int) (Math.random()*range);
    }
  }

  public static String[] stringifyArray(int[] a) {
    String[] out = new String[a.length];
    for(int i = 0; i < out.length; i++) {
      out[i] = "" +  a[i];
    }
    return out;
  }

  public static int linSearch(int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return i;
      }
    }
    return -1;
  }
  public static int linSearchR(int[] a, int target) {
    return linSearchRHelper(a, target, 0);
  }

  private static int linSearchRHelper(int[] a, int target, int index){
    if (index > a.length - 1){
      return -1;
    }
    if (a[index] == target){
      return index;
    }
    else{
      return linSearchRHelper(a,target,index+1);
    }
  }

  public static int freq(int[] a, int target) {
    int counter =0;
    for(int e : a) {
      if (e==target) {
        counter++;
      }
    }
    return counter;
  }

  public static int freqRec(int[] a, int target) {
    if (a.length==1) {
      if (a[0] == target)
        return 1;
      else
        return 0;
    }
    int inc;
    if (a[0]==target) {
      inc = 1;
    }
    else {
      inc = 0;
    }

    int[] newArr = new int[a.length-1];
    // new array of a length one less than the input array
    for(int i = 1; i <= a.length-1; i++){
      newArr[i-1] = a[i];
    }

    return inc + freq(newArr, target);
  }

  public static String convertStringArray(String[] a) {
    String out = "";
    for (String e : a) {
      out += e + ", ";
    }
    return out.substring(0,out.length()-2);
  }

  public static void main(String[] args) {
    populate(10);
    System.out.println(convertStringArray(stringifyArray(randomInts)));
    System.out.println("Randomly generated list of positive ints under 10:");
    System.out.println("");
    System.out.println(linSearch(randomInts, 5));
    System.out.println(linSearchR(randomInts, 5));
    System.out.println("");
    System.out.println(freq(randomInts, 5));
    System.out.println(freqRec(randomInts, 5));
  }
}
