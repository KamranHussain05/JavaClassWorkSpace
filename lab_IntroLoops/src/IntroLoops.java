//Author: Kamran Hussain
//Date: 01/21/2021
//Rev: 01
//Notes: none

import java.util.Scanner;


public class IntroLoops {

	private static MainLoops loop;
	public static void main(String[] args) {
		boolean x = false; //Step 6
		
		do { //Part of Step 6
			//create a variable 
			IntroLoops output = new IntroLoops();
			MainLoops loop = new MainLoops(0, 0, 0, 0, null, null, null, 0);
	//Prints the menu and options on the console
			Scanner kboard = new Scanner(System.in);
			System.out.println("---MENU---");
			System.out.println("What would you like to see?");
			System.out.println("1) Division");
			System.out.println("2) Exercise 1");
			System.out.println("3) Exercise 2");
			System.out.println("4) Exercise 3");
			System.out.println("5) Choice Prompt");
			System.out.println(""
					+ "x) Quit");
			System.out.print("-----> ");
			String menuChoice = kboard.next(); //Creates the string variable and assigns the input value to it
	//Step 1
		//Identifies what the input value is and chooses which methods to use and assigns the input values
			
			if (menuChoice.equals("1")) {
				Scanner numCaseOne = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int m = kboard.nextInt();
				System.out.println("Enter another value: ");
				int n = kboard.nextInt();
				output.divide(m, n);
			} else if (menuChoice.equals("2")) {
				Scanner numCaseTwo = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int start = kboard.nextInt();
				System.out.println("Enter another value: ");
				int end = kboard.nextInt();
				output.printSeries(start, end);
			} else if (menuChoice.equals("3")) {
				Scanner numCaseThree = new Scanner(System.in);
				System.out.println("Enter a word: ");
				String word = kboard.next();
				output.repeatWord(word);
			} else if (menuChoice.equals("4")) {
				Scanner numCaseFour = new Scanner(System.in);
				System.out.println("Enter a word: ");
				String word1 = kboard.next();
				System.out.println("Enter another word: ");
				String word2 = kboard.next();
				output.printIndexLine(word1, word2);
			} else if(menuChoice.equals("5")) {
				Scanner numCaseFive = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int n1 = kboard.nextInt();
				output.choicePrompt(n1);
			} else if(menuChoice.equals("x")) {		//Step 6
				x = true;
				System.out.println("EXITED MENU");    //Confirmation that menu has closed
			}
			
//	//EXPIREMENTATION created new class for methods
//			if (menuChoice.equals("1")) {
//				Scanner numCaseOne = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int m = kboard.nextInt();
//				System.out.println("Enter another value: ");
//				int n = kboard.nextInt();
//				loop.divide(m, n);
//			} else if (menuChoice.equals("2")) {
//				Scanner numCaseTwo = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int start = kboard.nextInt();
//				System.out.println("Enter another value: ");
//				int end = kboard.nextInt();
//				loop.printSeries(start, end);
//			} else if (menuChoice.equals("3")) {
//				Scanner numCaseThree = new Scanner(System.in);
//				System.out.println("Enter a word: ");
//				String word = kboard.next();
//				loop.repeatWord(word);
//			} else if (menuChoice.equals("4")) {
//				Scanner numCaseFour = new Scanner(System.in);
//				System.out.println("Enter a word: ");
//				String word1 = kboard.next();
//				System.out.println("Enter another word: ");
//				String word2 = kboard.next();
//				loop.printIndexLine(word1, word2);
//			} else if(menuChoice.equals("5")) {
//				Scanner numCaseFive = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int n1 = kboard.nextInt();
//				loop.choicePrompt(n1);
//			} else if(menuChoice.equals("x")) {		//Step 6
//				x = true;
//				System.out.println("EXITED MENU"); //Confirmation that menu has closed
//			} 
			
//	//EXPIREMENTION used switch instead of if loops
//			switch (menuChoice) {
//			case "1":
//				Scanner numCaseOne = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int m = kboard.nextInt();
//				System.out.println("Enter another value: ");
//				int n = kboard.nextInt();
//				loop.divide(m, n);
//				break;
//			case "2":
//				loop.printSeries(10, 1);;
//				break;
//			case "3":
//				Scanner numCaseThree = new Scanner(System.in);
//				System.out.println("Enter a word: ");
//				String word = kboard.next();
//				loop.repeatWord(word);
//				break;
//			case "4":
//				Scanner numCaseFour = new Scanner(System.in);
//				System.out.println("Enter a word: ");
//				String word1 = kboard.next();
//				System.out.println("Enter another word: ");
//				String word2 = kboard.next();
//				loop.printIndexLine(word1, word2);
//				break;
//			case "5":
//				Scanner numCaseFive = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int n1 = kboard.nextInt();
//				loop.choicePrompt(n1);
//				break;
//			case "x":
//				x = true;
//				System.out.println("EXITED MENU");
//				break;
//			} 
		} while (x == false); //Keeps window open when boolean x is false, closes when true
	} 

//METHODS 

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