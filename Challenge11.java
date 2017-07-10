import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a logic (OR, AND, XOR, NAND, NOR): ");
		String userChoice = in.nextLine().toLowerCase();
		while(!userChoice.equals("or") && 
			  !userChoice.equals("and") && 
			  !userChoice.equals("xor") &&
			  !userChoice.equals("nand") &&
			  !userChoice.equals("nor")
			  ){
			System.out.print("Not a valid choice, try again: ");
			userChoice = in.nextLine();
		}
		
		System.out.print("Enter first input (0 or 1): ");
		int firstInput = in.nextInt();
		while(firstInput != 0 && firstInput != 1){
			System.out.print("Not a valid choice, try again: ");
			firstInput = in.nextInt();
		}
		
		System.out.print("Enter first input (0 or 1): ");
		int secondInput = in.nextInt();
		while(secondInput != 0 && secondInput != 1){
			System.out.print("Not a valid choice, try again: ");
			secondInput = in.nextInt();
		}
		
		if(userChoice.equals("or")){
			System.out.println("Result: " + (firstInput|secondInput));
		}
		else if(userChoice.equals("and")){
			System.out.println("Result: " + (firstInput&secondInput));
		}
		else if(userChoice.equals("xor")){
			System.out.println("Result: " + (firstInput^secondInput));
		}
		else if(userChoice.equals("nand")){
			int out = firstInput&secondInput;
			if(out == 1) out = 0;
			else if(out == 0) out = 1;
			System.out.println("Result: " + out);
		}
		else if(userChoice.equals("nor")){
			int out = firstInput|secondInput;
			if(out == 1) out = 0;
			else if(out == 0) out = 1;
			System.out.println("Result: " + out);
			
		}

		in.close();
	}

}
