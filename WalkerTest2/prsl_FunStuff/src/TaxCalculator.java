//Author: Kamran Hussain
//Date: 09/29/2020
//Rev: 04
//Notes: none

import java.awt.Container;
import java.util.Scanner;
import java.awt.*;
import javax.swing.JFrame;


public class TaxCalculator {
	
	//Original non GUI interfaced calculator
	public void Calculator () {
		
		System.out.println("Enter the price:");
		
		//Input Definitions
		@SuppressWarnings("resource")
		Scanner kboard = new Scanner(System.in);
		float x = kboard.nextFloat();
		
		
		//Calculation
		double k =(double)(x*(115.0f/100.0f));
		double scale = Math.pow(10, 2);
		k = Math.round(k*scale)/scale;
		
		//Produce Console output
		System.out.println("");
		System.out.println("The total will be: $"+ k);
		System.out.println("Remember to tip!");
		
		
		//Validate numerical input
	//	if (x== 'String') {
	//		System.out.println("Value must be a Number!");
	//	}	
	}

	

}
	


