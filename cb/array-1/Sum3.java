/*
Given an array of ints length 3, return
the sum of all the elements.
*/
public class Sum3 {
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
      }      

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        System.out.println(sum3(arr1) + "...expecting 6");

        int[] arr2 = {5,11,2};
        System.out.println(sum3(arr2) + "...expecting 18");
        
        int[] arr3 = {7,0,0};
        System.out.println(sum3(arr3) + "...expecting 7");

    }
      
}
