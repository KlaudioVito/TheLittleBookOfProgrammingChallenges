import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int s, t, d, t2;
		System.out.print("Enter speed: ");
		s = in.nextInt();
		System.out.print("Enter time: ");
		t = in.nextInt();
		d = s*t;
		System.out.println("Distance travelled: " + s*t);
		
		
		System.out.print("Enter desired time: ");
		t2 = in.nextInt();
		System.out.println("Should have travlled at a speed of " + d/t2);
		
		in.close();

	}

}
