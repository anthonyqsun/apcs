            /**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card king = new Card("King", "Hearts", 10);
		Card queen = new Card("Queen", "Spades", 10);
		Card jack = new Card("Jack", "Diamonds", 10);

		System.out.println(king.rank());
		System.out.println(king.suit());
		System.out.println(king.pointValue());

		System.out.println(queen.rank());
		System.out.println(queen.suit());
		System.out.println(queen.pointValue());

		System.out.println(jack.rank());
		System.out.println(jack.suit());
		System.out.println(jack.pointValue());

		System.out.println(king.matches(queen));
		System.out.println(jack.matches(jack));
		System.out.println(queen.matches(jack));

	}
}
