/*
Given an array of ints, return true if
6 appears as either the first or last
element in the array. The array will be
length 1 or more.
*/
public class FirstLast6 {
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,6};
        System.out.println(firstLast6(arr1) + "...expecting true");

        int[] arr2 = {6,1,2,3};
        System.out.println(firstLast6(arr2) + "...expecting true");
        
        int[] arr3 = {13, 6,1,2,3};
        System.out.println(firstLast6(arr3) + "...expecting false");

    }
}