package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	static int nextCard=0;
	
	//constructor
	public Deck() {
		//this loop creates 52 Cards when a Deck class is instantiated
		for (int i = 0; i < 52; i++) {
			cards.add(new Card(i));
		}
	}
	
	//shuffle method
	public void shuffle() {
		//the shuffle method is a standard method in the Collections class and automatically randomizes the order of the indexes
			Collections.shuffle(cards);
		}
	
	//draw method
	public Card draw() {
		//creates a new instance of Card to return on the method
		Card newCard;
		//if statement validates that there are cards in the deck to draw by checking against the List's size
		if(nextCard < cards.size()) {
			//the drawn card is assigned the index of the top card on the deck
			newCard=cards.get(nextCard);
			//the card is then removed from the deck
			cards.remove(nextCard);
		//if the if statement is false, the method returns a null value
		}else newCard = null;
		return newCard;
	}
}