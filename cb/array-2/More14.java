/*
Given an array of ints, return true if
the number of 1's is greater than the
number of 4's
*/

public class More14 {
    public static boolean more14(int[] nums) {
        int oneCount = 0;
        int fourCount = 0;
        for (int num : nums) {
          if (num == 1) oneCount ++;
          if (num == 4) fourCount ++;
        }
        return oneCount > fourCount;
      }
         
      
    public static void main(String[] args) {
        int[] arr1 = {1,4,1};
        System.out.println(more14(arr1) + "...expecting true");

        int[] arr2 = {1,4,1,4};
        System.out.println(more14(arr2) + "...expecting false");
        
        int[] arr3 = {1,1};
        System.out.println(more14(arr3) + "...expecting true");

    }
      
}
