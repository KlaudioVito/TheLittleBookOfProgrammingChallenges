import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge9 {

	/**
	 * @param args
	 */
	private static final String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
	private static final String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private static int card, suit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("Hit enter to generate card or any other character to exit: ");
		String input = in.nextLine();
		while(input.equals("")){
			card = rnd.nextInt(13);
			suit = rnd.nextInt(4);
			System.out.println("Random card is: " + cards[card] + " of " + suits[suit]);
			System.out.print("\nHit enter to generate card or any other character to exit: ");
			input = in.nextLine();
		}
		
		in.close();
	}
}
