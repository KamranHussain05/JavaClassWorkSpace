package lab_StringToolBox;
// Author: Kamran Hussain
// Date: 2/23/2021
// Rev: 01
// Notes: this class contains methods that modify and test parameters for an input string
// it tests as strings and booleans.
// contains 17 methods, 15 assigned, 2 research and development.
// Attempted to create a menu, did not complete due to time constraints.

public class StringToolBox { 
	//*******Part 1*******
	public String nameEcho(String s) { //echo's the inputted string/name as an uppercase
		String firstName = "";
		String lastName  = "";
		String upperCase = "";
		String result = "";
		
		firstName = s.substring(0, s.indexOf(" ")); //isolates the first name
		lastName = s.substring(s.indexOf(" ")); //isolates the last name
		upperCase = lastName.toUpperCase(); //echoes the last name by making it upper case
		result = firstName + upperCase; //combines the first name and the modified echo.
		
		return result;
	}
	 
	public boolean endsWithStar(String s) { //checks if the input ends with star
		boolean hasStar = false;
		String star = "*";
		
		hasStar = s.endsWith(star); //tests if the input ends with a star.
		
		if(s.isEmpty()) { //returns false if the input is empty.
			hasStar = false;
		}
		
		return hasStar; //returns the result
	}

	public boolean endsWithTwoStars(String s) { //checks if the input ends with two stars
		boolean stars = false;
		String hasStars = "**";
		
		stars = s.endsWith(hasStars); //compares the input to see if it ends with the value of the has stars variable
		
		if(s.isEmpty()) { //if the input is empty, the method returns false.
			stars = false;
		}
		
		return stars; //returns the result of the test.
	}

	public String last4(String s) { //returns the last 4 characters of the input 
		String result = "";
		int length = 0;
		
		length = s.length(); //gets the length of the string.
		result = s.substring(length-4); //isolates the last 4 characters 
		
		return result; //returns the last 4 characters
	}

	public String last5(String s) { //returns the last five characters 
		String result = "";
		String noSpaces = "";
		int length = 0;
		
		noSpaces = s.replaceAll(" ", ""); //removes all the spaces from the string
		length = noSpaces.length(); //gets the length when spaces are removed
		result = noSpaces.substring(length-5); //isolates the last five characters 
		
		return result; //returns the last five characters
	}

	public String scroll(String s) { //this methods moves the first letter of a string to the end
		String result = "";
		String firstChar = "";
		String rest = "";
		
		rest = s.substring(s.indexOf("")+1); //isolates the string after the first letter
		firstChar = s.substring(0,1); //isolates the first letter
		result = rest + firstChar; //moves the first character to the end of the string
		
		return result;
	}

	public String convertName(String s) { //converts a name input to a data base format
		String firstName = "";
		String lastName  = "";
		String result = "";
		
		lastName = s.substring(0, s.indexOf(",")); //gets the last name from the input
		firstName = s.substring(s.indexOf(" ") + 1); //gets the first name from the input
		result = firstName + " " + lastName; //rearranges the name
		
		return result; 
	}
	
	//*******Part 2********
	 
	public String removeDashes(String s) { //removes dashes from the input
		String result = "";
		
		result = s.replace("-", ""); //replaces the dashes with empty space.

		return result;
	}
	
	public String dateStr(String s) { //this method takes the input and turns it into a database comfortable format
		String result = ""; //lines 106 to 110 instantiate all needed variables.
		String removeSlashes = "";
		String month = "";
		String day = "";
		String year = "";
		
		month = s.substring(0, s.indexOf("/")); //gets the month and assigns it to the month variable
			if (month.length() < 2) {
				month = "0" + month;
			}
		removeSlashes = s.replace("/", "-"); //removes all the slashes so the next solutions can work
		day = removeSlashes.substring(s.indexOf("/")+1, s.lastIndexOf("/")+1); //finds and isolates the day
			if(day.length() < 3) {
				day = "0" + day;
			}
		year = removeSlashes.substring(s.lastIndexOf("/")); //finds and isolates the year
		result = day + month + year; //creates the date string in proper order and formatting using the strings found above. 
	
		return result; //returns the new date string.
	}
	
	public String negativeBits(String s) { //negates the inputted string of bits
		String result = ""; //variables instantiation for needed variables.
		
		result = s.replace("0", "2").replace("1", "0").replace("2", "1"); //the use of 2 is needed so there are 1s and 0s, not just 1s or just 0s.
		
		return result; //the result is returned.
	}
	
	public boolean containsSameChar(String s) { //tests if the input is made of a single type of character.
		boolean result = false; //instantiates the return variable
		
		result = s.replaceAll("" + s.charAt(0), "").length() == 0; //takes the first letter and removes every instance of it in the string, this reduces the length to 0 if the string is made of that one type of character

		return result; //returns the result variable.
	}
	
	public String removeComments(String s) { //removes any comments from an input string
		String result = ""; //lines 144 to 146 instantiates all the needed variables.
		String comment = "";
		String test = s;
		
		if(test.contains("/*")||test.contains("*/")) { //verifies that a comment if present in the input
			while (test.contains("/*") || test.contains("*/")) { //loops the code below as long comments are present
				comment = test.substring(test.lastIndexOf("/*"), test.lastIndexOf("*/")+2);//finds and stores the comments
				result = test.replace(comment, ""); //replaces the comments with empty space, removing them.
				test = result; //assigns the value of the result to the test so the previous comments are removed every time the loop runs
			} 
		} else result = s; //if comments arent detected, the input string is returned
		
		return result;  //the modified and processed string is returned.
	}
	
	//*******Part 3*******
	
	public String caesar(String s, int n) { //this methods scrambles the input by a specified number of characters
		String result = ""; //lines 162-164 instantiate all needed variables.
		String lowerComp = "abcdefghijklmnopqrstuvwxyz";
		String upperComp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		if(n < 0) { //tests if the input shift number is less than 0
			n = n+26;
		}
		
		for (int i = 0; i < s.length(); i++) { //loops through all the characters. 
			int index = 0;
			char chr = s.charAt(i);
			 
			if(Character.isLowerCase(chr)) { //test for lowercase letters 
				index = (lowerComp.indexOf(chr) + n)%26; //moves the letter by the specified shift value lexigraphically.
				chr= lowerComp.charAt(index); 
			} else if(Character.isUpperCase(chr)) { //tests for upper case letters if the previous test failed
				index = (upperComp.indexOf(chr) + n)%26; //indexes the shifted letter
				chr = upperComp.charAt(index); //moves the letter by the specifiec shift value lexigraphically.
			} result += chr; //adds the new, shifted letter to the result string.
		}
		
		return result; //returns the new and processed string.
	}
	
	public boolean isPalindrome(String s) { //this method tests if the input string is the same when it is reversed, this is a palindrome.
		boolean result = false; //lines 187-190 instantiate all needed variables.
		String reversed = "";
		String noSpaceOriginal = "";
		String cleanInput = "";
		
		cleanInput = s.replace(" ", "").replaceAll("\\p{Punct}", "").toLowerCase(); //cleans the comparison input string of spaces, cases, and punctuation.
		
		noSpaceOriginal = s.replace(" ", "").replaceAll("\\p{Punct}", "").toLowerCase(); //makes sure the original string has no spaces, cases, or punctuation
		
		StringBuilder reverseChars = new StringBuilder(); //creates a string builder object
		reverseChars.append(noSpaceOriginal); //turns the string input into a stringbuilder
		reverseChars.reverse(); //reverses the chars 
		reversed = reverseChars.toString(); //turns the string builder back to a string
	
		if(cleanInput.equals(reversed)) { //checks if the cleaned input is the same as the reversed string.
			result = true;
		} 

		return result; //returns whther or not the statement is a palindrome.
	}
	
	public boolean validPassword(String s) { //This class test if an input meets the password criteria.
		boolean result = false;  //lines 209 to 214 instantiate all the necessary variables
		int chars = 0;
		int spaces = 0;
		int upperCount = 0;
		int lowerCount = 0;
		int digits = 0;

		 for(int i =0; i < s.length(); i++) { //the loop parses through the entire input string.
	            char ch = s.charAt(i);
	            if(Character.isWhitespace(ch)) { //counts the whitespaces for comparison
	                spaces++;
	            }
	            else if(Character.isLetter(ch)) { //checks upper and lower cases only if the character under scrutiny is a letter 
	                chars++;
	                if(Character.isUpperCase(ch)) { //parses the letter for upper case letters and increases the count of the lowercase letters..
	                    upperCount++;
	                }
	                else if(Character.isLowerCase(ch)) { //parses for lower case letters and increases the count of lowercase letters
	                    lowerCount++;
	                }
	            }
	            else if(Character.isDigit(ch)) { //parsess for digits.
	                digits++;
	            }
	        }
		 
	        if(spaces< 1) {  //final comparisons to validate the password and verify all criteria have been met.
	            if(chars >= 7) {
	                if(lowerCount > 0 && upperCount > 0) {
	                    if(digits > 0) {
	                        result = true;
	                    }
	                }
	            }
	        }
		
		return result; //returns the result of all the tests.
	}
	
	//Tests what type of emotional sentence the input is and informs the user
	public String typeOfSentence(String s) {
		String result = ""; //instantiates all needed variables
		
		if(s.endsWith("?")) { //test if the input is a question
			result = "Question???";
		}
		if(s.endsWith("!")) { //tests if the input is an exclamation
			result = "Exclamation, excitement or anger!";
		}
		if(s.endsWith(".")) { //tests if the input is a statement.
			result = "statememt, plain and simple.";
		}
		return result;
	}
	
	public String lipogrammer(String s, String no) {  //creates a lipogram of the input string and a forbidden letter.
		String result = "";
		
		result = s.replace(no, "#"); //replaces the forbidden letter with the 
		
		return result;
	}
}

/* 
***Testing: boolean endsWithStar(String s)***
Test Count:   1
true = true
PASS
false = false
PASS
***Testing: boolean endsWithTwoStars(String s)***
Test Count:   2
true = true
PASS
false = false
PASS
false = false
PASS
***Testing: String removeDashes(String str)***
Test Count:   3
123456789 = 123456789
PASS
***Testing: String dateStr(String s)***
Test Count:   4
10-02-2011 = 10-02-2011
PASS
***Testing: ADVANCED CREDIT CONSIDERATION String dateStr(String s)***
10-02-2010 = 10-02-2010
PASS
02-10-2010 = 02-10-2010
PASS
02-01-2010 = 02-01-2010
PASS
***Testing: String last4(String s)***
Test Count:   5
3456 = 3456
PASS
***Testing: String last5(String s)***
Test Count:   6
23456 = 23456
PASS
***Testing: String scroll(String s)***
Test Count:   7
23451 = 23451
PASS
***Testing: String convertName(String s)***
Test Count:   8
Albert Einstein = Albert Einstein
PASS
***Testing: String negativeBits(String s)***
Test Count:   9
0101 = 0101
PASS
1111 0000 = 1111 0000
PASS
***Testing: boolean containsSameChar(String s)***
Test Count:   10
false = false
PASS
true = true
PASS
***Testing: String removeComments(String s)***
Test Count:   11
The hippo is native to Western Africa. = The hippo is native to Western Africa.
PASS
The pygmy hippo is native to Western Africa. = The pygmy hippo is native to Western Africa.
PASS
The hippo is native to Western Africa. = The hippo is native to Western Africa.
PASS
The hippo is native to Western Africa. = The hippo is native to Western Africa.
PASS
***Testing: String caesar(String s, int n)***
Test Count:   12
lttlqj ltllqjx ljjp lqfxxjx = lttlqj ltllqjx ljjp lqfxxjx
PASS
Lttlqj ltllqjx ljjpd lqfxxjx = Lttlqj ltllqjx ljjpd lqfxxjx
PASS
Gur cltzl uvccb vf n erpyhfvir naq abpgheany navzny angvir gb Jrfgrea Nsevpn. = Gur cltzl uvccb vf n erpyhfvir naq abpgheany navzny angvir gb Jrfgrea Nsevpn.
PASS
***Testing: boolean isPalindrome(String s)***
Test Count:   13
true = true
PASS
false = false
PASS
true = true
PASS
false = false
PASS
true = true
PASS
***Testing: boolean validPassword(String s)***
Test Count:   14
false = false
PASS
false = false
PASS
true = true
PASS
true = true
PASS
****** TEST SUMMARY *****
Test Count:   14
Fail Count:   0
Percent Pass: 100
Total Points: 10
EC points:    1
Earned Points:11
*/