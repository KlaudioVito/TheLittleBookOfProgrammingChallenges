import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = in.nextLine();
		String[] original = input.split("\\s+");
		input = input.replaceAll("[!?,.:;'/`]", "");
		String[] words = input.split("\\s+");
		System.out.println("There are " + words.length + " words in your sentence");
				
		String[] reversed = new String[original.length];
		for(int i = original.length-1; i >= 0; i--){
			reversed[original.length-i-1] = original[i];
		}
		System.out.print("Your sentece reversed is: ");
		for(String s : reversed){
			System.out.print(s + " ");
		}
		
		in.close();
	}

}
