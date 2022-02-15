/*
Tracy's Leeches(Ivina Wang and Anthony Sun)
APCS pd7
HW#64 -- Revisitation
2022-02-14
time spent: 1 hr (class + evening)
*/

/*
We have triangle made of blocks. The topmost row has 1 block, the next row down has
2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or
multiplication) the total number of blocks in such a triangle with the given number
of rows.


triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
*/

public class Triangle{

  public static int triangle(int rows) {
    if (rows == 0){
      return 0;
    }
    return rows + triangle(rows-1);
  }

  public static void main(String[] args){
    System.out.println(triangle(0));
    System.out.println(triangle(1));
    System.out.println(triangle(2));
  }

}
