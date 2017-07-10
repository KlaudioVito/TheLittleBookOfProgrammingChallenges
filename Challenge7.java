import java.util.*;

/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge7 {

	/**
	 * @param args
	 */
	private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Hit enter when ready...");
		in.nextLine();
		ArrayList<Long> record = new ArrayList<>();
		do{
			Calendar start = Calendar.getInstance();
			System.out.println("Enter the english alphabet in a single line without spaces: ");
			String s = in.nextLine();
			s = s.toLowerCase();
			Calendar end = Calendar.getInstance();
			Date startDate = start.getTime(), endDate = end.getTime();
			long diffSeconds = (endDate.getTime() - startDate.getTime() ) / 1000;
			if(s.equals(alphabet)){
				System.out.println("It took you " + diffSeconds + " seconds to type the alphabet.");
				record.add(diffSeconds);
			}
			else{
				System.out.println("The alphabet is incorrect.");
			}
			System.out.print("Hit enter to play again or enter any other character to finish...");
		}while(in.nextLine().equals(""));
		
		record.sort(null);
		System.out.println("Best time achieved: " + record.get(0) + " seconds");
		
		
		
		in.close();
	}

}
