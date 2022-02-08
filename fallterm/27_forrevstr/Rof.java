/* Poke: Jing Feng + biscuit, Anthony Sun + corn, Brian Wang + dolphin
 * APCS
 * HW27 - posts and reverse :)
 * 2021-10-28
 * time spent: 1 hr
 */

/* DISCO:
 * an unintiallized String is null
 * you can return a String with declaring it
 *
 * QCC:
 * Is there a more elegant way to handle 0 in fenceF?
 */

public class Rof {
	public static String fenceF(int posts) {
		if (posts == 0) {
			return "";
		}
		String fence = "|";
	
		for(int i=0; i<posts-1; i++) {
			fence += "--|";
		}
		return fence;
	}

	public static String reverseF(String s) {
		String result = "";
		for(int start_index = s.length()-1; start_index >= 0; start_index-=1) {
			result += s.substring(start_index,start_index+1);
		}
		return result;
	}

	public static String reverseR(String s) {
		if (s.length() == 1) {
			return s;
		}
		return s.substring(s.length()-1) + reverseR(s.substring(0,s.length()-1));
	}

	public static void main(String[] args) {
		System.out.println(fenceF(5));
		System.out.println(fenceF(0));
		System.out.println(reverseF("desserts"));
		System.out.println(reverseR("stressed"));	
	}
}
