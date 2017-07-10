import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = rnd.nextInt(10) + 20;
		System.out.println("Starting number: " + n);
		while(n > 0){
			System.out.print("How many do you want to remove? ");
			int player = in.nextInt();
			while(player < 1 || player > 3){
				System.out.print("Invalid input. How many do you want to remove?");
				player = in.nextInt();
			}
			if(n == 3 && player == 3){
				System.out.println("Computer wins");
				break;
			}
			else if (n == 2 && player == 2){
				System.out.println("Computer wins");
				break;
			}
			else if (n == 1 && player == 1){
				System.out.println("Computer wins");
				break;
			}
			n -= player;
			System.out.println(n + " left");
			
			int comp = 0;
			if(n == 1){
				System.out.println("You win");
				break;
			}
			else if (n == 2){
				n -= 1;
				System.out.println("Computer removes 1");
				System.out.println(n + " left");
			}
			else if(n == 3){
				n -= 2;
				System.out.println("Computer removes 2");
				System.out.println(n + " left");
			}
			else if (n > 3){
				comp = rnd.nextInt(3) + 1;
				System.out.println("Computer removes " + comp);
				
				if((n -= comp) > 0){
					System.out.println(n + " left");
				}
				else {
					System.out.println("You win");
					break;
				}
			}
			
		}
		
		in.close();
	}

}
