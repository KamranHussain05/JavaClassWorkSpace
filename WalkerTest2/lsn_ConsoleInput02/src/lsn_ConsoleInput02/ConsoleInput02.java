//Author: Kamran Hussain
//Date: 
//Rev 02
//notes: 

package lsn_ConsoleInput02;
//Comment Header above
import java.util.Scanner;

public class ConsoleInput02 {
	public static void main(String[] args) {
		Scanner kboard;  //declare a variables of scanner type
		String firstName; //declare a variable of String type
		
		kboard = new Scanner(System.in); //instantiate scanner
 		System.out.println("Enter first name"); //prompt user
		firstName = kboard.nextLine(); //get the value into x
		System.out.println(firstName + " is your first name!"); 
		
		//String lastName;
		//kboard = new Scanner(System.in);
		//System.out.println("Enter last name");
		//lastName = kboard.nextLine();
		//System.out.println("Your full name is: " +firstName +lastName);
			
		
	}
	
}
