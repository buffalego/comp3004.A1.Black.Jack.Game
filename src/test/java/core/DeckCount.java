package core;

import java.util.ArrayList;
import java.util.List;

public class DeckCount {
	public int countCard(ArrayList<String> deck)	{
		int numberOfCard = 0;
		 
		for (int i = 0; i < ((CharSequence) deck).length(); i++)
		{
			numberOfCard ++;
		}
		return numberOfCard;
	}

}
