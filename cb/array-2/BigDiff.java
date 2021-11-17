/*
Given an array length 1 or more of
ints, return the difference between the
largest and smallest values in the
array. Note: the built-in Math.min(v1,
v2) and Math.max(v1, v2) methods return
the smaller or larger of two values.
*/

public class BigDiff {
    public static int bigDiff(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        
        for (int num : nums) {
          smallest = Math.min(smallest, num);
          largest = Math.max(largest, num);
        }
        return largest-smallest;
      }
               

    public static void main(String[] args) {
        int[] arr1 = {10,3,5,6};
        System.out.println(bigDiff(arr1) + "...expecting 7");

        int[] arr2 = {7, 2, 10, 9};
        System.out.println(bigDiff(arr2) + "...expecting 8");
        
        int[] arr3 = {2, 10, 7, 2};
        System.out.println(bigDiff(arr3) + "...expecting 8");

    }
      
}
