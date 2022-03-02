/*
Return the "centered" average of an
array of ints, which we'll say is the
mean average of the values, except
ignoring the largest and smallest
values in the array. If there are
multiple copies of the smallest value,
ignore just one copy, and likewise for
the largest value. Use int division to
produce the final average. You may
assume that the array is length 3 or
more.
*/

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        
        for (int num : nums) {
          smallest = Math.min(smallest, num);
          largest = Math.max(largest, num);
        }
        
        int sum = 0;
        for (int num : nums) {
          sum+=num;
        }
        
        return (sum-largest-smallest) / (nums.length-2);
      }
      
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 100};
        System.out.println(centeredAverage(arr1) + "...expecting 3");

        int[] arr2 = {1, 1, 5, 5, 10, 8, 7};
        System.out.println(centeredAverage(arr2) + "...expecting 5");
        
        int[] arr3 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(arr3) + "...expecting -3");

    }
      
}
