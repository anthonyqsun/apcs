public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up"); // create BigSib obj
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
