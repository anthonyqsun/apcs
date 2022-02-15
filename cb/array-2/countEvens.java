/*
Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
*/

public class countEvens{
  public int countE(int[] nums) {
    int countEven = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
      countEven++;
      }
    }
    return countEven;
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
