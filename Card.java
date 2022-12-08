package war;

public class Card {
	
	//establishing value & name variables. I also established string arrays for the suit and rank (numbers) of each card for the script later on
	private int value;
	private String name;
	static String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
	static String[] numbers = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	
	
	//constructor
	public Card(int yourValue) {
		//passes through number in constructor to the setValue method
		setValue(yourValue);
		//passes through number in constructor to the setName method
		setName(yourValue);
	}
	
	
	//setter for value
	public void setValue(int value) {
		//checks to make sure input is valid
		if(value>=0 && value <= 51) {
			/* determines value based on taking the number passed through and factors it through 13 which should give a value of 0-12, the additional 2 fixes 
			 * the math to have the value equal the card rank
			 */
			this.value = value%13+2;
		}
	}
	//getter for card value
	public int getValue() {
		return value;
	}
	
	//setter for Name
	public void setName(int numbers) {
		//checks to see if the number input is valid
		if(numbers>=0 && numbers<=51) {
			/* sets the name of the card by using the number passed through and factoring it through 13 to get 0-12 which will match up with each item in the numbers array above
			 * then it concatenates " of " to the string and further assigns the suit. This functions similarly to determining which rank of card but instead of factoring through 13, we will
			 * divide by 13 which will be 0-3 depending on the number passed through. This will line up with the suit array established above
			 */
			this.name = Card.numbers[numbers%13] + " of " + Card.suit[numbers/13];
		}	
	}
	
	//getter for card value
	public String getName() {
		return name;
	}
	
	//method to print name & value to the console
	public void describe() {
		System.out.println(name);
	}


}
