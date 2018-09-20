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

	//Create a new deck of playing cards
	public Deck(){ this.cards = new ArrayList<Card>(); }

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
	
	// take all the cards on player and dealer hands back to the deck
	public void movePlayingHandsToDeck(Deck dealedDeck){
		int thisDeckSize = this.cards.size();
		
		//put cards on hand back into dealed deck
		for(int i = 0; i < thisDeckSize; i++){
			dealedDeck.addCard(this.getCard(i));
		}
		//empty out the hand
		for(int i = 0; i < thisDeckSize; i++){
			this.removeCard(0);
		}
	}
	
	public int cardsValue(){
		int totalValue = 0;
		int aces = 0;
		//For every card in the deck
		for(Card aCard : this.cards){
			//Switch of possible values
			switch(aCard.getValue()){
			case TWO: totalValue += 2; break;
			case THREE: totalValue += 3; break;
			case FOUR: totalValue += 4; break;
			case FIVE: totalValue += 5; break;
			case SIX: totalValue += 6; break;
			case SEVEN: totalValue += 7; break;
			case EIGHT: totalValue += 8; break;
			case NINE: totalValue += 9; break;
			case TEN: totalValue += 10; break;
			case JACK: totalValue += 10; break;
			case QUEEN: totalValue += 10; break;
			case KING: totalValue += 10; break;
			case ACE: aces += 1; break;
			
			
			}
		}
	
	
	
}