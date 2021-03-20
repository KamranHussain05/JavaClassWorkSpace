package lab_StringToolBox;
// Author: Kamran Hussain
// Date: 2/23/2021
// Rev: 01
// Notes:

public class StringToolBox {
	
	//*******Part 1*******
	
	public String nameEcho(String s) {
		String firstName = "";
		String lastName  = "";
		String upperCase = "";
		String result = "";
		
		firstName = s.substring(0, s.indexOf(" "));
		lastName = s.substring(s.indexOf(" "));
		upperCase = lastName.toUpperCase();
		result = firstName + upperCase;
		return result;
	}
	
	public boolean endsWithStar(String s) {
		boolean hasStar = false;
		String star = "*";
		
		hasStar = s.endsWith(star);
		
		if(s.isEmpty()) {
			hasStar = false;
		}
		
		return hasStar; 
	}

	public boolean endsWithTwoStars(String s) {
		boolean stars = false;
		String hasStars = "**";
		
		stars = s.endsWith(hasStars);
		
		if(s.isEmpty()) {
			stars = false;
		}
		
		return stars; 
	}

	public String last4(String s) {
		String result = "";
		int length = 0;
		
		length = s.length();
		result = s.substring(length-4);
		
		return result;
	}

	public String last5(String s) {
		String result = "";
		String noSpaces = "";
		int length = 0;
		
		noSpaces = s.replaceAll(" ", ""); 
		length = noSpaces.length();
		result = noSpaces.substring(length-5);
		
		return result;
	}

	public String scroll(String s) {
		String result = "";
		String firstChar = "";
		String rest = "";
		
		rest = s.substring(s.indexOf("")+1);
		firstChar = s.substring(0,1);
		result = rest + firstChar;
		return result;
	}

	public String convertName(String s) {
		String firstName = "";
		String lastName  = "";
		String result = "";
		
		lastName = s.substring(0, s.indexOf(","));
		firstName = s.substring(s.indexOf(" "));
		result = firstName + " " + lastName;
		return result;
	}
	
	//*******Part 2********
	
	public String removeDashes(String s) {
		String result = "";
		
		return result;
	}
	
	public String dateStr(String s) {
		String result = "";
		
		return result;
	}
	
	public String negativeBits(String s) {
		String result = "";
		
		return result;
	}
	
	public boolean containsSameChar(String s) {
		boolean result = false;
		
		return result;
	}
	
	public String removeComments(String s) {
		String result = "";
		
		return result;
	}
	
	//*******Part 3*******
	
	public String caesar(String s) {
		String result = "";
		
		return result;
	}
	
	public boolean isPalindrome(String s) {
		boolean result = false;
		
		return false;
	}
	
	public boolean validPassword(String s) {
		boolean result = false;
		
		return result;
	}
}