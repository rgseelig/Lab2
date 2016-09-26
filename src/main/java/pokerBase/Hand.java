
package pokerBase;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand{
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	private Deck deck = new Deck();
	
	public Hand() {
		
		for (int index = 0; index < 5; index++) {
			hand.add(deck.Draw());}
		}
	

	public static boolean isRoyalFlush(ArrayList<Card> hand){
		int checker = 0;
		if (isFlush(hand) == true && isStraight(hand) == true){
			Collections.sort(hand);
			
			for (int i = 0; i<=4; i++) {
				if (hand.get(i).getRank().getRankValue() >= 10){
					checker++;
				}
			}
		}
		if (checker == 4){ return true;}
		else {return false;}
	}
	
		
	public static boolean is4ofKind(ArrayList<Card> hand){
		Collections.sort(hand);
		if (hand.get(0).getRank() == hand.get(1).getRank()){
			if (hand.get(1).getRank() == hand.get(2).getRank()){
				if (hand.get(2).getRank() == hand.get(3).getRank()){
					return true;
				} else{return false;}
				
			}else {return false;}
		}	else if (hand.get(3).getRank()==hand.get(4).getRank()){
			if (hand.get(3).getRank() == hand.get(2).getRank()){
				if (hand.get(2).getRank() == hand.get(1).getRank()){
					return true;
				}
				else {return false;}
			} else {return false;}
		}
		else{return false;}
		}
		
	
	public static boolean isFullHouse(ArrayList<Card> hand){
		Collections.sort(hand);
		if (hand.get(0).getRank() == hand.get(1).getRank()){
			if (hand.get(1).getRank() == hand.get(2).getRank()){
				if (hand.get(3).getRank() == hand.get(4).getRank()){return true;}else{return false;}
			} else if (hand.get(2).getRank() == hand.get(3).getRank()){
				if (hand.get(3).getRank() == hand.get(4).getRank()){return true;} else{return false;}
			} 
		}else if (hand.get(0).getRank() != hand.get(1).getRank()){ return false;}
		else{return false;}}
	
	
	public static boolean isFlush(ArrayList<Card> hand){
		if (hand.get(0).getSuit() == hand.get(1).getSuit()){
			if (hand.get(1).getSuit() == hand.get(2).getSuit()){
				if (hand.get(2).getSuit() == hand.get(3).getSuit())
						{if (hand.get(3).getSuit() == hand.get(4).getSuit())
							{return true;}
						else {return false;}
						
					}else {return false;}
				}else {return false;}
		}else {return false;}
	}
	
	
			
		
	public static boolean isStraight(ArrayList<Card> hand) {
		Collections.sort(hand);
		int counter = 1;
		for (int i = 1; i>4; i++){
			if (hand.get(0).getRank().getRankValue() + i == hand.get(i).getRank().getRankValue()){
				counter = counter + 1;
		} else {counter = 0;}
		}
		
		if (counter == 5){ return true;}
		else {return false;}
	}
	
	public static boolean is3ofKind(ArrayList<Card> hand) {
		Collections.sort(hand);
		if (hand.get(0).getRank() == hand.get(1).getRank()){
			if (hand.get(1).getRank() == hand.get(2).getRank()){
					return true;
				} else{return false;}
				
			}
			else if (hand.get(3).getRank()==hand.get(4).getRank()){
			if (hand.get(3).getRank() == hand.get(2).getRank()){
					return true;
				}
				else {return false;}
			} else if (hand.get(1).getRank()==hand.get(2).getRank()){
				if (hand.get(2).getRank().getRankValue()==hand.get(3).getRank().getRankValue()) {return true;}
				else {return false;}
		}	
		else{return false;}
		}
	
	public static boolean isOnePair(ArrayList<Card> hand){
		Collections.sort(hand);
		int checker = 0;
		for (int i = 0; i>4; i++) {
			if (hand.get(i).getRank() == hand.get(i+1).getRank()) {checker = 1;}
			else {checker = 0;}}
		if (checker == 1){return true;}else {return false;}
	}
		/*
		 * Royal Flush - Sort hand by rank. If isStraight and isFlush both return true, check to see if hand[0] is a 10
		 * 				 and hand[4] is an Ace. If it is then return True
		 * 
		 * Straight Flush - If isStraight and isFlush returns True, then return True
		 * 
		 * 4 of a Kind - Sort hand by rank. if (Hand[0].getRank = Hand[1].getRank = Hand[2].getRank = Hand[3].getRank)
		 * 									return True
		 * 
		 * Full House - Sort hand by rank. if ((Hand[0-2].getRank are equal AND Hand[3,4]  are equal) OR 
		 * 									(Hand[0,1].getRank are equal AND Hand[[2-4].getRank are equal)) 
		 * 
		 * Flush - Loop through cards in hand and if .getSuit all returns the same then True
		 * 
		 * Straight -Sort hand by rank. 
		 * 					for (int i = 1, i>4, i++)
		 * 					If (Hand[0].getRank + i = Hand[i].getRank) return true
		 * 					else (i = 5; return false)					
		 * 	 
		 * 3 of a Kind - Sort hand by rank. if (Hand[0].getRank = Hand[1].getRank = Hand[2].getRank)
		 * 									return True
		 * 
		 * Two Pair - if isOnePair returns true, .remove the pair from the hand and check to see if there is another pair
		 * 
		 * One Pair - Sort hand by rank. use a for loop:
		 * 				for (int i = 0, i>4, i++){ if( hand[i] = hand[i+1] return True; else ( break ) 
		 * 
		 */
	
		
		
	}
	
	



