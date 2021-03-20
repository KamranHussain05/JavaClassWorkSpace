//Author: Kamran Hussain
//Date: 11/23/2020
//Rev: 01
//Notes:

/** 
* @(#)DogYears.java
 *

  For testing purposes:
  Dog age of 1 = Human age 13
  Dog age of 2 = Human age 18
  Dog age of 5 = Human age 34
  Dog age of 8 = Human age 50
  Dog age of 12 = Human age 72

 *
 * @author
 * @version
 */

import java.awt.*;
import java.util.Scanner;

public class DogYears {
	
    public int convertToDogYears(int humanYears) {
    	// Work on this once you have finished convertToHumanYears()!
    	int dogYears = (int)(5.34*humanYears+8.1);
    	
    	if (humanYears>16) {
    		dogYears = (int) (dogYears - 0.5);
    	}
    		return dogYears;
    }
    
    public int convertToHumanYears(int dog) {
    	
    	int human =  (int)((dog-8)/5.3+0.5);
    	return human;
    }/*
    
    //Research and Development
    public int convertHumanToDogMonths(int humanYear) {
    	int calc = (int)(5.34*humanYear+8.1);
    	int dogMonths = calc*12 ;
  	
    	return dogMonths;
    }
*/
}

/*
Start test ********
Test [1],  Human year value is 1 so, dog year value should be: 13
PASS 	method returned: 13	expected: 13
Test [1],  Dog year value is 13 so, human year value should be: 1
PASS 	method returned: 1	expected: 1
Test [2],  Human year value is 2 so, dog year value should be: 18
PASS 	method returned: 18	expected: 18
Test [2],  Dog year value is 18 so, human year value should be: 2
PASS 	method returned: 2	expected: 2
Test [3],  Human year value is 3 so, dog year value should be: 24
PASS 	method returned: 24	expected: 24
Test [3],  Dog year value is 24 so, human year value should be: 3
PASS 	method returned: 3	expected: 3
Test [4],  Human year value is 4 so, dog year value should be: 29
PASS 	method returned: 29	expected: 29
Test [4],  Dog year value is 29 so, human year value should be: 4
PASS 	method returned: 4	expected: 4
Test [5],  Human year value is 5 so, dog year value should be: 34
PASS 	method returned: 34	expected: 34
Test [5],  Dog year value is 34 so, human year value should be: 5
PASS 	method returned: 5	expected: 5
Test [6],  Human year value is 6 so, dog year value should be: 40
PASS 	method returned: 40	expected: 40
Test [6],  Dog year value is 40 so, human year value should be: 6
PASS 	method returned: 6	expected: 6
Test [7],  Human year value is 7 so, dog year value should be: 45
PASS 	method returned: 45	expected: 45
Test [7],  Dog year value is 45 so, human year value should be: 7
PASS 	method returned: 7	expected: 7
Test [8],  Human year value is 8 so, dog year value should be: 50
PASS 	method returned: 50	expected: 50
Test [8],  Dog year value is 50 so, human year value should be: 8
PASS 	method returned: 8	expected: 8
Test [9],  Human year value is 9 so, dog year value should be: 56
PASS 	method returned: 56	expected: 56
Test [9],  Dog year value is 56 so, human year value should be: 9
PASS 	method returned: 9	expected: 9
Test [10],  Human year value is 10 so, dog year value should be: 61
PASS 	method returned: 61	expected: 61
Test [10],  Dog year value is 61 so, human year value should be: 10
PASS 	method returned: 10	expected: 10
Test [11],  Human year value is 11 so, dog year value should be: 66
PASS 	method returned: 66	expected: 66
Test [11],  Dog year value is 66 so, human year value should be: 11
PASS 	method returned: 11	expected: 11
Test [12],  Human year value is 12 so, dog year value should be: 72
PASS 	method returned: 72	expected: 72
Test [12],  Dog year value is 72 so, human year value should be: 12
PASS 	method returned: 12	expected: 12
Test [13],  Human year value is 13 so, dog year value should be: 77
PASS 	method returned: 77	expected: 77
Test [13],  Dog year value is 77 so, human year value should be: 13
PASS 	method returned: 13	expected: 13
Test [14],  Human year value is 14 so, dog year value should be: 82
PASS 	method returned: 82	expected: 82
Test [14],  Dog year value is 82 so, human year value should be: 14
PASS 	method returned: 14	expected: 14
Test [15],  Human year value is 15 so, dog year value should be: 88
PASS 	method returned: 88	expected: 88
Test [15],  Dog year value is 88 so, human year value should be: 15
PASS 	method returned: 15	expected: 15
Test [16],  Human year value is 16 so, dog year value should be: 93
PASS 	method returned: 93	expected: 93
Test [16],  Dog year value is 93 so, human year value should be: 16
PASS 	method returned: 16	expected: 16
Fail count: 0	 Pass count: 32
If Fail count is greater than 0, check your algorithm
*/