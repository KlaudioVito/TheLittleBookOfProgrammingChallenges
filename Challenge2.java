import java.util.Scanner;

/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Hello " + name);
		in.close();

	}

}
