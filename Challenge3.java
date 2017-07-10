import java.util.Scanner;

/**
 * 
 */

/**
 * @author kvito
 *
 */
public class Challenge3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int w, l, h;
		System.out.print("Please enter width: ");
		w = in.nextInt();
		System.out.print("Please enter length: ");
		l = in.nextInt();
		System.out.print("Please enter height: ");
		h = in.nextInt();
		System.out.println("Area of rectangle is: " + w*l);
		System.out.println("Volume of cuboid is: " + w*l*h);
		in.close();
		/*
		 * If you don't type a number, an InputMismatchException will occur.
		 */

	}

}
