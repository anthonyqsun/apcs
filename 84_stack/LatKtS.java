/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      stack.push(s.substring(i,i+1));
    }

    String output = "";
    String pop = stack.pop();
    while (!pop.equals("")) {
      output+= pop;
      pop = stack.pop();
    }
    return output;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      String charAtIndex = s.substring(i,i+1);
      if (charAtIndex.equals("[")) stack.push("[");
      if (charAtIndex.equals("]")) stack.pop();
      
      if (charAtIndex.equals("{")) stack.push("{");
      if (charAtIndex.equals("{")) stack.pop();

      if (charAtIndex.equals("(")) stack.push("(");
      if (charAtIndex.equals("(")) stack.pop();
    }
    return stack.pop().equals("");
  }


  //main method to test
  public static void main( String[] args )
  {
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
