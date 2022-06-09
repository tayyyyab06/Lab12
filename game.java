package lab12;
import java.util.*;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter Input 1 ");
			int num1 = in.nextInt();
			
			System.out.println("Enter Input 2 ");
			int num2 = in.nextInt();
			
			System.out.println("The answer is  "+num1/num2);
		}
		catch(ArithmeticException e ) {
			System.out.println("Number can't be divide by 0");
		}
		
		catch(Exception e ) {
			System.out.println("Invalid input");
		}
	}
}
