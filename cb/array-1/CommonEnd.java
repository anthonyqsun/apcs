/*
Given 2 arrays of ints, a and b, return
true if they have the same first
element or they have the same last
element. Both arrays will be length 1
or more.
*/
public class CommonEnd {
    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1]==b[b.length-1];
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr4 = {7,3};
        System.out.println(commonEnd(arr1,arr4) + "...expecting true");

        int[] arr2 = {7,3,2};
        System.out.println(commonEnd(arr1, arr2) + "...expecting false");
        
        int[] arr3 = {1,3};
        System.out.println(commonEnd(arr1, arr3) + "...expecting true");

    }
      
}
