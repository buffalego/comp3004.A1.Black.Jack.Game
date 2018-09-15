package core;

import junit.framework.TestCase;

public class DeckCountTest extends TestCase {
	public void testDectCount() {
		DeckCount checkDeck = new DeckCount();
		
		assertEquals(52, checkDeck.count(deckList));
	}
}
