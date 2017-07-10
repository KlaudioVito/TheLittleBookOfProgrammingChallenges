import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[10][10];
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int x = rnd.nextInt(10);
		int y = rnd.nextInt(10);
		arr[x][y] = 1;
		print2Darray(arr);
		System.out.print("\nEnter x coordinate: ");
		int x1 = in.nextInt();
		System.out.print("Enter y coordinate: ");
		int y1 = in.nextInt();
		
		while(arr[x1][y1] != 1){
			int diffX = Math.abs(x1-x);
			int diffY = Math.abs(y1-y);
			int diff = diffX + diffY;
			if(diff < 6) System.out.println("--->Hot<---");
			else if(diff > 5 && diff < 11) System.out.println("-->Warm<--");
			else if(diff > 10) System.out.println("->Cold<-");
			System.out.print("\nEnter x coordinate: ");
			x1 = in.nextInt();
			System.out.print("Enter y coordinate: ");
			y1 = in.nextInt();
		}
		System.out.println("Success");
		in.close();
	}
	
	private static void print2Darray(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
