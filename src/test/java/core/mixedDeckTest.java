package core;

import comp3004.A1.Black.Jack.Game.Deck;
import junit.framework.TestCase;

public class mixedDeckTest extends TestCase 
{
	//check if the deck is mixed
	public void textMixedDeck() 
	{
		// make a new deck
		Deck cards = new Deck();
		//add cards to deck
		cards.makeFullDeck();
		//check if the deck is not mixed
		assertFalse(cards.isMixed());
		// mix the deck
		cards.mixedDeck();
		//check if the deck is mixed
		assertTrue(cards.isMixed());
	}

}

//https://coderanch.com/t/95933/engineering/test-shuffling-method
