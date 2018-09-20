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
		for(Suit cardSuit : Suit.values())
		{
			//Loop through Ranks
			for(Rank cardValue : Rank.values())
			{
				//Add new card to the mix
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
	}
	
	public int getSize(){ return this.cards.size(); }

	public void mixDeck() 
	{
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
	public void movePlayingHandsToDeck(Deck dealedDeck)
	{
		int thisHandSize = this.cards.size();
		
		//put cards on hand back into dealed deck
		for(int i = 0; i < thisHandSize; i++)
		{
			dealedDeck.addCard(this.getCard(i));
		}
		//empty out the hand
		for(int i = 0; i < thisHandSize; i++)
		{
			this.removeCard(0);
		}
	}
	
	//public Card hasCard(Deck dealerDeck)
	
	public int cardsValue()
	{
		int totalValue = 0;
		int aces = 0;
		//loop for every card in the dealing deck
		for(Card aCard : this.cards){
			
			//Switch of possible values
			switch(aCard.getValue())
			{
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

		//Determine the total value of aces
		//Aces worth 11 or 1 - if 11 would go over 21 make it worth 1
		//int thisHandSize = this.cards.size();
		
		for(int i = 0; i < aces; i++)
		{	
			//if a hand has 2 or more ace and total value without aces is more than 10
			if (totalValue > 10 && aces > 1 && aces <=4)
			{
				totalValue += 1; // one ace = 1
			}
			//if a hand has 2 or more aces and total value without aces is less than 10
			else if (totalValue < 10 && aces > 1 && aces <=4)
			{
				// first plus 11 to total for first ace value then plus (aces - 1) to total value ==> (aces - 1) worth 1 each
				totalValue = totalValue + 11 + (aces -1);
			}
			
		}
		//Return
		return totalValue;
	}
	
	
	
}