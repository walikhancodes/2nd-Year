import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
/*
THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT CONSULTING ANY
SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR . Wali Khan
*/

public class BlackJack {

    // fill in code here
    // define data members

    
    public static void buildDeck(ArrayList<Card> deck) {
	// fill in code here
	// Given an empty deck, construct a standard deck of playing cards
    	String[] symbol= {"Hearts", "Clubs", "Diamonds", "Spades"};
    	String[] extraRanks = {"Jack", "Queen", "King"}; 
    	for(int i = 0; i < symbol.length; i++){
    		for(int j = 2; j < 11; j++){
    			Card x = new Card(symbol[i], j);
    			deck.add(x);
    		}
    		for(int k = 0; k < 3; k++){
    			Card y = new Card(symbol[i], extraRanks[k]);
    			deck.add(y);
    		}
    		Card z = new Card(symbol[i], "Ace");
    		deck.add(z);
    		
    	}
    }

    public static void initialDeal(ArrayList<Card> deck, ArrayList<Card> playerHand, ArrayList<Card> dealerHand){
	// fill in code here
	// Deal two cards from the deck into each of the player's hand and dealer's hand 
     	//ArrayList<Card> playerHand = new ArrayList<Card>();
     	deck.clear();
     	buildDeck(deck);
     	playerHand.clear();
     	dealerHand.clear(); 
     	while (playerHand.size() != 2){
     		Card x = deck.get((int)(Math.random() * deck.size()));
     		playerHand.add(x);
     		deck.remove(x);
     	}
     	while (dealerHand.size() != 2){
     		Card y = deck.get((int)(Math.random() * deck.size()));
     		dealerHand.add(y);
     		deck.remove(y);
     	}

    }

    public static void dealOne(ArrayList<Card> deck, ArrayList<Card> hand){
	// fill in code here
	// this should deal a single card from the deck to the hand
    	Card x = deck.get((int)(Math.random() * deck.size()));
    	hand.add(x);
    	deck.remove(x);
    	
    }

    public static boolean checkBust(ArrayList<Card> hand){
	// fill in code here
	// This should return whether a given hand's value exceeds 21
    	int result = 0;
    	int marker = 0;
    	for(int i = 0; i < hand.size(); i++){
    		 
    		 
    		if(hand.get(i).getRank().equals("King") || hand.get(i).getRank().equals("Jack")|| hand.get(i).getRank().equals("Queen")) {
    			result += 10;

    		} else if (hand.get(i).getRank().equals("Ace")){
    			marker++;
    			result++;
    		}else{
    			result += Integer.parseInt(hand.get(i).getRank());
    		}
    	}
    	if(marker != 0 && result <= 11){
    		result += 10;
    	}

    	
    	return result > 21; 

    }

    public static boolean dealerTurn(ArrayList<Card> deck, ArrayList<Card> hand){
	// fill in code here
	// This should conduct the dealer's turn and
	// Return true if the dealer busts; false otherwise
    	int result = 0;
    	int marker = 0;
    	int marker2 = 0;
    	for(int i = 0; i < hand.size(); i++){

    		 
    		if(hand.get(i).getRank().equals("King") || hand.get(i).getRank().equals("Jack")|| hand.get(i).getRank().equals("Queen")) {
    			result += 10;
    		}else if (hand.get(i).getRank().equals("Ace")){
    			marker++;
    			result++;
    		}else {
    			result += Integer.parseInt(hand.get(i).getRank());
    		}

    	}
    	if(marker != 0 && result <= 11){
    		result += 10;
    		marker2++;
    	}

  
    	int j = hand.size() - 1;
    	while(result < 17){
    		dealOne(deck, hand);
    		j++;
    		if(hand.get(j).getRank().equals("King") || hand.get(j).getRank().equals("Jack")|| hand.get(j).getRank().equals("Queen")) {
    			result += 10;
    		}else if (hand.get(j).getRank().equals("Ace")){
    			result++;
    			marker++;
    		}else {
    			result += Integer.parseInt(hand.get(j).getRank());
    		}

    	}
    	if(marker2 != 0 && result >= 21){
    		result -= 10;
    	} else if(marker != 0 && result <= 11){
    		result += 10; 
    	} else{}



    	

    	if(checkBust(hand) == true){
    		return true;

    	}else {
    		return false;
    	}
    }

    public static int whoWins(ArrayList<Card> playerHand, ArrayList<Card> dealerHand){
	// fill in code here
	// This should return 1 if the player wins and 2 if the dealer wins
    	int marker = 0;
    	int sumOfPlayer = 0;
    	for(int i = 0; i < playerHand.size(); i++){
    		if(playerHand.get(i).getRank().equals("King") || playerHand.get(i).getRank().equals("Jack")|| playerHand.get(i).getRank().equals("Queen")) {
    			sumOfPlayer += 10;
    		} else if (playerHand.get(i).getRank().equals("Ace")){
    			marker++;
    			sumOfPlayer++;
    		}else{
    			sumOfPlayer += Integer.parseInt(playerHand.get(i).getRank());
    		}
    	}
    	if(marker != 0 && sumOfPlayer <= 11){
    		sumOfPlayer += 10;
    	}

    	int markerForDealer = 0;
    	int sumOfDealer = 0;
    	for(int i = 0; i < dealerHand.size(); i++){
    		if(dealerHand.get(i).getRank().equals("King") || dealerHand.get(i).getRank().equals("Jack") || dealerHand.get(i).getRank().equals("Queen")) {
    			sumOfDealer += 10;
    		}else if (dealerHand.get(i).getRank().equals("Ace")){
    			markerForDealer++;
    			sumOfDealer++;
    		} else{
    			sumOfDealer += Integer.parseInt(dealerHand.get(i).getRank());
    		}
    	}
    	if(markerForDealer != 0 && sumOfDealer <= 11){
    		sumOfDealer += 10;
    	}
    	if(sumOfPlayer > sumOfDealer) {
    		return 1;
    	} else {
    		return 2;
    	}

    }

    public static String displayCard(ArrayList<Card> hand){
	// fill in code here
	// Return a string describing the card which has index 1 in the hand
    	return "" + hand.get(1).getRank() + " of " + hand.get(1).getSymbol();
    }

    public static String displayHand(ArrayList<Card> hand){
	// fill in code here
	// Return a string listing the cards in the hand
    	String result = "";
    	for(int i = 0; i< hand.size() -1; i++){
    		result += hand.get(i).getRank() + " of " + hand.get(i).getSymbol() + " and ";
    	}
    	result += hand.get(hand.size()-1).getRank() + " of " + hand.get(hand.size()-1).getSymbol();
    	return result; 
    }

    // fill in code here (Optional)
    // feel free to add methods as necessary


    public static void main(String[] args) {

		int playerChoice, winner;
		ArrayList<Card> deck = new ArrayList<Card>();
		
		
		playerChoice = JOptionPane.showConfirmDialog(
			null, 
			"Ready to Play BlackJack?", 
			"BlackJack", 
			JOptionPane.OK_CANCEL_OPTION
		);

		if((playerChoice == JOptionPane.CLOSED_OPTION) || (playerChoice == JOptionPane.CANCEL_OPTION))
		    System.exit(0);
		
		Object[] options = {"Hit","Stand"};
		boolean isBusted;	// Player busts? 
		boolean dealerBusted;
		boolean isPlayerTurn;
		ArrayList<Card> playerHand = new ArrayList<>();
		ArrayList<Card> dealerHand = new ArrayList<>();
	
		do{ // Game loop
			buildDeck(deck);  // Initializes the deck for a new game
		    initialDeal(deck, playerHand, dealerHand);
		    isPlayerTurn=true;
		    isBusted=false;
		    dealerBusted=false;
		    
		    while(isPlayerTurn){

				// Shows the hand and prompts player to hit or stand
				playerChoice = JOptionPane.showOptionDialog(
					null,
					"Dealer shows " + displayCard(dealerHand) + "\n Your hand is: " 
						+ displayHand(playerHand) + "\n What do you want to do?",
					"Hit or Stand",
				   JOptionPane.YES_NO_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,
				   options,
				   options[0]
				);

				if(playerChoice == JOptionPane.CLOSED_OPTION)
				    System.exit(0);
				
				else if(playerChoice == JOptionPane.YES_OPTION){
				    dealOne(deck, playerHand);
				    isBusted = checkBust(playerHand);
				    if(isBusted){
						// Case: Player Busts
						playerChoice = JOptionPane.showConfirmDialog(
							null,
							"Player has busted!", 
							"You lose", 
							JOptionPane.OK_CANCEL_OPTION
						);

						if((playerChoice == JOptionPane.CLOSED_OPTION) || (playerChoice == JOptionPane.CANCEL_OPTION))
						    System.exit(0);
						
						isPlayerTurn=false;
				    }
				}
			    
				else{
				    isPlayerTurn=false;
				}
		    }

		    if(!isBusted){ // Continues if player hasn't busted
				dealerBusted = dealerTurn(deck, dealerHand);
				if(dealerBusted){ // Case: Dealer Busts
				    playerChoice = JOptionPane.showConfirmDialog(
				    	null, 
				    	"The dealer's hand: " +displayHand(dealerHand) + "\n \n Your hand: " 
				    		+ displayHand(playerHand) + "\nThe dealer busted.\n Congratulations!", 
				    	"You Win!!!", 
				    	JOptionPane.OK_CANCEL_OPTION
				    );		    

					if((playerChoice == JOptionPane.CLOSED_OPTION) || (playerChoice == JOptionPane.CANCEL_OPTION))
						System.exit(0);
				}
			
			
				else{ //The Dealer did not bust.  The winner must be determined
				    winner = whoWins(playerHand, dealerHand);

				    if(winner == 1){ //Player Wins
						playerChoice = JOptionPane.showConfirmDialog(
							null, 
							"The dealer's hand: " +displayHand(dealerHand) + "\n \n Your hand: " 
								+ displayHand(playerHand) + "\n Congratulations!", 
							"You Win!!!", 
							JOptionPane.OK_CANCEL_OPTION
						);

						if((playerChoice == JOptionPane.CLOSED_OPTION) || (playerChoice == JOptionPane.CANCEL_OPTION))
						    System.exit(0);
				    }

				    else{ //Player Loses
						playerChoice = JOptionPane.showConfirmDialog(
							null, 
							"The dealer's hand: " +displayHand(dealerHand) + "\n \n Your hand: " 
								+ displayHand(playerHand) + "\n Better luck next time!", 
							"You lose!!!", 
							JOptionPane.OK_CANCEL_OPTION
						); 
					
						if((playerChoice == JOptionPane.CLOSED_OPTION) || (playerChoice == JOptionPane.CANCEL_OPTION))
						    System.exit(0);
				    }
				}
		    }
		}while(true);
    }
}

class Card {
	// Specify data fields for an individual car
	public String rank;
	public String type; 

	public Card(String type, int rank){
		this.type = type;
		this.rank = "" + rank; 

		// Fill in constructor method
		
	}
	public Card(String type, String rank){
		this.rank = rank;
		this.type = type;

	}
	public String getRank(){
		return this.rank; 
	}
	public String getSymbol(){
		return this.type;
	}
	 

}