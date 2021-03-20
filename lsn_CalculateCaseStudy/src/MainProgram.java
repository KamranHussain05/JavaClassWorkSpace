package src;

import java.util.Scanner;

public class MainProgram 
{

   public static void main(String[] args) {
      
	   Calculator myTI30x;
      Scanner myKboard;
      int fNum, sNum, result;
      
      fNum = 0;
      sNum = 0;
      result = 0;
      
      myKboard = new Scanner(System.in);
      myTI30x = new Calculator();
      
      System.out.println("Input a number:");
      fNum = myKboard.nextInt();
      
      System.out.println("Input a number:");
      sNum = myKboard.nextInt();
      
      result = myTI30x.add(fNum, sNum);
      
      System.out.println(fNum + 
                          " + " + 
                          sNum + 
                         " = " + 
                         result);
      myKboard.close();
      
   }

}
