/*
Given an array of ints length 3, return
an array with the elements "rotated
left" so {1, 2, 3} yields {2, 3, 1}.
*/

public class RotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {
        int[] x = {nums[1], nums[2], nums[0]};
        return x;
      }
           

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        System.out.println(ArrayToString.stringify(rotateLeft3(arr1)) + "...expecting 2, 3, 1");

        int[] arr2 = {5,11,9};
        System.out.println(ArrayToString.stringify(rotateLeft3(arr2)) + "...expecting 11, 9, 5");
        
        int[] arr3 = {7,0,0};
        System.out.println(ArrayToString.stringify(rotateLeft3(arr3)) + "...expecting 0, 0, 7");

    }
      
}
