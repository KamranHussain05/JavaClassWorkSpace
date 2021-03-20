//Author: Kamran Hussain
//Date: 
//Rev: 02
//Notes: Attempted to validate string input

package lab_HelloWorldChoice;
import java.util.Scanner;

public class HelloWorldChoice {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		int x;
		
		System.out.println("Type an integer");
		x = kboard.nextInt();
		
		if(x==1) {
			System.out.println("Hello World!");	
		}
		
		
		if(x == 2)
            System.out.println("Holla Mundo!");   
        else if(x > 0) {
            System.out.println(new String(new char[x]).replace("\0", "Hello, World!\n"));
        }	
	
		//System.out.println("Type a String or Character");
		Object Text = kboard.nextLine();
		if(Text instanceof String) { 
				System.out.println("You didn't enter an Integer :(");
		}
		
	}
}