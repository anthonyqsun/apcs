/**
Ivina Wang
APCS
HW28 -- PPMP
2021-10-31
time spent: 2 hours
*/

public class String2{
/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/
  public static String doubleChar(String str) {
    String s = "";
    for (int i=0; i<str.length();i++){
      s += str.substring(i,i+1) + str.substring(i,i+1);
    }
    return s;
  }

/*
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/
  public static int countHi(String str) {
    int counter = 0;
    for (int i=0;i<str.length()-1;i++){
      if (str.substring(i,i+2).equals("hi")) {counter +=1;}
    }
    return counter;
  }

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/
  public static boolean catDog(String str) {
    int catCounter = 0;
    int dogCounter = 0;
    for (int i=0;i<str.length()-2;i++){
      if (str.substring(i,i+3).equals("cat")) {catCounter += 1;}
      if (str.substring(i,i+3).equals("dog")) {dogCounter += 1;}
    }
    return (catCounter == dogCounter);
  }

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
*/
  public static int countCode(String str) {
    int counter = 0;
    for (int i=0;i<str.length()-3;i++){
      if ((str.substring(i,i+2).equals("co")) && (str.substring(i+3,i+4).equals("e"))) {counter += 1;}
    }
    return counter;
  }

/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/
  public static boolean endOther(String a, String b) {
    String x = a.toLowerCase();
    String y = b.toLowerCase();
    if (x.length() < y.length()) {
      return x.equals(y.substring(y.length()-x.length(),y.length()));
    }
      else {
        return y.equals(x.substring(x.length()-y.length(),x.length()));
      }
  }

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/
  public static boolean xyzThere(String str) {
    for (int i=0;i<str.length()-2;i++){
      if ((i==0) && (str.substring(i,i+3).equals("xyz"))) {return true;}
      if (str.substring(i,i+3).equals("xyz") && !(str.substring(i-1,i).equals("."))) {return true;}
    }
    return false;
  }

  public static void main(String[] args){
    //doubleChar
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("AAbb"));
    System.out.println(doubleChar("Hi-There"));
    System.out.println();
    //countHi
    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hihi"));
    System.out.println();
    //catDog
    System.out.println(catDog("catdog"));
    System.out.println(catDog("catcat"));
    System.out.println(catDog("1cat1cadodog"));
    System.out.println();
    //countCode
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxcode"));
    System.out.println(countCode("cozexxcope"));
    System.out.println();
    //endOther
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
    System.out.println();
    //xyzThere
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
    System.out.println();
  }
}
