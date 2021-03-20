// Author: Kamran Hussain
// Date: 1/21/21
// Rev 01
// Notes: Want to expand in src documentation to make it more programmer friendly

package lab_Stars;

import java.util.Scanner;

public class StarTester {

	public static void main(String[] args) {
		//Declaration for scanners and variabes for input mapping and menu options
		Scanner kboard = new Scanner(System.in);
		StarTester output = new StarTester();
		Stars input = new Stars();
		boolean running = true;
		
		//Begins the do loop so the menu can be closed
		do {
			//Menu and options
			System.out.println("---MENU---");
			System.out.println("1) Print Stars");
			System.out.println("2) Star Squares");
			System.out.println("3) Star Triangle");
			System.out.println("4) Inverted Star Triangle");
			System.out.println("5) Star Pyramid");
			System.out.println("6) Star Diamond");
			System.out.println("7) Upside Down Pyramid");
			System.out.println("x) Exit Menu");
			System.out.println("---------");
			String option = kboard.next();
			
			//Method assignment Decisions, Inputs are assigned to methods and required input values requested
			switch (option) {
			case "1":
				Scanner numCaseOne = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int numInput = kboard.nextInt();
				input.printStars(numInput);
				
				break;
			case "2":
				Scanner numCaseTwo = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int numInputTwo = kboard.nextInt();
				input.starSquare(numInputTwo);
				
				break;
			case "3":
				Scanner numCaseThree = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int numInputThree = kboard.nextInt();
				input.printStarTriangle(numInputThree);
				
				break;
			case "4":
				Scanner numCaseFour = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int numInputFour = kboard.nextInt();
				input.printInvertedStarTriangle(numInputFour);
				
				break;
			case "5":
				Scanner numCaseFive = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int numInputFive = kboard.nextInt();
				input.printStarPyramid(numInputFive);
				
				break;
			case "6":
				Scanner numCaseSix = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int numInputSix = kboard.nextInt();
				input.printStarDiamond(numInputSix);
				
				break;
			case "7":
				Scanner numCaseSeven = new Scanner(System.in);
				System.out.println("Enter a value: ");
				int numInputSeven = kboard.nextInt();
				input.printScaleneTriangle(numInputSeven);
			
				break;
			case "x":
				running = false;
				System.out.println("EXITED MENU");
			} 
		} while(running==true);
	
	}

}
