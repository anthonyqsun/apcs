/*
TNPG NYA | Anthony Sun + Corn; Nakib Abedin + Joker
APCS pd06
HW49 - We shall comply
2021-12-22
Time Spent: 0.7 hours
DISCOS:
0. You can use the throw keyword without a try and catch statement
1. <object> instanceof <class> returns a boolean boolean value
2. To comply with an interface, you need to override all methods.
QCC:
0. Should we have used try and catch statements for this homework?
*/
public class Driver {
  public static void main(String[] args) {



   Rational r;
   Rational s;
   Rational t;

   r = new Rational(1,8);
   s = new Rational(1,2);
   t = new Rational(2,16);
   System.out.print(r+" is equal to "+s+": ");
   System.out.println(r.equals(s));
   System.out.print(r+" is equal to "+t+": ");
   System.out.println(r.equals(t));
   System.out.print(r+" is equal to \"Hello\": ");
   System.out.println(r.equals("Hello"));

   r = new Rational(1,8);
   s = new Rational(1,2);
   t = new Rational(2,16);
   System.out.println("r.compareTo(s) --> " + r.compareTo(s) + " ... expecting negative");
   System.out.println("s.compareTo(r) --> " + s.compareTo(r) + " ... expecting positive");
   System.out.println("r.compareTo(t) --> " + r.compareTo(t) + " ... expecting 0");
   System.out.println("t.compareTo(r) --> " + t.compareTo(r) + " ... expecting 0");
   System.out.println("s.compareTo(t) --> " + s.compareTo(t) + " ... expecting positive");
   System.out.println("t.compareTo(s) --> " + t.compareTo(s) + " ... expecting negative");
   System.out.println("r.compareTo(r) --> " + r.compareTo(r) + " ... expecting 0");
   System.out.println("s.compareTo(s) --> " + s.compareTo(s) + " ... expecting 0");
   System.out.println("t.compareTo(t) --> " + t.compareTo(t) + " ... expecting 0");


  }
}
