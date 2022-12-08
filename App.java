package war;


public class App {
	
	//added two name strings to pass through to the Player class because I'm using a scanner to name the players
	private static String name1;
	private static String name2;
	
	public static void main(String[] args) {
		//these three lines instantiates 2 players and 1 deck
		Player player1 = new Player(name1);
		Player player2 = new Player(name2);
		Deck deck1 = new Deck();
		
		//calls the shuffle method in the Deck class for the deck we just instantiated
		deck1.shuffle();
		
		//for loop draws cards for each player until there are none left in the deck
		for(int i=0; i<52;i++) {
			//draw method is called for each player
			player1.draw(deck1);
			player2.draw(deck1);
			}
		//describe method is called here for each player to show their whole hand before the game is played to ensure the program is pulling the top card from their hand each time
		player1.describe();
		System.out.println();
		player2.describe();
		System.out.println();
		//for loop below is what's actually playing the game
		for(int i=0; i<26;i++) {
			//instantiated two Card objects to assign the values of each card drawn to
			Card card1;
			Card card2;
			//calls the flip method for both players and assigns the value to the card variables instantiated above
			card1 = player1.flip(null);
			card2 = player2.flip(null);
			//informational block below prints out the name of each player using the getName method and the name of each card using the describe method, also prints some additional lines
			System.out.println(player1.getName() + " draws:");
			card1.describe();
			System.out.println(player2.getName() + " draws:");
			card2.describe();
			System.out.println();
			
			//if else statement below checks to see which player wins or if its a draw and increase the winner's score then prints out the name of the winner
			if(card1.getValue()>card2.getValue()) {
				System.out.println(player1.getName() + " wins this round!");
				player1.incrementScore();
			}else if (card1.getValue()<card2.getValue()){
				System.out.println(player2.getName() + " wins this round!");
				player2.incrementScore();
			}else {
				System.out.println("The round ends in a draw.");
			}
			//prints out the current score of the game after this round
			System.out.println("Current score is " + player1.getName() + " with " + player1.getScore() + " point(s) and "+ player2.getName()+ " with " + player2.getScore() + " point(s)!");
			System.out.println();			
		}
		
		//prints out final score of the game
		System.out.println("The final score is:");
		System.out.println(player1.getName() + " with " + player1.getScore()+ " points.");
		System.out.println(player2.getName() + " with " + player2.getScore()+ " points.");
		//if else statement below determines the winner of the game
		if(player1.getScore()> player2.getScore()) {
			System.out.println(player1.getName() + " wins!");
		}else if(player1.getScore()<player2.getScore()) {
			System.out.println(player2.getName() + " wins!");
		}else {
			System.out.println("The game is a draw!");
		}
		
		
		}
	}


