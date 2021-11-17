/*
Given an array of ints, return true if
every element is a 1 or a 4.
*/

public class Only14 {
    public static boolean only14(int[] nums) {
        for (int num : nums) {
          if ((num == 1 || num == 4)) {
            continue;
          }
          else {
            return false;
          }
        }
        return true;
      }
              

    public static void main(String[] args) {
        int[] arr1 = {1,4,1,4};
        System.out.println(only14(arr1) + "...expecting true");

        int[] arr2 = {1,4,2,4};
        System.out.println(only14(arr2) + "...expecting false");
        
        int[] arr3 = {1,1};
        System.out.println(only14(arr3) + "...expecting true");

    }
      
}
