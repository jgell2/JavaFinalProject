package war;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
	
	//variables used in the Player class
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	//scanner implemented so the user can enter their own name upon initializing the program
	static Scanner s = new Scanner(System.in);
	
	//constructor, takes the name string
	public Player(String yourName) {
		//passes string through to set name method
		setName(yourName);
		//passes 0 to the set score method
		setScore(0);
	}
	
	//getter for score
	public int getScore() {
		return score;
	}

	//setter for score
	public void setScore(int score) {
		this.score = score;
	}

	//getter for name
	public String getName() {
		return name;
	}

	//setter for name
	public void setName(String name) {
		//prompts user to enter in the name for each player instantiated in the main method
		System.out.println("Enter the player's name: ");
		name = s.next();
		this.name = name;
	}
	//draw method
	public Deck draw(Deck cards) {
		//adds a card to the hand list from the deck variable cards
		hand.add(cards.draw());
		return cards;
		
	}
	
	//flip method, plays the top card in the player's hand
	public Card flip(Card topCard) {
		topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	//player describe method, used for debugging at beginning of program run to make sure all cards are played in order and score is 0'd out
		public void describe() {
			//prints out the name of the player and their current score
			System.out.println(name + "'s score is " + score);
			System.out.println("The cards in your hand are: ");
			//for loop prints out all cards the player drew
			for(int i = 0;i<hand.size(); i++) {
				if(hand.get(i) != null) {
					hand.get(i).describe();			
				}
			}
		}
	
	//increment score method, whenever this is called the player's score will increase by 1
	public void incrementScore() {
		score++;
	}

}
