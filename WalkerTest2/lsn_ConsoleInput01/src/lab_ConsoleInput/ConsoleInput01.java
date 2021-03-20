//Author: Kamran Hussain
//Date: 
//Rev 01
//Notes

package lab_ConsoleInput;

//comment header above
import java.util.Scanner;

public class ConsoleInput01 {
	public static void main(String[]args) {
		
		Scanner kboard; //declare a variable
		String enteranumber;
		
		kboard = new Scanner(System.in);
		System.out.println("Enter A Number");
		
		enteranumber = kboard.nextLine();
		System.out.println(enteranumber + " is the number you entered"); 
		
		//int x;
		//x = enteranumber * 2;
		//System.out.println(x + " is the twice the number you entered");
				
	
		
	}
}
