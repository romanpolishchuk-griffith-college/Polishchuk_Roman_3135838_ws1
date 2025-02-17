/*
 * Roman Polishchuk
 * 3135838
 */

package griffith;

public class Word {
	
	private char[] letters;
	
	//Word constructor
	public Word(char[] letters) {
		if(letters == null) {
			letters = new char[] {};
		}
		this.letters = letters;
	}
	
	//Return true if word contain symbol
	boolean contains(char symbol) {
		return new String(letters).
				toLowerCase().
				contains(("" + symbol).toLowerCase());
	}
	
	//Return the length of a word
	int length() {
		return new String(letters).length();
	}
	
	//Return array of word letters
	char[] getLetters() {
		return letters;
	}
}
