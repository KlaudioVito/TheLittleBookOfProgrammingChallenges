import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int input = in.nextInt();
		System.out.print("The factors of " + input + " are: ");
		for(int i = input-1; i > 1; i--){
			if(input%i==0) System.out.print(i + " ");
		}
		
		if(primality(input)) System.out.println("\nYour number is prime.");
		else System.out.println("\nYour number is not prime.");
		
		in.close();
	}
	private static boolean primality(long n){
		if(n > 2 && (n & 1) == 0) return false;
		for(int i = 3; i * i <= n; i += 2)
		    if (n % i == 0) return false;
		return true;
	}

}
