public class Rational {
  private int p;
  private int q;

  public Rational() {
    p=0;
    q=1;
  }

  public Rational(int p, int q) {
    this.p = p;
    this.q = q;
    if (q == 0) {
      System.out.println("Denominator cannot be 0. Set to 1.");
      q=1;
    }

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
    String s = "";
    s+=p;
    s+="\n";
    s+="—";
    s+="\n";
    s+=q;
    return s;
  }

  public void multiply(Rational r) {
    p *= r.getP();
    q *= r.getQ();
  }

  public void divide(Rational r) {
    p *= r.getQ();
    q *= r.getP();
  }

  public void add(Rational r) {
    p = p*r.getQ() + r.getP()*q;
    q *= r.getQ();
  }

  public void subtract(Rational r) {
    p = p*r.getQ() - r.getP()*q;
    q *= r.getQ();
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

  public static void main(String[] args) {

  }
}
