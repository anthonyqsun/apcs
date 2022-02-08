/*
 * Anthony Sun + corn, Nafiz Labib + Martha
 * APCS
 * HW13 -- constructors
 * 2021-10-06
 *
 * DISCOVERIES:
 * - You can run tasks in constructor, which are run immediately after object is created with "new"
 *
 * QCC:
 * - Is there a way to implement differences between different objects of the same class?
 */


public class BigSib {
	String helloMsg;
	public BigSib(String msg) {
		helloMsg = msg;
	}

	public String greet(String msg) {
		return helloMsg + " " + msg;
	}
}
