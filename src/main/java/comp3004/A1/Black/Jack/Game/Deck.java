package comp3004.A1.Black.Jack.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import comp3004.A1.Black.Jack.Game.Card.Rank;
import comp3004.A1.Black.Jack.Game.Card.Suit;


public class Deck 
{

	private ArrayList<Card> cards;
	public boolean isMixed;

	public Deck()
	{
		//Create a new deck of playing cards
		this.cards = new ArrayList<Card>();
	}

	//Add 52 playing cards to a deck
	public void makeFullDeck()
	{
		//Add Cards to the Deck
		//Loop Through Suits
		for(Suit cardSuit : Suit.values()){
			//Loop through Ranks
			for(Rank cardValue : Rank.values()){
				//Add new card to the mix
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
	}
	public int getSize()
	{
		return this.cards.size();
	}

	public void mixDeck() {
		// TODO Auto-generated method stub
		Collections.shuffle(cards);
	    isMixed = true;
	}
	
	
}