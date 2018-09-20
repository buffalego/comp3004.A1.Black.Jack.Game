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
	public int getSize(){ return this.cards.size(); }

	public void mixDeck() {
		// TODO Auto-generated method stub
		Collections.shuffle(cards);
	    isMixed = true;
	}
	
	//function helps get card from top of the dealing deck
	public Card getCard(int i){ return this.cards.get(i); }
	
	//Remove a card from the dealing deck
	public void removeCard(int i){ this.cards.remove(i); }
	
	// player and dealer draw cards from dealing Deck
	public void draw(Deck dealingDeck)
	{
		//Add card to hands of player or dealer
		this.cards.add(dealingDeck.getCard(0));
		//Remove the card in the dealing deck 
		dealingDeck.removeCard(0);
	}
	
	//Add card to hands of player and dealer
	public void addCard(Card addCard){ this.cards.add(addCard); }
	
	
	
}