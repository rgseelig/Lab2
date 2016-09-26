package pokerBase;

import java.util.Comparator;
import java.util.ArrayList;

public class Card implements Comparable{

	private eCardSuit suit;
	private eCardNo rank;
	public enum eCardSuit {
		
		hearts, diamonds, clubs, spades;

	}
	
	public enum eCardNo{
		
		Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13), Ace(14);
		
		private int rankValue;
			
		private eCardNo(int rankedValues){
			this.rankValue = rankedValues;
		}
		
		public int getRankValue(){
			return this.rankValue;
		}
		}

	
	public eCardSuit getSuit() {
		return suit;
	}





	public eCardNo getRank() {
		return rank;
	}






	public Card(eCardSuit suit, eCardNo rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	
	
	public static Comparator<Card> CardRank = new Comparator<Card>(){
		public int compare (Card c1, Card c2){
			int Cno1 = c1.getRank().getRankValue();
			int Cno2 = c2.getRank().getRankValue();
			
			return Cno1 -Cno2;
			
		}
	};
	@Override
	public int compareTo(Object o) {
	    Card c = (Card) o; 
	    return c.getRank().compareTo(this.getRank()); 

	}

}

	


