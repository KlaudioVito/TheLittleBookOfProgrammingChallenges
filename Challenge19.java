import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Encode(E) or Decode(D)?");
		String choice = in.nextLine();
		choice = choice.toLowerCase();
		while(!choice.equals("e") && !choice.equals("d")){
			System.out.print("Invalid input. E or D?");
			choice = in.nextLine();
		}
		System.out.println("Enter sentence: ");
		String input = in.nextLine();
		System.out.println("Enter seed: ");
		int seed = in.nextInt();
		Cipher(input, seed, choice);
			
		in.close();
	}
	
	private static void Cipher(String input, int seed, String choice){
		Random rnd = new Random();
		if(choice.equals("e")){
			String encoded = "";
			for(int i = 0; i < input.length(); i++){
				int key = rnd.nextInt(seed);
				System.out.print(key + " ");
				if(input.charAt(i)+key > 'z') encoded += (char) ((int) input.charAt(i) - (26-key));
				else                          encoded += (char) ((int) input.charAt(i) + key);	
			}
			System.out.println("\nEncoded: " + encoded);
		}
		else if(choice.equals("d")){
			String decoded = "";
			for(int i = 0; i < input.length(); i++){
				int key = rnd.nextInt(seed);
				System.out.print(key + " ");
				
				if(input.charAt(i)-key < 'a') decoded += (char) ((int) input.charAt(i) + (26-key));
				else 						  decoded += (char) ((int) input.charAt(i) - key);
			}
			System.out.println("\nDecoded: " + decoded);		
		}	
	}
}
