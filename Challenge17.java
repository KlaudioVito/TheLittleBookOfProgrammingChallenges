import java.util.*;
/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int mod1max, mod1, mod2max, mod2;
		
		System.out.print("Enter Module 1 max points: ");
		mod1max = in.nextInt();
		
		System.out.print("Enter Module 1 result: ");
		mod1 = in.nextInt();
		
		System.out.print("Enter Module 2 max points: ");
		mod2max = in.nextInt();
		
		System.out.print("Enter Module 2 result: ");
		mod2 = in.nextInt();
		
		calcMark(mod1max, mod1, mod2max, mod2);
		
		in.close();
	}
	
	private static void calcMark(int mod1max, int mod1, int mod2max, int mod2){
		System.out.println();
		double mod1per = (double)mod1/mod1max;
		if(mod1per >= 0.8) System.out.println("Module 1: A");
		else if(mod1per < 0.8 && mod1per >= 0.7) System.out.println("Module 1: B");
		else if(mod1per < 0.7 && mod1per >= 0.6) System.out.println("Module 1: C");
		else if(mod1per < 0.6 && mod1per >= 0.5) System.out.println("Module 1: D");
		else if(mod1per < 0.5) System.out.println("Module 1: F");
		
		
		double mod2per = (double)mod2/mod2max;
		if(mod2per >= 0.8) System.out.println("Module 2: A");
		else if(mod2per < 0.8 && mod2per >= 0.7) System.out.println("Module 2: B");
		else if(mod2per < 0.7 && mod2per >= 0.6) System.out.println("Module 2: C");
		else if(mod2per < 0.6 && mod2per >= 0.5) System.out.println("Module 2: D");
		else if(mod2per < 0.5) System.out.println("Module 2: F");
		
		double asPerc = (mod1per+mod2per)/2;
		if(asPerc >= 0.8) System.out.println("AS Level: A");
		else if(asPerc < 0.8 && asPerc >= 0.7) System.out.println("AS Level: B");
		else if(asPerc < 0.7 && asPerc >= 0.6) System.out.println("AS Level: C");
		else if(asPerc < 0.6 && asPerc >= 0.5) System.out.println("AS Level: D");
		else if(asPerc < 0.5) System.out.println("AS Level: F");
		
		
	}

}
