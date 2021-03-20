//Atuhor: Kamran Hussain
//Date: 12/4/2020
//Rev 01
//Notes

import java.util.Scanner;

public class DogYearsTester {
	
//CONVERT TO DOG YEARS CLASS OUTPUT
	public static void main (String[] args) {
		// TAKE IN USER INPUT
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter human years value now");
		int humanYears = keyboard.nextInt();

		DogYears converter = new DogYears();
		int dogYears = converter.convertToDogYears(humanYears);

		// PRINT OUT THE RESULT
		System.out.println("The result is: " + dogYears + " dog years");
		
		keyboard.close();
	}
	 /*
//CONVERT TO HUMAN YEARS CLASS OUTPUT
	public static void main (String[] args) {
		// TAKE IN USER INPUT
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter dog years value now");
		int dog = keyboard.nextInt();

		DogYears converter = new DogYears();
		int human = converter.convertToHumanYears(dog);

		// PRINT OUT THE RESULT
		System.out.println("The result is: " + human + " human years");
		
		keyboard.close();
	}
*//*
//CONVERT TO DOG MONTHS CLASS OUTPUT
	public static void main (String[] args) {
		// TAKE IN USER INPUT
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter human years value now"); 
		int humanYear = keyboard.nextInt();

		DogYears converter = new DogYears();
		int dogMonths = converter.convertHumanToDogMonths(humanYear);

		// PRINT OUT THE RESULT
		System.out.println("The result is: " + dogMonths + " dog months");
		
		keyboard.close();
	}
	*/
}
