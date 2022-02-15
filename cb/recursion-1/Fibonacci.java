/*
Tracy's Leeches(Ivina Wang and Anthony Sun)
APCS pd7
HW#64 -- Revisitation
2022-02-14
time spent: 1 hr (class + evening)
*/

/*

The fibonacci sequence is a famous bit of mathematics, and it happens to have a
recursive definition. The first two values in the sequence are 0 and 1 (essentially
2 base cases). Each subsequent value is the sum of the previous two values, so the
whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive
fibonacci(n) method that returns the nth fibonacci number, with n=0 representing
the start of the sequence.


fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
*/

public class Fibonacci{

  public static int fibonacci(int n) {
  if (n == 0){
    return 0;
  }
  if (n == 1){
    return 1;
  }
  return fibonacci(n-1) + fibonacci(n-2);
  }

  public static void main(String[] args){
    System.out.println(fibonacci(0));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(2));
  }

}
