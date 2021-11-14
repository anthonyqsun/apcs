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

  public static String[] stringifyArray(int[] arr) {
    String[] out = new String[arr.length];
    for(int i = 0; i < out.length; i++) {
      out[i] = "" +  arr[i];
    }
    return out;
  }

  public static int arrayLinSearchIter(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int arrayLinSearchR(int[] arr, int target) {
    if (arr[0] == target) {
      return 
    }
  }

  public static String convertStringArray(String[] arr) {
    String out = "";
    for (String e : arr) {
      out += e + ", ";
    }
    return out.substring(0,out.length()-2);
  }

  public static void main(String[] args) {
    populate(1000);
    System.out.println("pops worked");
    System.out.println(convertStringArray(stringifyArray(randomInts)));
  }
}
