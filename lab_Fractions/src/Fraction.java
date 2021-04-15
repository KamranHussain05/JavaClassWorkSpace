// Author: Kamran Hussain
// Date: 3/27/2021
// Rev 01
// Notes: 
// Represents a fraction with an int numerator and int denominator
// and provides methods for adding and multiplying fractions.

public class Fraction
{
  // *** instance variables ***
  private int num;
  private int denom;

  // *** Constructors ***

  public Fraction()       // no-args constructor
  {
    num = 0;
    denom = 1;
  }

  public Fraction(int n)
  {
    num = n;
    denom = 1;
  }
  //***********Added the constructor for inputs that are doubles*********************
  public Fraction(double x) {
	  denom =1; //sets the denominator to 1
      while ( x != (int)x) { //checks if the input is an integer
          if ( x >= java.lang.Integer.MAX_VALUE/10) {  //calculates the decimal form of the fraction for the denominator
              break;
          }
          x *= 10;
          denom *= 10; //changes the denominator
      }
      num = (int)x; //calculates the numerator
  }
//***********************************************************************************
  public Fraction(int n, int d)
  {
    if (d != 0)
    {
      num = n;
      denom = d;
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }

  public Fraction(Fraction other)  // copy constructor
  {
    num = other.num;
    denom = other.denom;
  }

  // *** public methods ***

  // Returns the sum of this fraction and other
  public Fraction add(Fraction other)
  {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the sum of this fraction and m
  public Fraction add(int m) 
  {
    return new Fraction(num + m * denom, denom);
  }
  //*****************Added the subtract method**************************
  public Fraction subtract(Fraction f) { //subtracts two fractions
	  int newNum = num * f.denom - denom*f.num; //sets the same denominator for both inputs
	  
	  int newDenom = denom * f.denom;
	  return new Fraction(newNum, newDenom);
  }
  //*****************Added the second subtract method***************************
  public Fraction subtract(int m) {
	return new Fraction (num-m *denom, denom);
  }
//**************************************************************************************************
  // Returns the product of this fraction and other
  public Fraction multiply(Fraction other) //Multiply's two inputted fractions
  {
    int newNum = num * other.num; //multiplies the numerators
    int newDenom = denom * other.denom; //multiplies thedenominators
    return new Fraction(newNum, newDenom); //returns the new fraction
  }

  // Returns the product of this fraction and m
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom); //multiplies the two numerators because the denominator of m is 1, so it is irrelavent in this equation
  }
  //******************Added the divide method****************************
  public Fraction divide(Fraction f) { //flips the fraction and cross multiplies
	int newNum = num*f.denom; //multiples the numerator by the other fractions denominator
	int newDenom = denom * f.num; //multiples the denominator by the other numerator
	return new Fraction(newNum, newDenom); //returns the resulting fraction
  }
  //*******************Added the second divide method***********************
  public Fraction divide(int m) {
	return new Fraction(num, denom*m); //multiplies the denominator by m because the numerator is 1 which is irrelavent in this equation
  }
//*************************************************************************************************
  // Returns the value of this fraction as a double
  public double getValue()
  {
    return (double)num / (double)denom; 
  }

  // Returns a string representation of this fraction
  public String toString()
  {
    return num + "/" + denom;
  }
  
//********************Research and Development****************************
  public double toDecimal(int num, int denom) {
	double result = num/denom; //divides the numerator by the denominator, turning it into a decimal
	return result; //returns the new decimal.
  }

  // *** private methods ***

  // Reduces this fraction by the gcf and makes denom > 0
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;    
  }

  //  Returns the greatest common factor of two positive integers
  private int gcf(int n, int d)
  {
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    if (n % d == 0)
      return d;
    else if (d % n == 0)
      return n;
    else
      return gcf(n % d, d % n); 
  }
}

/*
------Fraction.java TESTER------

Double Constructor 1/B Check
0.25 = 25/100
PASS

Double Constructor A/B Check
0.6666666666666666 = 666666666/1000000000
PASS

Double Constructor Zero Check
0.0 = 0/1
PASS

Subtraction by Fraction Check
2/3 - 1/4 = 5/12
PASS

Subtraction by Integer Check
2/3 - 1 = -1/3
PASS

Division by Fraction Check
2/3 / 1/4 = 5/12
PASS

Division by Integer Check
2/3 / 2 = 2/6
PASS


*****   TEST SUMMARY     *****
Tests:          7
Failed:         0
Percent passed: 100%
*/