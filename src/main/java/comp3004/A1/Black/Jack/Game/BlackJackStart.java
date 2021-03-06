package comp3004.A1.Black.Jack.Game;

import java.io.IOException;
import java.util.Scanner;

public class BlackJackStart 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Let's Play!");
		
		while (true)
		{
		
			System.out.println("Would you like to player (1)Console or (2)File!");
			Scanner playerChoice = new Scanner(System.in);
			int choice = playerChoice.nextInt();
			
			if(choice == 1)
			{
				System.out.println("YOU ARE PLAYING BY CONSOLE INPUT!");
			
				Deck dealingDeck = new Deck();
				
				dealingDeck.makeFullDeck();
				dealingDeck.mixDeck();
				
				//create a hand of cards for dealer
				Deck dealerHand = new Deck();
				
				//create a hand of cards for player
				Deck playerHand = new Deck();
				
				//Dealing the card
				System.out.println("Dealing...");
				
				//Player then dealer gets first card
				playerHand.draw(dealingDeck);
				dealerHand.draw(dealingDeck);
		
				//Player then dealer gets second card
				playerHand.draw(dealingDeck);
				dealerHand.draw(dealingDeck);
				
				
				boolean endRound = false;
				//Scanner for user input
				Scanner userInput = new Scanner(System.in);
				Scanner dealerInput = new Scanner(System.in);
				
				while(true)
				{
					//Display player hand
					System.out.println("Your Hand:" + playerHand.getCard(0).toString() + " " + playerHand.getCard(1).toString());
		
					//Display playerHand Value
					System.out.println("Your hand is currently valued at: " + playerHand.cardsValue());
		
					//Display dealerHand (first one is showed and the other is hidden
					System.out.println("Dealer Hand: " + dealerHand.getCard(0).toString() + " and [hidden]");
					
					// player have < 16 points ==> must hit
					if (playerHand.cardsValue() < 16)
					{
						System.out.println("Your hand is currently valued at: " + playerHand.cardsValue() + " is less than 17");
						System.out.println("You must hit!");
						playerHand.draw(dealingDeck);
						System.out.println("You draw a:" + playerHand.getCard(playerHand.getSize()-1).toString());
						System.out.println("Your hand is now valued at: " + playerHand.cardsValue());
						if(playerHand.cardsValue() > 21)
						{
							System.out.println("Bust. Currently valued at: " + playerHand.cardsValue());
							System.out.println("Dealer wins!");
							endRound = true;
							break;
						}
					}
					
					
					//Player decide to continue
					else
					{
						System.out.println("Would you like to (1)Hit or (2)Stand");
						int response = userInput.nextInt();
			
						//player hits
						if(response == 1 )
						{
							playerHand.draw(dealingDeck);
							System.out.println("You draw a:" + playerHand.getCard(playerHand.getSize()-1).toString());
							//Bust if they go over 21
							if(playerHand.cardsValue() > 21)
							{
								System.out.println("Bust. Currently valued at: " + playerHand.cardsValue());
								System.out.println("Dealer wins!");
								endRound = true;
								break;
							}
						}
						//Stand
						else if(response == 2)
						{
							break;
						}
					}
					//break;
				}
				
				// player hand displayer
				System.out.println("Your hand is" + playerHand.toString());
				
				
				
				System.out.println("Dealer Cards:" + dealerHand.toString());
				//See if dealer has more points than player
				if((dealerHand.cardsValue() > playerHand.cardsValue()) && endRound == false)
				{
					System.out.println("Dealer beats you " + dealerHand.cardsValue() + " to " + playerHand.cardsValue());
					endRound = true;
				}
				
				// dealer has <= 16
				if (dealerHand.cardsValue() <= 16)
				{
					System.out.println("Dealer hand is currently valued at: " + dealerHand.cardsValue() + " is less than 17");
					System.out.println("Must hit!");
					dealerHand.draw(dealingDeck);
					System.out.println("dealer draw a:" + dealerHand.getCard(dealerHand.getSize()-1).toString());
					System.out.println("dealer hand is now valued at: " + dealerHand.cardsValue());
					
					// check if dealer and player equal points
					if (dealerHand.cardsValue() >= playerHand.cardsValue() && (dealerHand.cardsValue() <= 21 || dealerHand.cardsValue() >= 17))
					{
						System.out.println("Dealer wins");
						endRound = true;	
					}
				}
				
				//Display value of dealer
				else 
				{
					System.out.println("Dealers hand value: " + dealerHand.cardsValue());
				}
				
					System.out.println("Would you like to (1)Hit or (2)Stand");
					int dealerRep = userInput.nextInt();
					
					if(dealerRep == 1 )
					{
						dealerHand.draw(dealingDeck);
						System.out.println("dealer draw a:" + dealerHand.getCard(dealerHand.getSize()-1).toString());
						//Bust if they go over 21
						if(dealerHand.cardsValue() > 21)
						{
							System.out.println("Bust. Currently valued at: " + dealerHand.cardsValue());
							System.out.println("You Win!");
							endRound = true;
							break;
						}
						//Determine dealer = player
						else if((dealerHand.cardsValue() == playerHand.cardsValue()) && endRound == false)
						{
							System.out.println("Dealer wins");
							endRound = true;
							break;
						}
						break;
					}
					//Stand
					else if(dealerRep == 2)
					{
						break;
					}
				
		
				//Determine if dealer busted
				if((dealerHand.cardsValue()>21)&& endRound == false)
				{
					System.out.println("Dealer Busts. You win!");
					endRound = true;
				}
		
				//Determine dealer = player
				if((dealerHand.cardsValue() == playerHand.cardsValue()) && endRound == false)
				{
					System.out.println("Dealer wins");
					endRound = true;
				}
		
				//Determine if player wins
				if((playerHand.cardsValue() > dealerHand.cardsValue()) && endRound == false)
				{
					System.out.println("You win the hand.");
					endRound = true;
				}
				/*else if(endRound == false) //dealer wins
				{
					System.out.println("Dealer wins.");
				}*/
		
				//End of hand - put cards back in dealed deck
				playerHand.movePlayingHandsToDeck(dealingDeck);
				dealerHand.movePlayingHandsToDeck(dealingDeck);
				System.out.println("End of Hand.");
				
				
				System.out.println("Would you like to play agian? (1)Yes or (2)No");
				Scanner playerReplay = new Scanner(System.in);
				int replay = playerReplay.nextInt();
					
				if (replay == 1)
				{
					System.out.println("Let's play again!");
				}
				if (replay == 2)
				{
					System.out.println("See you again!");
					break;
				}	
			}
			else if (choice == 2)
			{
				System.out.println("YOU ARE PLAYING BY FILE INPUT!");
			}
			else
			{
				System.out.println("Invalid Input!");
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		