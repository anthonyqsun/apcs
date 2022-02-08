/*
Given an array of ints, return true if
the array contains a 2 next to a 2
somewhere.
*/

public class Has22 {
    public static boolean has22(int[] nums) {
        boolean prevTwo=false;
        for (int num : nums) {
          if (prevTwo) {
            if (num == 2) return true;
            prevTwo = false;
          }
          else {
            if (num == 2) prevTwo = true;
          }
        }
        return false;
    }
      
      
    public static void main(String[] args) {
        int[] arr1 = {1,2,2};
        System.out.println(has22(arr1) + "...expecting true");

        int[] arr2 = {1,2,1,2};
        System.out.println(has22(arr2) + "...expecting false");
        
        int[] arr3 = {2,1,2};
        System.out.println(has22(arr3) + "...expecting false");

    }
      
}
