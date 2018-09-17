package comp3004.A1.Black.Jack.Game;

public class BlackJackStart 
{
	public static void main(String[] args)
	{
		System.out.println("Let's Play!");
		
		//create new deck for dealer
		//add to make a full deck
		//then shuffle it
		Deck dealingDeck = new Deck();
		
		dealingDeck.makeFullDeck();
		dealingDeck.mixDeck();
		
		//create a hand of cards for dealer
		Deck dealerCards = new Deck();
		
		//create a hand of cards for player
		Deck playerCards = new Deck();
		
		
		
		
		
	}

}
