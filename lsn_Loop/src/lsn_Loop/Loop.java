//Comment header above
package lsn_Loop;
import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in); //declare variable of scanner type
		int x; //value declaration
		
		System.out.println("Enter a positive integer:");
		x=kboard.nextInt(); //get the value and assign to x
		
		while (x>0) {
			System.out.println(x + " Hello, World!");
			x = x-1;
		}
		
	}
}
 