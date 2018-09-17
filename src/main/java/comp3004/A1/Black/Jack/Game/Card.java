package comp3004.A1.Black.Jack.Game;

public class Card 
{
	// create enum constants of Suit
	public enum Suit {
		S, C, D, H
	}
	// create enum constants of Value
	public enum Rank 
	{
		TWO ("2"), THREE ("3"), FOUR ("4"), FIVE ("5"), SIX ("6"), SEVEN ("7"), EIGHT ("8"), NINE ("9"), TEN ("10"), JACK ("J"), QUEEN ("Q"), KING ("K"), ACE ("A");
		
		private String val;
		   public String getVal() {
		       return this.val;
		   }
		   Rank(String val) {
		           this.val = val;
		   }
		}
	

	private Suit suit;
	private Rank rank;
	
	// constructs for Card
	public Card(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	// function to get value from Value
	public Rank getValue()
	{
		return this.rank;
	}
	
	// concates suit and rank
	public String toString(){
		return this.suit.toString() + "." + this.rank.toString();
	}
	
	
	
	
	
}