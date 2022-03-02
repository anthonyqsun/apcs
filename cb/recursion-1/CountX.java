/*
Tracy's Leeches(Ivina Wang and Anthony Sun)
APCS pd7
HW#64 -- Revisitation
2022-02-14
time spent: 1 hr (class + evening)
*/

/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the
string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/

public class CountX{

  public static int countX(String str) {
    if (str.length() == 0){
      return 0;
    }
    if (str.length() >= 1){
      if (str.substring(str.length()-1).equals("x")){
        return 1 + countX(str.substring(0,str.length()-1));
      }
    }
    return countX(str.substring(0,str.length()-1));
  }

  public static void main(String[] args){
    System.out.println(countX("xxhixx"));
    System.out.println(countX("xhixhix"));
    System.out.println(countX("hi"));
  }

}
