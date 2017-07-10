import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int[] code = new int[4];
		int[] guess = new int[4];
		for(int i = 0; i < code.length; i++) {
			code[i] = rnd.nextInt(10);
			System.out.print(code[i] + " ");
		}
		
		System.out.print("\n\nGuess 4 digit code: ");
		int input = in.nextInt();
		guess[3] = input%10;
		input /= 10;
		guess[2] = input%10;
		input /= 10;
		guess[1] = input%10;
		input /= 10;
		guess[0] = input%10;
		
		int lives = 12;
		while(lives > 0){
			
			int correctPlace = 0;
			for(int i = 0; i < code.length; i++){
				if(code[i]==guess[i]) correctPlace++;
			}
			System.out.println("You guessed " + correctPlace + " digit(s) in the correct place");
			if(correctPlace == 4) {
				System.out.println("You win!");
				break;
			}
			int count = 0;
			for(int i = 0; i < code.length; i++){
				for(int j = 0; j < guess.length; j++){
					if(code[i] == guess[j] && i != j) count++;
				}
			}
			System.out.println("You guessed " + count + " digit(s) but in the wrong place");
			
			System.out.println("Lives remaining: " + lives);
			System.out.print("Guess 4 digit code: ");
			input = in.nextInt();
			guess[3] = input%10;
			input /= 10;
			guess[2] = input%10;
			input /= 10;
			guess[1] = input%10;
			input /= 10;
			guess[0] = input%10;
			
			lives--;
			if(lives < 1){
				System.out.println("You lose!");
			}
		}
				 
		
		in.close();
	}

}
