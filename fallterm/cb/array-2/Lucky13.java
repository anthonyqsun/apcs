/*
Given an array of ints, return true if
the array contains no 1's and no 3's.
*/

public class Lucky13 {
    public static boolean lucky13(int[] nums) {
        for (int num : nums) {
          if (num == 1 || num == 3) return false;
        }
        return true;
      }
      
      
      
    public static void main(String[] args) {
        int[] arr1 = {0,2,4};
        System.out.println(lucky13(arr1) + "...expecting true");

        int[] arr2 = {1,2,3};
        System.out.println(lucky13(arr2) + "...expecting false");
        
        int[] arr3 = {1,2,4};
        System.out.println(lucky13(arr3) + "...expecting false");

    }
      
}
