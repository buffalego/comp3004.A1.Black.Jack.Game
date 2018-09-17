package core;

import java.util.ArrayList;

import comp3004.A1.Black.Jack.Game.Deck;
import junit.framework.TestCase;

public class DeckCountTest extends TestCase {
	
	//check if deck contains 52 cards or not
	public void testDectCount() {
		Deck cards = new Deck();
		cards.makeFullDeck();
		assertEquals(52, cards.getSize());
	}
}




/*


https://dzone.com/articles/using-java-enums

*/