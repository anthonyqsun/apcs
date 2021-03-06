/***
Delta - Anthony Sun + Corn & Kevin Xiao + Mr. Swag
APCS
HW 23 - coin
2021-10-22
time spent: 30 min
 ***/
 
/*
DISCO:
* We learned that the "this" keyword allows you to reference the current object.
* Math.random() returns a random value between 0 and 1.
QCC:
* How can use this calculate more advanced probability questions?
* Bias can be inherently used to calculate probability (with random).
* How would we account for permutations?
*/

public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;

  
  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
  	flipCtr = 0;
  	headsCtr = 0;
  	tailsCtr = 0;
  	bias = 0.5;
  	upFace = "heads";
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
  	flipCtr = 0;
  	headsCtr = 0;
  	tailsCtr = 0;
  	name = s;
  	bias = 0.5;
  	upFace = "heads";
  	value = assignValue(s);
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    	flipCtr = 0;
  	headsCtr = 0;
  	tailsCtr = 0;
  	name = s;
  	bias = 0.5;
  	upFace = nowFace;
  	value = assignValue(s);
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
	return upFace;
  }

  public int getFlipCtr() {
	return flipCtr;
  }

  public double getValue() {
	return value;
  }

  public int getHeadsCtr() {
	return headsCtr;
  }

  public int getTailsCtr() {
	return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
	if (s == "penny"){
		value = 0.01;
	}
	if (s == "nickel"){
		value = 0.05;
	}
	if (s == "dime"){
		value = 0.10;
	}
	if (s == "quarter"){
		value = 0.25;
	}
	if (s == "half dollar"){
		value = 0.50;
	}
	if (s == "dollar"){
		value = 1.00;
	}
	return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
  	upFace = s;
  	bias = d;
  	flipCtr = 0;
  	headsCtr = 0;
  	tailsCtr = 0;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
  	flipCtr += 1;
	if (Math.random() > bias){
		tailsCtr += 1;
		upFace = "tails";
	}
	else {
		headsCtr += 1;
		upFace = "heads";
	}
	return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
	return this.upFace == other.upFace;
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
	return name + " " + upFace;
  }

}//end class
