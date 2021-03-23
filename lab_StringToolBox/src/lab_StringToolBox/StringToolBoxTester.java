package lab_StringToolBox;

import java.util.Scanner;
import lab_StringToolBox.StringToolBox;

public class StringToolBoxTester {
	/*

	 This class tests all methods of the StringToolBox class.

	 To use this, comment out all methods that you haven't finished yet. Then
	 run - you should see the output on the left and right of all lines match!
	 

	*/

	public static void main(String[] args) {

	   StringToolBox stringTool = new StringToolBox();
	   
	   	System.out.println("***Testing: String nameEcho(String s)***");
	   	System.out.println("Fred JONES = " + stringTool.nameEcho("Fred jones"));
      
	   	System.out.println("***Testing: boolean endsWithStar(String s)***");
	   	System.out.println("true = " + stringTool.endsWithStar("abcd*"));
		System.out.println("false = " + stringTool.endsWithStar(""));

		System.out.println("***Testing: boolean endsWithTwoStars(String s)***");
		System.out.println("true = " + stringTool.endsWithTwoStars("abcd**"));
		System.out.println("false = " + stringTool.endsWithTwoStars("*"));
		System.out.println("false = " + stringTool.endsWithTwoStars(""));

		System.out.println("***Testing: String last4(String s)***");
		System.out.println("3456 = " + stringTool.last4("1234 5678 9012 3456"));

		System.out.println("***Testing: String last5(String s)***");
		System.out.println("23456 = " + stringTool.last5("1234 5678 9012 3456"));

		System.out.println("***Testing: String scroll(String s)***");
		System.out.println("23451 = " + stringTool.scroll("12345"));

		System.out.println("***Testing: String convertName(String s)***");
		System.out.println("Albert Einstein = " + stringTool.convertName("Einstein, Albert"));
		
		//Added Part 2 Tester, For method functional testing, menu is final version
		
		System.out.println("****Testing: String removeDashes(String s)***");
		System.out.println("987654321 = " + stringTool.removeDashes("987-65-4321"));
		
		System.out.println("*****Testing: String dateStr(String s)***");
		System.out.println("31-05-2019 = " + stringTool.dateStr("05/31/2019"));
		System.out.println("03-05-2019 = " + stringTool.dateStr("5/3/2019"));
		
		System.out.println("*****Testing: String negativeBits(String s)***");
		System.out.println("01010 = " + stringTool.negativeBits("10101"));
		
		System.out.println("*****Testing: boolean containsSameChar(String s");
		System.out.println("true = " + stringTool.containsSameChar("cccccc"));
		System.out.println("false = " + stringTool.containsSameChar("Cccccc"));
		System.out.println("false = " + stringTool.containsSameChar("vbnnnnn"));
		
		System.out.println("*****Testing: String removeComments(String s)");
		System.out.println("Hello, this is an  string with embedded comment indicators = " + stringTool.removeComments("Hello, this is an /* input /* string with embedded comment indicators"));
		
		
		
		
		//MENU
//		Scanner kboard = new Scanner(System.in);
//		StringToolBoxTester output = new StringToolBoxTester();
//		boolean running = true;
//		
//		do { 
//			System.out.println("---MENU---");
//			System.out.println("1) Name Echo");
//			System.out.println("2) Ends with Star");
//			System.out.println("3) Ends with Two Stars");
//			System.out.println("4) Return Last 4 Digits");
//			System.out.println("5) Return Last 5 Digits");
//			System.out.println("6) Scroll");
//			System.out.println("7) Convert Name to DB");
//			System.out.println("8) Remove Dashes");
//			System.out.println("9) Date String");
//			System.out.println("10) Negative Bits");
//			System.out.println("11) Contains Same Character");
//			System.out.println("12) Remove Comments");
//			System.out.println("13) Caeser Shift");
//			System.out.println("14) Palindrome Tester");
//			System.out.println("15) Password Checker");
//			System.out.println("x) Exit Menu");
//			System.out.println("---------");
//			String option = kboard.next();
//			
//			switch (option) {
//			case "1":
//				Scanner numCaseOne = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				String s = kboard.next();
//				stringTool.nameEcho(s);
//				break;
//			case "2":
//				Scanner numCaseTwo = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int numInputTwo = kboard.nextInt();
//				input.starSquare(numInputTwo);
//				
//				break;
//			case "3":
//				Scanner numCaseThree = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int numInputThree = kboard.nextInt();
//				input.printStarTriangle(numInputThree);
//				
//				break;
//			case "4":
//				Scanner numCaseFour = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int numInputFour = kboard.nextInt();
//				input.printInvertedStarTriangle(numInputFour);
//				
//				break;
//			case "5":
//				Scanner numCaseFive = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int numInputFive = kboard.nextInt();
//				input.printStarPyramid(numInputFive);
//				
//				break;
//			case "6":
//				Scanner numCaseSix = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int numInputSix = kboard.nextInt();
//				input.printStarDiamond(numInputSix);
//				
//				break;
//			case "7":
//				Scanner numCaseSeven = new Scanner(System.in);
//				System.out.println("Enter a value: ");
//				int numInputSeven = kboard.nextInt();
//				input.printScaleneTriangle(numInputSeven);
//			
//				break;
//			case "x":
//				running = false;
//				System.out.println("EXITED MENU");
//			}
//		} while(running==true);
	}
}