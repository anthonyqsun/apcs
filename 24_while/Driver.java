/*
 * DELTA: Kevin Xiao + Mr. Swag, Anthony Sun + Corn
 * APCS
 * HW24 -- coin flips
 * 2021-10-25
 * time spent: 1 hr
 */

/**
 * DISCO:
 * While loops can be used to run something repeatedly until a conditon is met
 * you can override the equals() method by creating your own
 * 
 * QCC:
 * Can we use this calling method to do recursion?
 *
 * POST-v0 MODS:
 * Replaced repetitive code in constructor with this() and this(String) calls.
**/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
    //===================TOP==========================
      Coin mine = new Coin();

      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );

      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );

      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }

      Coin uno = new Coin();
      Coin dos = new Coin();

      int x = 40;

      while (uno.getHeadsCtr() + dos.getHeadsCtr() < x ){
	      uno.flip();
	      dos.flip();
      }
	System.out.println("flips: "+(uno.getFlipCtr() + dos.getFlipCtr()));
	System.out.println("heads: "+(uno.getHeadsCtr() + dos.getHeadsCtr()));
	uno.reset("heads", 0.50);
	dos.reset("heads",0.50);
	
	int y = 120;
	int matches = 0;
	while (matches < y){
		uno.flip();
		dos.flip();
		if (uno.equals(dos)){
			matches += 1;
		}
	}
	System.out.println("\nMatches: " + matches);
	System.out.println("flips: "+(uno.getFlipCtr() + dos.getFlipCtr()));
	uno.reset("heads",0.50);
	dos.reset("heads",0.50);
	matches=0;
	while (matches < 65536 || matches % 2005 != 0) {
		uno.flip();
		dos.flip();
		if (uno.equals(dos)) {
			matches += 1;
		}
	}
	System.out.println("\nMatches: " + matches);
	System.out.println("flips: "+(uno.getFlipCtr() + dos.getFlipCtr()));


      // ====================BOTTOM======================

  }//end main()

}//end class
