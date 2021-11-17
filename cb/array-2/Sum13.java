/*
Return the sum of the numbers in the
array, returning 0 for an empty array.
Except the number 13 is very unlucky,
so it does not count and numbers that
come immediately after a 13 also do not
count.
*/

public class Sum13 {
    public static int sum13(int[] nums) {
        int sum = 0;
        boolean lucky = true;
        for (int num : nums) {
          if (num ==13) {
            lucky = false;
            continue;
          }
          if (lucky) {
            sum += num;
          }
          else {
            lucky = true;
          }  
        }
        return sum;
      }
      
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        System.out.println(sum13(arr1) + "...expecting 6");

        int[] arr2 = {1,1};
        System.out.println(sum13(arr2) + "...expecting 2");
        
        int[] arr3 = {1,2,2,1,13};
        System.out.println(sum13(arr3) + "...expecting 6");

    }
      
}
