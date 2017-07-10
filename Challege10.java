import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challege10 {

	/**
	 * @param args
	 */
	private static final String[] CHOICE = {"rock", "paper", "scissors"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int userScore = 0, compScore = 0;
		do{
			System.out.print("Enter rock, paper, or scissors: ");
			String userChoice = in.nextLine().toLowerCase();
			while(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
				System.out.print("Not a valid choice, try again: ");
				userChoice = in.nextLine();
			}
			
			int randomChoice = rnd.nextInt(3);
			String compChoice = CHOICE[randomChoice];
			
			if(userChoice.equals("rock")){
				if(compChoice.equals("rock")) System.out.println("Tie");
				if(compChoice.equals("paper")){
					System.out.println("Paper bets rock. You lose");
					compScore++;
				}
				if(compChoice.equals("scissors")){
					System.out.println("Rock bets scissors. You win");
					userScore++;
				}
			}
			else if(userChoice.equals("paper")){
				if(compChoice.equals("rock")){
					System.out.println("Paper bets rock. You win");
					userScore++;
				}
				if(compChoice.equals("paper")) System.out.println("Tie");
				if(compChoice.equals("scissors")) {
					System.out.println("Scissors beat paper. You lose");
					compScore++;
				}
			}
			else if(userChoice.equals("scissors")){
				if(compChoice.equals("rock")){
					System.out.println("Rock beats scissors. You lose");
					compScore++;
				}
				if(compChoice.equals("paper")){
					System.out.println("Scissors beat paper. You win");
					userScore++;
				}
				if(compChoice.equals("scissors")) System.out.println("Tie");
			}
			System.out.print("Hit enter to play again or any other character to terminate...\n");
		}while(in.nextLine().equals(""));
		
		System.out.println("\nFinal score\nUser:     " + userScore + "\nComputer: " + compScore);
		if(userScore > compScore) System.out.println("You win the game.");
		else if(userScore < compScore) System.out.println("You lose the game.");
		else System.out.println("It was a tie.");
		
		
		in.close();
	}

}
