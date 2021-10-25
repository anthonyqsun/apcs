/***
    driver for class Coin

    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: text editor)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

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
      while (uno.headsCtr + dos.headsCtr < x ){
	      uno.flip();
	      dos.flip();
      }
	System.out.println("flips: "+(uno.flipCtr + dos.flipCtr));
	System.out.println("heads: "+(uno.headsCtr + dos.headsCtr));
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
	System.out.println("Matches: " + matches);
	System.out.println("flips: "+(uno.flipCtr + dos.flipCtr));
	uno.reset("heads",0.50);
	dos.reset("heads",0.50);

	

      while (birth.flipCtr % 2005 != 0 || birth.flipCtr == 0) {
              birth.flip();
}
      System.out.println(birth.headsCtr);
      System.out.println(birth.flipCtr);
      System.out.println("at least" + birth.flipCtr + " \

      // ====================BOTTOM======================

  }//end main()

}//end class
