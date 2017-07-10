import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge25 {

	/**
	 * @param args
	 */
	private static final String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
	private static final String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private static final int[][] dealt = new int[13][4];
	private static int card, suit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int playerScore = 0;
		int compScore = 0;
		int ifAce = 0;
		Boolean bust = false;
		System.out.println("Cards dealt to player: ");
		DealCard();
		if(card == 0){
			System.out.print("Do you want the Ace to be 1 or 11?");
			ifAce = in.nextInt();
			playerScore += ifAce;
		}
		playerScore += card+1;
		DealCard();
		if(card == 0){
			System.out.print("Do you want the Ace to be 1 or 11? ");
			ifAce = Integer.parseInt(in.nextLine());
			playerScore += ifAce;
		}
		playerScore += card+1;
		if(playerScore > 21) {
			System.out.println("Player score is " + playerScore + ".\nBust, computer wins");
			in.close();
			return;
		}
		else if (playerScore == 21){
			System.out.println("BLACKJACK!!!\nPlayer wins");
			in.close();
			return;
		}
		System.out.println("Player score is " + playerScore + ".\nDraw(d) or stick(s)?");
		String choice = in.nextLine();
		
		while(choice.equals("d")){
			DealCard();
			playerScore += card+1;
			if (playerScore == 21){
				System.out.println("BLACKJACK!!!\nPlayer wins");
				in.close();
				return;
			}
			System.out.println("Player score is " + playerScore);
			if(playerScore > 21) {
				System.out.println("Bust");
				bust = true;
				in.close();
				break;
			}
			System.out.println("Draw(d) or stick(s)?");
			choice = in.nextLine();
		}
		if(bust == false){
			System.out.println("Cards dealt to computer: ");
			DealCard();
			compScore += card+1;
			DealCard(); 
			compScore += card+1;
			System.out.println("Computer score is " + compScore);
			if(playerScore > compScore && compScore < 22){
				System.out.println("Player wins");
			}
			else System.out.println("Computer wins");	
		}
		else System.out.println("Computer wins");
		
		in.close();	
	}
	
	private static void DealCard(){
		Random rnd = new Random();
		card = rnd.nextInt(13);
		suit = rnd.nextInt(4);
		if(check(dealt) == 0){
			System.out.println("No more card");
		}
		else{
			while(dealt[card][suit] == 1){
				card = rnd.nextInt(13);
				suit = rnd.nextInt(4);
			}
			dealt[card][suit] = 1;
			System.out.println("The dealt card is: " + cards[card] + " of " + suits[suit]);	
		}
	}
	
	private static int check(int[][] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] == 0)
					count++;
			}
		}
		return count;
	}

}
