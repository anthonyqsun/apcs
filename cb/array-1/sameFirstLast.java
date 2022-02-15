/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*/

public class sameFirstLast {
	public static boolean sameFL(int[] nums) {
		return ((nums.length != 0) && (nums[0] == nums[nums.length-1]));
  }

	public static void main(String[] args) {
		int[] test0 = {1,2,3};
		int[] test1 = {1,2,3,1};
		int[] test2 = {1,2,1};

		System.out.println(sameFL(test0));
		System.out.println(sameFL(test1));
		System.out.println(sameFL(test2));
	}
}
