import java.util.Scanner;

/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge1 {

	/**
	 * @param args
	 */
	public static final String ANSI_BLUE = "\u001B[34m";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Why did Peter Pan fail as a stand-up comedian?\nHit enter to reveal: ");
		Scanner s = new Scanner(System.in);
		while(!s.nextLine().equals("")){
			System.out.print("Hit ENTER to reveal punch line: ");
		}
		System.out.println("\033[34mBecause his jokes Neverland!\033[0m");
		s.close();
	}

}
