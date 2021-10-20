/**
   Clyde "Thluffy" Sinclair
   APCS
   HW20 --
   2021-10-21

   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
 **/

public class Stats {

  public static int mean(int a, int b) {
	int x= (a+b)/2;
  	return x;
  }

  public static double mean(double a, double b) {
	return (a+b)/2.0;
  }

  public static int max(int a, int b) {
	if (a > b) {
		return a;
	}
	return b;
  }

  public static double max(double a, double b) {
	if (a > b) {
		return a;
	}
	return b;
  }

  public static int geoMean(int a, int b) {
	int a2 = a;
	int b2 = b;
	int x =Math.sqrt(a2*b2);
  	return x;
  }

  public static double geoMean(double a, double b) {
	return Math.sqrt(a*b);
  }

  public static int max(int a, int b, int c) {
	int max = a;
	if (b > a) {
		max = b;
	}
	if (c > max) {
		max = c;
	}
	return max;
  }

  public static double max(double a, double b, double c) {
	int max = a;
        if (b > a) {
                max = b;
        }
        if (c > max) {
                max = c;
        }
        return max;
  }

  public static int geoMean(int a, int b, int c) {
	int x = Math.pow(a*b*c, 1/3);
 	return x;
  }

  public static double geoMean(double a, double b, double c) {
	return Math.pow(a*b*c, 1/3);
  }


  //main method for testing functionality
  public static void main( String[] args ) {
	System.out.println("ran");
  }

}//end class
