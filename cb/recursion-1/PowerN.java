/*
Tracy's Leeches(Ivina Wang and Anthony Sun)
APCS pd7
HW#64 -- Revisitation
2022-02-14
time spent: 1 hr (class + evening)
*/

/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of
base to the n power, so powerN(3, 2) is 9 (3 squared).


powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
*/

public class PowerN{

  public static int powerN(int base, int n) {
    if (n == 0){
      return 1;
    }
    if (n == 1){
      return base;
    }
    else{
      return base * powerN(base, n-1);
    }
  }

  public static void main(String[] args){
    System.out.println(powerN(3,1));
    System.out.println(powerN(3,2));
    System.out.println(powerN(3,3));
  }

}
