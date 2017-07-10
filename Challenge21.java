import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String, Integer> inputs = new Hashtable<>();
		System.out.print("Enter name: ");
		String next = in.nextLine();
		while(!next.equals("exit")){
			if(inputs.containsKey(next)){
				int value = inputs.get(next);
				inputs.replace(next, value+1);
				
			}
			else{
				inputs.put(next, 1);
			}
			System.out.print("Enter name: ");
			next = in.nextLine();
		}
		
		for(Map.Entry<String, Integer> pair : inputs.entrySet()){
			if(pair.getValue() > 1){
				System.out.println(pair.getKey() + " is a duplicate (" + pair.getValue() + " times)" ) ;
			}
		}
		
		in.close();
	}

}
