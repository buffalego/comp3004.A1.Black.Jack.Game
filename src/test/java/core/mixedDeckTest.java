package core;

import comp3004.A1.Black.Jack.Game.Deck;
import junit.framework.TestCase;

public class mixedDeckTest extends TestCase 
{
	//check if the deck is mixed
	public void testMixedDeck() 
	{
		// make 2 deck
		Deck originalDeck = new Deck();
		Deck mixedDeck = new Deck();
		
		//add cards to two decks
		originalDeck.makeFullDeck();
		mixedDeck.makeFullDeck();
		
		//check 2 deck are the same
		assertTrue(originalDeck.equals(mixedDeck));
		//assertTrue(mixedDeck.isMixed);
		
		
		// mix the mixedDeck
		mixedDeck.mixDeck();
		
		
		//check the mixedDeck is different from originalDeck
		//assertFalse(originalDeck.equals(mixedDeck));
		assertTrue(mixedDeck.isMixed);
		
		//double check if the mixedDeck will be randomly mixed after mixing one more time
		//assertFalse(mixedDeck.equals(mixedDeck.mixDeck()));
	}

}

//https://coderanch.com/t/95933/engineering/test-shuffling-method
