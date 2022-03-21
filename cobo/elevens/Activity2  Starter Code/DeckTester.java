/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck one = new Deck(
			new String[]{"Three", "Seven", "Nine", "King"},
			new String[]{"Hearts", "Diamonds", "Clubs", "Spades"},
			new int[]{3, 7, 9, 10}
		);
		Deck two = new Deck(
			new String[]{"One", "Two", "Three", "Four"},
			new String[]{"Hearts", "Diamonds", "Clubs", "Spades"},
			new int[]{1, 2, 3, 4}
		);
		Deck three = new Deck(
			new String[]{},
			new String[]{"Diamonds", "Clubs", "Hearts", "Spades"},
			new int[]{}
		);

		System.out.println(one.isEmpty());
		System.out.println(two.isEmpty());
		System.out.println(three.isEmpty());

		one.shuffle(); two.shuffle(); three.shuffle();

		System.out.println("Contents of Deck 1:\n");
		dealAll(one);
		System.out.println("Contents of Deck 2:\n");
		dealAll(two);
		System.out.println("Contents of Deck 3:\n");
		dealAll(three);

		System.out.println("Empty status:");
		System.out.println(one.isEmpty());
		System.out.println(two.isEmpty());
		System.out.println(three.isEmpty());



	}

	private static void dealAll(Deck deck) {
		while (deck.size() > 0) {
			System.out.println(deck.deal());
		}
		System.out.println();
	}
}
