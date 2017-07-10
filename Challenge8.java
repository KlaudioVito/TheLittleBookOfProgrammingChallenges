import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Calendar bday = Calendar.getInstance(), today = Calendar.getInstance();
		System.out.print("Enter birthday (yyyy mm dd): ");
		bday.set(in.nextInt(), in.nextInt()-1, in.nextInt());
		
		int diffYear = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);
		if(bday.get(Calendar.DAY_OF_YEAR) < today.get(Calendar.YEAR)) diffYear--;
		
		if(diffYear > 18) System.out.println("You can vote!");
		else System.out.println("You cannot vote!");
		
		in.close();

	}

}
