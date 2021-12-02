/*
TNPG NYAH | Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker
APCS pd06
HW41 -- Rational Numbers
2021-12-01
Time Spent: 1.0 hour

DISCOS:
0. We can print an object created with new without assigning it to a variable.
1. The values of p and q are carried over from previous tests unless they are reset.
2. pl + tab is a keyboard shortcut for the System.out.println();

QCC:
0. How could we have implemented a simplify method?

*/


public class Rational {
  private int p;
  private int q;

  public Rational() {
    p=0;
    q=1;
  }

  public Rational(int p, int q) {
    this();
    if (q == 0) {
      System.out.println("Denominator cannot be 0. Set to 1.");
    }
    else {
      this.p=p;
      this.q=q;

  }

  public int getP() {
    return p;
  }

  public int getQ() {
    return q;
  }

  public double floatValue() {
    return p/(double)q;
  }

  public String toString() {
    return p+"/"+q;
  }

  public void multiply(Rational r) {
    p *= r.p;
    q *= r.q;
  }

  public void divide(Rational r) {
    p *= r.q;
    q *= r.p;
  }

  public void add(Rational r) {
    p = p*r.q + r.p*q;
    q *= r.q;
  }

  public void subtract(Rational r) {
    p = p*r.q - r.q*q;
    q *= r.q;
  }

  public static int gcdER( int a, int b) {
	  int lower = a;
	  if (a == b) {
		  return a;
	  } else {
		  if (b < a) {
			  lower = b;
		  }
		  return gcdER(lower, Math.abs(a - b));
	  }
  }

  public void simplify() {
    int gcd = gcdER(p,q);
    p /= gcd;
    q /= gcd;
  }

  public boolean compareTo(Rational r) {
    return this.

  public static void main(String[] args) {

    /*
    Many thanks to TEAM Perfect Purple Petunias for providing test cases on Piazza
    We used their code and supplemented it to include the additional methods that our group implemented
    */

   //Rational def = new Rational();
   System.out.println("Default contructor: " + new Rational() + " ...should be 0/1");
   System.out.println("//====================================");

   //Rational d0 = new Rational(1, 0);
   System.out.println("Denominator set to 0: " + new Rational(1, 0) + " ...should be 0/1");
   System.out.println("//====================================");


   Rational r;
   Rational s;

   r = new Rational(1,8);
   s = new Rational(1,2);
   System.out.println("r: " + r + " ...should be 1/8");
   System.out.println("s: " + s + " ...should be 1/2");
   System.out.println("float value of r " + r.floatValue() + " ...should be 0.125");
   System.out.println("float value of s " + s.floatValue() + " ...should be 0.5");
   r.multiply(s);
   System.out.println("value of r after multiplication: " + r + " ...1/16");
   System.out.println("value of s after multiplication: " + s + " ...1/2");

   r = new Rational(1,8);
   s = new Rational(1,2);

   r.divide(s);
   System.out.println("value of r after division: " + r + " ...2/16");
   System.out.println("value of s after division: " + s + " ...1/2");

   r = new Rational(1,8);
   s = new Rational(1,2);

   r.add(s);
   System.out.println("value of r after addition: " + r + "...20/32");
   System.out.println("value of s after addition: " + s + "...1/2");

   r = new Rational(1,8);
   s = new Rational(1,2);

   r.subtract(s);

   System.out.println("value of r after subtraction: " + r + "... -6/16");
   System.out.println("value of s after subtraction: " + s + "... 1/2");
  }
}
