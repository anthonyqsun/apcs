/*
Return the sum of the numbers in the
array, except ignore sections of
numbers starting with a 6 and extending
to the next 7 (every 6 will be followed
by at least one 7). Return 0 for no
numbers.
*/

public class Sum67 {
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean afterSix = false;
        for (int num : nums) {
          if (num == 6) {
            afterSix = true;
            continue;
          }
          if (afterSix) {
            if (num == 7) {
              afterSix=false;
            }
          }
          else {
            sum += num;
          }
            
        }
        return sum;
      }
      
      
    public static void main(String[] args) {
        int[] arr1 = {1,2,2};
        System.out.println(sum67(arr1) + "...expecting 5");

        int[] arr2 = {1,2,2,6,99,99,7};
        System.out.println(sum67(arr2) + "...expecting 5");
        
        int[] arr3 = {1,1,6,7,2};
        System.out.println(sum67(arr3) + "...expecting 4");

    }
      
}
