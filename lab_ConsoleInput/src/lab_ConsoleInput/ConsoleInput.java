package lab_ConsoleInput;
import java.util.Scanner;

public class ConsoleInput {

	public static void main(String [] args) {

	Scanner kboard = new Scanner(System.in);
	
	//Addition numbers and Part 1
	System.out.println("Enter a number: "); //assign to a
	float a = kboard.nextFloat();
	
	System.out.println("Enter a number:"); //assign to b
	float b = kboard.nextFloat();
	
	System.out.println("the sum is:");
	System.out.println(""+ (int)(a+b));
	
	//-------------
	
	//Multiplication numbers and Part 2
	
	System.out.println("Enter a number: "); //assign to a 
	a = kboard.nextFloat();
	
	System.out.println("Enter a number:"); //assign to b
	b = kboard.nextFloat();
	
//output
	System.out.println("The product is: " + (int) (a*b));
	
	}

}
