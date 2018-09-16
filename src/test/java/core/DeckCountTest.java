package core;

import java.util.ArrayList;

import comp3004.A1.Black.Jack.Game.Deck;
import junit.framework.TestCase;

public class DeckCountTest extends TestCase {
	

	public void testDectCount() {
		Deck cards = new ArrayList<Card>();
		cards.createFullDeck();
		assertEquals(52, cards.size());
	}
}




/*
 List<String> deck = 
 
{"SA","S2","S3","S4","S5","S6","S7","S8","S9","S10","SJ","SQ","SK",
 "CA","C2","C3","C4","C5","C6","C7","C8","C9","C10","CJ","CQ","CK",
 "DA","D2","D3","D4","D5","D6","D7","D8","D9","D10","DJ","DQ","DK",
 "HA","H2","H3","H4","H5","H6","H7","H8","H9","H10","HJ","HQ","HK",	
}

need functions:
countCard();
getCard();
getSuit();
getRank();


https://dzone.com/articles/using-java-enums

*/