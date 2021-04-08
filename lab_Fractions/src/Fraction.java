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
	  denom =1;
      while ( x != (int)x) {
          if ( x >= java.lang.Integer.MAX_VALUE/10) {
              break;
          }
          x *= 10;
          denom *= 10;
      }
      num = (int)x;
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
  public Fraction subtract(Fraction f) {
	  int newNum = num * f.denom - denom*f.num;
	  int newDenom = denom * f.denom;
	  return new Fraction(newNum, newDenom);
  }
  //*****************Added the second subtract method***************************
  public Fraction subtract(int m) {
	return new Fraction (num-m *denom, denom);
  }
//**************************************************************************************************
  // Returns the product of this fraction and other
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the product of this fraction and m
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom);
  }
  //******************Added the divide method****************************
  public Fraction divide(Fraction f) {
	int newNum = num*f.denom;
	int newDenom = denom * f.num;
	return new Fraction(newNum, newDenom);
  }
  //*******************Added the second divide method***********************
  public Fraction divide(int m) {
	return new Fraction(num, denom*m);
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
