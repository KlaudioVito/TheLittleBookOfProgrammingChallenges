import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Hit enter when ready: ");
		in.nextLine();
		Calendar start = Calendar.getInstance();
		System.out.println("Hit enter when done: ");
		in.nextLine();
		Calendar end = Calendar.getInstance();
		Date s = start.getTime(), e = end.getTime();
		System.out.println("It took you " + (e.getTime()-s.getTime())/1000 + " second(s) between the two hits");
		
		in.close();
	}

}
