import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of spaces: ");		
		int s = in.nextInt();
		System.out.print("Enter number of asterisks: ");
		int a = in.nextInt();
		Drawstars(s,a);
		System.out.print("\nEnter pyramid base: ");
		int base = in.nextInt();
		while(base % 2 == 0){
			System.out.print("Base must be odd: ");
			base = in.nextInt();
		}
		Drawstars(base);
		in.close();
	}
	private static void Drawstars(int s, int a){
		for(int i = 0; i < s; i++) System.out.print(" ");
		for(int i = 0; i < a; i++) System.out.print("*");
	}
	
	private static void Drawstars(int base){
		for (int i = 1; i <= base; i++) {
			for (int j = 1; j <= base - i; j++) System.out.print(" ");
	        for (int j = 1; j <= 2*i - 1; j++)  System.out.print("*"); 
	        System.out.println();
		}
		System.out.println();
	}

}
