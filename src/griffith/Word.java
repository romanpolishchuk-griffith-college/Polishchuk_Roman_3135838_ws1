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
		return false;	
	}
	
	int length() {
		return 0;
	}
	
	char[] getLetters() {
		return null;
	}
}
