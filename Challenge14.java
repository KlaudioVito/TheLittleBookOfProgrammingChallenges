import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		Random rnd = new Random();
		int turns = 10, lives = 2, n1 = 0, n2;
		
		System.out.println("You have 2 lives");
		n1 = rnd.nextInt(13) + 1;
		System.out.println("Starting number: " + n1);
		
		while(turns > 0 && lives > 0){
			n2 = rnd.nextInt(13) + 1;
			System.out.print("Higher(H) or Lower(L)?");
			String choice = in.nextLine();
			while(!choice.equals("L") && !choice.equals("H")){
				System.out.print("Invalid input. Higher(H) or Lower(L)?");
				choice = in.nextLine();
			}
			
			if(choice.equals("H") && n2 < n1){
				System.out.println("You lose");
				lives--;
				System.out.println("You have " + lives + " lives");
			}
			else if(choice.equals("L") && n2 > n1){
				System.out.println("You lose");
				lives--;
				System.out.println("You have " + lives + " lives");
			}
			else{
				System.out.println("Next number " + n2);
				n1 = rnd.nextInt(13) + 1;
			}
			turns--;
			System.out.println();
			if(turns == 0 && lives > 0){
				System.out.println("You win");
			}
			
		}
		
		in.close();
	}

}
