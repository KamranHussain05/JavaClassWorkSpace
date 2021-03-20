// Author: Kamran Hussain
// Date: 1/23/21
// Rev: 01
// Notes: 

public class MainLoops {
	
	public MainLoops(int m, int n, int start, int end, String word, String word1, String word2, int n1) {
		// TODO Auto-generated constructor stub
	}
	
	//Step 2
	public void divide(int m, int n) {  //Input integer variables of m is the dividend and n is the divisor
		int i  = 0; // i is declared and assigned the value of 0 to be changed when the loop is run
		while (m>=n) { //The condition values are changed so it is false when the calculations are finished
			m = m-n; //decreases the value of m to terminate the loop, m is the remainder
			i = i+1; //increases the value of i which is the number of times the loop has run
		}	
		System.out.println("The quotient is: " + i); //Prints the quotient from the calculation(the value of i) to the console
		System.out.println("The remainder is: " + m); //Prints the remainder from the calculation (the value of m) to the console
	}
	
	// Step 3
	public void printSeries(int start, int end) { //Two inputs that are integers for starting and ending values of the series
		int i = end-1; //the starting value of the sequence
		while (start>=end) { //
			start = start-1; //Changes the value of start to make the while condition false and terminate the loop
			i = i+1; //The value of i is changed to represent a proper value and 
			System.out.println(i); //Prints the value of i every time the loop is executed
		}
	}
	
	//Step 4
	public void repeatWord(String word) { //This method has an input of a single string whose characters are counted
		int times; //Declares the integer variable that represents the number of characters in the string
		times = word.length();
		int i = 0; //The number of loops
		while (times-1>=i) { //loops the printing of the word until i is greater than the number of letters(the loop is terminated in a false condition)
			System.out.println(word); //Prints the word to the console
			i = i+1; //Changes the value of i so the loop terminates after it has been printed the number of times there are characters
		}
	}
	
	//Step 5
	public void printIndexLine(String word1, String word2) { //Has two string inputs and outputs two string as console prints
		int wordCount = word1.length() + word2.length(); //Counts the number of characters from the inputed words
		int spacing = 30 - wordCount; //Separates the number of typed words from the number of required dots
		System.out.print(word1); //Prints the first input word before the dots
		for (int i  = 0; i < spacing; i++) { //adds periods until the line character number is exactly 30
			System.out.print("."); //prints the dots to the console in between the inputed strings
		}
		System.out.print(word2); //Prints the second input words after the dots
	}
	
	//Step 7
	public void choicePrompt(int n1) { //The only input is the limiting value, so the formula calculates the sum of all numbers before the limiter
		double sum = 0; //declares the printed variable that is modified by the loop
		for (int i = 1; i<= n1; i++) { //declares the integer var of i and modifies the value to 
			sum+=1.0/(double)i; //equation that adds the previous integer to the current value of sum
		}
		System.out.println("The sum is: " +sum); //Prints the calculate values after the loop is false to the console
	}
	
}
