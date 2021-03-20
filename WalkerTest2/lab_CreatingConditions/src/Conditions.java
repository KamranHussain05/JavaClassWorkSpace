/*
	This is the Conditions class template. Use this class to 
	create methods that return the results of tests described in the
	lab description!

	Author: Kamran Hussain
	Date: 12/10/2020
	Rev: 01
	Notes: none
	
*/

import java.awt.Color;
import java.util.Scanner;

public class Conditions {
	// No fields
	// This is an example method that tests the parameters in some way,
	// then returns the result of the test
	public boolean isPointInRectangle(int x, int y, int rectX, int rectY, int rectHeight) {
		boolean state = false;
		if (x >= rectX && x <= rectX + rectY) {
			state = true;
		}
		if (y >= rectY && y <= rectY + rectX) {
			state = false;
		}
		return state;
	}

	// Creating Conditions 1
	public boolean isLeapYear(int year) {
		boolean leapYear = false;

		if (year % 4 == 0) {
			if(year % 100 ==0) {
				if(year%400 == 0)
					leapYear = true;
				else
					leapYear = false;
			} else 
				leapYear = true;
		} else
			leapYear = false; 
		
		return leapYear; 
	}

	public boolean hasTwoEndingZeroes(int x) {
		boolean twoZeroes = false;
		
		if (x%100 == 0) {
			twoZeroes = true;
		}
		return twoZeroes;
	} 

	public boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
		boolean later = false;
		
		if(year1 >= year2) {
			later = true;
		} else if(year1 == year2) {
            if(month1 >= month2) {
                later = true;
            }else if(month1 == month2) {
                if(day1 >= day2)
                    later = true;
            }
		}
		
		return later;
	}
	
	public Color bestMatch(int r, int g, int b) {
		Color color = Color.BLACK;
		
		if(b>r && b>g) {
			color = Color.blue;
		} else if (b==r && b>g) {
			color = Color.MAGENTA;
		} else if(b==g && b>r) {
			color = Color.cyan;
		}
		
		if (r>b && r>g) {
			color = Color.red;
		} else if (r==g && r>b) {
			color = Color.yellow;
		}
		
		if (g>b && g>r) {
			color = Color.green;
		}
		
		return color;
		
	}
	
}
