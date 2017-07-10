import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int[][] arr = new int[10][10];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = rnd.nextInt(15);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n\n");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print("\033[" + arr[i][j] + "m\t\033[0m" );
			}
			System.out.println();
		}
	}
}
