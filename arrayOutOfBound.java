package lab12;
import java.util.*;
public class arrayOutOfBound {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			int[] array = {2,6,1,9,7,3,0,5,2,8};
			System.out.println("Enter array Index Number ");
			int index = in.nextInt();
			System.out.println("The Number " +array[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out oF Bounds ");
		}
		

	}

}
