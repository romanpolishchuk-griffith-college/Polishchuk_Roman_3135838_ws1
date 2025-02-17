package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordTest {

	@Test
	void testContains() {
		//Create word class instance
		Word word1 = new Word(new char[] {'a', 'b', 'c'});
		//Test word contains a
		assertTrue(word1.contains('a'));
		
		//Create word class instance
		Word word2 = new Word(new char[] {'A', 'B', 'C'});
		//Test word contains A
		assertTrue(word2.contains('a'));
		
		//Create word class instance
		Word word3 = new Word(new char[] {'a', 'b', 'c'});
		//Test word contains z
		assertTrue(word3.contains('z'));
		
		//Create word class instance
		Word word4 = new Word(new char[] {});
		//Test word contains a
		assertTrue(word4.contains('a'));
	}
	
	@Test
	void testLength() {
		//Create word class instance
		Word word1 = new Word(new char[] {'a', 'b', 'c'});
		//Test word contains a
		assertEquals(3, word1.length());
		
		//Create word class instance
		Word word2 = new Word(new char[] {'l', 'o', 'o', 'o', 'n', 'g'});
		//Test word contains a
		assertEquals(6, word2.length());
		
		//Create word class instance
		Word word3 = new Word(new char[] {'a'});
		//Test word contains a
		assertEquals(1, word3.length());
		
		//Create word class instance
		Word word4 = new Word(new char[] {});
		//Test word contains a
		assertEquals(0, word4.length());
	}
	
	@Test
	void testNotNull() {
		//Create word class instance
		Word word1 = new Word(new char[] {'a', 'b', 'c'});
		//Test word contains a
		assertNotNull(word1.getLetters());
		
		//Create word class instance
		Word word2 = new Word(new char[] {'l', 'o', 'o', 'o', 'n', 'g'});
		//Test word contains a
		assertNotNull(word2.getLetters());
		
		//Create word class instance
		Word word3 = new Word(new char[] {'a'});
		//Test word contains a
		assertNotNull(word3.getLetters());
		
		//Create word class instance
		Word word4 = new Word(new char[] {});
		//Test word contains a
		assertNotNull(word4.getLetters());
	}
}
