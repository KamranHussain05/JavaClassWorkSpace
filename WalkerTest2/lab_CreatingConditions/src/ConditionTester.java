/*
   This is the ConditionTester template. Use this class to test simple boolean methods!

   Author: Kamran Hussain
   Date: 11/21/21
   Rev: 01
   Notes: 
   
*/


import java.awt.Color;
import java.util.Scanner;

public class ConditionTester
{
  public static void main(String[ ] args)
  {
    Scanner kboard = new Scanner(System.in);

    // Copy-Paste more of these lines if more input is necessary
    System.out.print("Enter the first value --> ");
    int num1 = kboard.nextInt( );

//    System.out.print("Enter the second value --> ");
//    int num2 = kboard.nextInt( );
//    
//    System.out.print("Enter the third value --> ");
//    int num3 = kboard.nextInt( );
//
//    System.out.print("Enter the fourth number --> ");
//    int num4 = kboard.nextInt( );
//    
//    System.out.print("Enter the fifth number --> ");
//    int num5 = kboard.nextInt( );
//    
//    System.out.print("Enter the second number --> ");
//    int num6 = kboard.nextInt( );
    // Change this code so that it calls your method.
    Conditions myConditions = new Conditions();
    boolean result = myConditions.hasTwoEndingZeroes(num1);

    // Printing out the result of the test!
    System.out.println("The result of the test: " + result);

  }


}
