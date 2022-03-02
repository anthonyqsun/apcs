/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
*/

public class firstLast6 {
	public static boolean firstLastSix(int[] nums) {
		return ((nums[0] == 6) || (nums[nums.length-1] == 6));
	}

	public static void main(String[] args) {
		int[] test0 = {1,2,6};
		System.out.println(firstLastSix(test0));
		int[] test1 = {6,1,2,3};
		System.out.println(firstLastSix(test1));
		int[] test2 = {13,6,1,2,3};
		System.out.println(firstLastSix(test2));

	}

}
