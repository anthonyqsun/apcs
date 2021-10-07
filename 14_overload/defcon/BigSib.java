/* Kevin Xiao + Mr. Swag, Corina Chen + Binktop, Anthony Sun + Corn
 * APCS
 * HW14 -- Overloading constructors
 * 2021-10-07
 *
DISCOVERIES:
 * The constructor can be overloaded to perform different tasks if given different argument inputs.
 * Each other's ducky names
 * You can stack multiple constructors together in the same file (overloading)

QCC:
 * What happens if a constructor is private?
 * Why doesn't a constructor have "static"?
 */

public class BigSib {
	String helloMsg;

	public BigSib() {
		helloMsg = "Hello";
	}

	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
