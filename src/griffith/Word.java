package griffith;

public class Word {
	
	private char[] letters;
	
	public Word(char[] letters) {
		if(letters == null) {
			letters = new char[] {};
		}
		this.letters = letters;
	}
	
	boolean contains(char symbol) {
		return new String(letters).
				toLowerCase().
				contains(("" + symbol).toLowerCase());
	}
	
	int length() {
		return new String(letters).length();
	}
	
	char[] getLetters() {
		return letters;
	}
}
