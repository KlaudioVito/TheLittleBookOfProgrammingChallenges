import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Which position in sequence? ");
		int position = in.nextInt();
		System.out.println("Fibonacci number is " + getFibonacci(position));
		
		in.close();
	}
	
	private static long getFibonacci(int position){
		if(position == 0) return 0;
		if(position <= 2) return 1;
		
		long fib = getFibonacci(position - 1) + getFibonacci(position - 2);
		return fib;
	}

}
