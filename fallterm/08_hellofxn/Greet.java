/*
Anthony Sun
APCS
HW08 -- Hello world function
2021-09-30
*/
/*
 * DISCOVERIES:
 * you can concatenate strings with +
 *
 * UNRESOLVED QUESTIONS:
 * Is there a way to not have to call greet 3 times?
 */

public class Greet {
	public static void main(String[] args) {
		greet("Foo");
		greet("Kevin");
		greet("Jomin");
	}


	public static void greet(String str) {
		System.out.println("Why, hello there, " + str + ". How do you do?");
	}
}
