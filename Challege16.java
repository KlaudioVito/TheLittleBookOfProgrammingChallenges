import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challege16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.print("You guess (1) or computer guesses (2)?");
		String choice = in.nextLine();
		while(!choice.equals("1") && !choice.equals("2")){
			System.out.print("Invalid input. Enter 1 or 2: ");
			choice = in.nextLine();
		}
		
		if(choice.equals("1")){
			int comp = rnd.nextInt(100) + 1;
			int user = 0, count = 1;
			System.out.print("Guess the number (1-100):");
			user = in.nextInt();
			while(user != comp){
				if(user > comp){
					System.out.print("Too high. Guess again (1-100):");
					user = in.nextInt();
					count++;
				}
				else if (user < comp){
					System.out.print("Too low. Guess again (1-100):");
					user = in.nextInt();
					count++;
				}
			}
			System.out.println("Got it! It took you " + count + " attempts to get it.");
		}
		else if (choice.equals("2")){
			System.out.println("Think of a number between 1 and 100");
			int comp = rnd.nextInt(100) + 1;
			int count = 1;
			System.out.println("Computer guesses " + comp);
			System.out.print("Is the guess too high(H), too low(L), or did the computer get it(G)?");
			String user = in.nextLine();
			while(!user.equals("H") && !user.equals("L") && !user.equals("G")){
				System.out.print("Invalid input. H, L, or G?: ");
				user = in.nextLine();
			}
			while(!user.equals("G")){
				if(user.equals("H")){
					comp = rnd.nextInt(comp) + 1;
					count++;
					System.out.println("Computer guesses " + comp);
					System.out.print("Is the guess too high(H), too low(L), or did the computer get it(G)?");
					user = in.nextLine();
					while(!user.equals("H") && !user.equals("L") && !user.equals("G")){
						System.out.print("Invalid input. H, L, or G?: ");
						user = in.nextLine();
					}

				}
				if(user.equals("L")){
					comp = rnd.nextInt(100 - comp) + comp;
					count++;
					System.out.println("Computer guesses " + comp);
					System.out.print("Is the guess too high(H), too low(L), or did the computer get it(G)?");
					user = in.nextLine();
					while(!user.equals("H") && !user.equals("L") && !user.equals("G")){
						System.out.print("Invalid input. H, L, or G?: ");
						user = in.nextLine();
					}
				}
			}
			System.out.println("It took the computer " + count + " attempts to get it.");
			
		}
		in.close();
	}

}
