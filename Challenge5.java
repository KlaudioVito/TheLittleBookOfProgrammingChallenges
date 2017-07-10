import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Calendar bday = Calendar.getInstance(), today = Calendar.getInstance();
		int d, m, y;
		System.out.print("Enter date (1-31) of birth: ");
		d = in.nextInt();
		System.out.print("Enter month (1-12) of birth: ");
		m = in.nextInt() - 1;
		System.out.print("Enter year of birth: ");
		y = in.nextInt();
		bday.set(y, m, d);
		Date start = bday.getTime(), end = today.getTime();
		long diffDays = (end.getTime()-start.getTime())/(1000*60*60*24);
		System.out.println("Days lived: " + diffDays);
		long diffSeconds = (end.getTime()-start.getTime())/1000;
		System.out.println("Seconds lived: " + diffSeconds);
				
		in.close();

	}

}
