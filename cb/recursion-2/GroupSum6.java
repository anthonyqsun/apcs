/*
Tracy's Leeches(Ivina Wang and Anthony Sun)
APCS pd7
HW#64 -- Revisitation
2022-02-14
time spent: 1 hr (class + evening)
*/

/*
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the
start index, such that the group sums to the given target? However, with the additional
constraint that all 6's must be chosen. (No loops needed.)


groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false
*/

public class GroupSum6{

  public static boolean groupSum6(int start, int[] nums, int target) {
    if (start >= nums.length) {
      return target==0;
    }
    if (nums[start] == 6) {
      return groupSum6(start+1, nums, target-nums[start]);
    }
    return groupSum6(start+1, nums, target-nums[start]) || groupSum6(start+1, nums, target);

  }

  public static void main(String[] args){
    System.out.println(groupSum6(0, [5, 6, 2], 8));
    System.out.println(groupSum6(0, [5, 6, 2], 9));
    System.out.println(groupSum6(0, [5, 6, 2], 7));

}
