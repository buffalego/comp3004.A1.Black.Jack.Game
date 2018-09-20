package comp3004.A1.Black.Jack.Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BlackJackStart 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Let's Play!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//first prompt choose console or file
		System.out.println("Would you select (c)-console or (f)-file?");
		
		
		Scanner playerInput = new Scanner(System.in);
		String select = playerInput.nextLine();
		
		//System.out.println(select);
		
		if (select == "f" || select == "file")
		{
			//ask and get player choice of file
			System.out.println("What file do you want to play? (1, 2, 3, 4, or 5)");
			
			Scanner playerFileChoosen = new Scanner(System.in);
			int fileNum = playerFileChoosen.nextInt();
			
			if (fileNum == 1)
			{
				Scanner fileInput = new Scanner (new File("File1.txt"));
				
				while (fileInput.hasNextLine())
				{
					
				}
			}
			else if (fileNum == 2)
			{
				Scanner fileInput = new Scanner (new File("File2.txt"));
			}
			else if (fileNum == 3)
			{
				Scanner fileInput = new Scanner (new File("File3.txt"));
			}
			else if (fileNum == 4)
			{
				Scanner fileInput = new Scanner (new File("File4.txt"));
			}
			else if (fileNum == 5)
			{
				Scanner fileInput = new Scanner (new File("File5.txt"));
			}
			
			
		}
		else if (select == "c" || select == "console")
		{	
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
			
			//Dealing the card
			System.out.println("Dealing...");
			
			//Player then dealer gets first card
			playerCards.draw(dealingDeck);
			dealerCards.draw(dealingDeck);

			//Player then dealer gets second card
			playerCards.draw(dealingDeck);
			dealerCards.draw(dealingDeck);
		}
		else
		{
			System.out.println("Invalid Choice!");
		}
		
		*/
		
		
		
		
		
		
	}

}

// https://www.youtube.com/watch?v=r7U98zQg9lc
