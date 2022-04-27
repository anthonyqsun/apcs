/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	String clue;
	
	/**
	 * The answer or name of the celebrity.
	 */
	String answer;
	
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		this.answer = answer;
		this.clue = clue;
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return this.clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return this.answer;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		this.clue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		this.answer = answer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		String s = "";

		s+= "Clue: " + clue + "\nAnswer: " + answer;
		
		return s;
	}
	
	public static void main(String[] args) {
		Celebrity tenz = new Celebrity("Tenz" , "killua SEN player");
		System.out.println(tenz.getClue());
		System.out.println(tenz.getAnswer());
		tenz.setClue("good at the game");
		tenz.setAnswer("Tyson");
		System.out.println(tenz.getClue());
		System.out.println(tenz.getAnswer());
		System.out.println(tenz);
		

		
		
	}


}
