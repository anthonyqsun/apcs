/*
Given an array of ints, return true if
the array is length 1 or more, and the
first element and the last element are
equal.
*/

public class SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        return nums.length>0 && nums[0] == nums[nums.length-1];
      }
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        System.out.println(sameFirstLast(arr1) + "...expecting false");

        int[] arr2 = {1,2,3,1};
        System.out.println(sameFirstLast(arr2) + "...expecting true");
        
        int[] arr3 = {1,2,1};
        System.out.println(sameFirstLast(arr3) + "...expecting true");
    }
}
