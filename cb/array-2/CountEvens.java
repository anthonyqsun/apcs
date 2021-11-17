/*
Return the number of even ints in the
given array. Note: the % "mod" operator
computes the remainder, e.g. 5 % 2 is 1.
*/

public class CountEvens {
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int element : nums) {
          if (element%2==0) {
            count++;
          }
        }
        return count;
      }           

    public static void main(String[] args) {
        int[] arr1 = {2,1,2,3,4};
        System.out.println(countEvens(arr1) + "...expecting 3");

        int[] arr2 = {2,2,0};
        System.out.println(countEvens(arr2) + "...expecting 3");
        
        int[] arr3 = {1,3,5};
        System.out.println(countEvens(arr3) + "...expecting 0");

    }
      
}
