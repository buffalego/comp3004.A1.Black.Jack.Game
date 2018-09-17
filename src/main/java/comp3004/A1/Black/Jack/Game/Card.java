package comp3004.A1.Black.Jack.Game;

public class Card 
{
	// create enum constants of Suit
	public enum Suit {
		S, C, D, H
	}
	// create enum constants of Value
	public enum Value 
	{
		TWO ("2"), THREE ("3"), FOUR ("4"), FIVE ("5"), SIX ("6"), SEVEN ("7"), EIGHT ("8")), NINE ("9"), TEN ("10"), JACK ("J"), QUEEN ("Q"), KING ("K"), ACE ("A")
		
		private String val;
		   public String getVal() {
		       return this.val;
		   }
		   Value(String val) {
		           this.val = val;
		   }
		}
	}

	private Suit suit;
	private Value value;
	
	// constructs for Card
	public Card(Suit suit, Value value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	public Value getValue()
	{
		return this.value;
	}
	
	public String toString(){
		return this.suit.toString() + "." + this.value.toString();
	}
	
	
	
	
	
}