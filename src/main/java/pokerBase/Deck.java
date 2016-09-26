package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
	
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	public Deck() {
		for (int i = 0; i<4; i++)
		{
			for (int j = 0; j<13; j++){
				Card c = new Card (i,j);
						DeckCards.add(c);
			}
		}
		Collections.shuffle(DeckCards);
	}
	
	public Card Draw(){
		
		Card drawnCard = DeckCards.get(0);
		DeckCards.remove(0);
		return drawnCard;
	}
	
	public int deckSize(){
		return DeckCards.size();
	}
	

}
