/*
Given an array of ints, return true if
the sum of all the 2's in the array is
exactly 8.
*/

public class Sum28 {
    public static boolean sum28(int[] nums) {
        int count = 0;
        
        for (int element : nums) {
          if (element==2) {
            count++;
          }
        }
        return (count==4);
      }      
      
      
    public static void main(String[] args) {
        int[] arr1 = {2,3,2,2,4,2};
        System.out.println(sum28(arr1) + "...expecting true");

        int[] arr2 = {2,3,2,2,4,2,2};
        System.out.println(sum28(arr2) + "...expecting false");
        
        int[] arr3 = {1,2,3,4};
        System.out.println(sum28(arr3) + "...expecting false");

    }
      
}
