import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Player 1, type a word: ");
		String word = in.nextLine();
		char[] guess = new char[word.length()];
		for(int i = 0; i < guess.length; i++) guess[i] = '*';
		int lives = 5;
		while(lives > 0){
			System.out.print("Word to guess: ");
			print(guess);
			System.out.print("Player 2, you have " + lives + " lives left - Letter: ");
			String input = in.nextLine();
			char letter = 0;
			if(input.length() == word.length() && input.equals(word)){
				System.out.println("You guessed it");
				in.close();
				return;
			}
			else{
				letter = input.charAt(0);
			}
			
			for(int i = 0; i < word.length(); i++){
				if(word.charAt(i) == letter) guess[i] = letter;
			}
			lives--;
			if(lives < 1) System.out.println("You lose!");
		}
		in.close();
	}
	
	private static void print(char[] arr){
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println();
	}

}
