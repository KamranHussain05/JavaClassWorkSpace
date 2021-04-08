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
		firstName = s.substring(s.indexOf(" ") + 1);
		result = firstName + " " + lastName;
		return result;
	}
	
	//*******Part 2********
	
	public String removeDashes(String s) {
		String result = "";
		
		result = s.replace("-", "");

		return result;
	}
	
	public String dateStr(String s) {
		String result = "";
		String removeSlashes = "";
		String month = "";
		String day = "";
		String year = "";
		
		month = s.substring(0, s.indexOf("/"));
			if (month.length() < 2) {
				month = "0" + month;
			}
		removeSlashes = s.replace("/", "-");
		day = removeSlashes.substring(s.indexOf("/")+1, s.lastIndexOf("/")+1);
			if(day.length() < 3) {
				day = "0" + day;
			}
		year = removeSlashes.substring(s.lastIndexOf("/"));
		result = day + month + year;
	
		return result;
	}
	
	public String negativeBits(String s) {
		String result = "";
		
		result = s.replace("0", "2").replace("1", "0").replace("2", "1");
		
		return result;
	}
	
	public boolean containsSameChar(String s) {
		boolean result = false;
		
		result = s.replaceAll("" + s.charAt(0), "").length() == 0;

		return result;
	}
	
	public String removeComments(String s) {
		String result = "";
		String comment = "";
		String test = s;
		
		if(test.contains("/*")||test.contains("*/")) {
			while (test.contains("/*") || test.contains("*/")) {
				comment = test.substring(test.lastIndexOf("/*"), test.lastIndexOf("*/")+2);
				result = test.replace(comment, "");
				test = result;
			} 
		} else result = s;
		
		return result; 
	}
	
	//*******Part 3*******
	
	public String caesar(String s, int n) {
		String result = "";
		String lowerComp = "abcdefghijklmnopqrstuvwxyz";
		String upperComp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		if(n < 0) {
			n = n+26;
		}
		
		for (int i = 0; i < s.length(); i++) {
			int index = 0;
			char chr = s.charAt(i);
			
			if(Character.isLowerCase(chr)) {
				index = (lowerComp.indexOf(chr) + n)%26;
				chr= lowerComp.charAt(index);
			} else if(Character.isUpperCase(chr)) {
				index = (upperComp.indexOf(chr) + n)%26;
				chr = upperComp.charAt(index);
			} result += chr;
		}
		
		return result;
	}
	
	public boolean isPalindrome(String s) {
		boolean result = false;
		String reversed = "";
		String noSpaceOriginal = "";
		String cleanInput = "";
		
		cleanInput = s.replace(" ", "").replaceAll("\\p{Punct}", "").toLowerCase();
		
		noSpaceOriginal = s.replace(" ", "").replaceAll("\\p{Punct}", "").toLowerCase();
		
		StringBuilder reverseChars = new StringBuilder();
		reverseChars.append(noSpaceOriginal);
		reverseChars.reverse();
		reversed = reverseChars.toString();
	
		if(cleanInput.equals(reversed)) {
			result = true;
		} 

		return result;
	}
	
	public boolean validPassword(String s) {
		boolean result = false;
		int chars = 0;
		int spaces = 0;
		int upperCount = 0;
		int lowerCount = 0;
		int digits = 0;

		 for(int i =0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if(Character.isWhitespace(ch)) {
	                spaces++;
	            }
	            else if(Character.isLetter(ch)) {
	                chars++;
	                if(Character.isUpperCase(ch)) {
	                    upperCount++;
	                }
	                else if(Character.isLowerCase(ch)) {
	                    lowerCount++;
	                }
	            }
	            else if(Character.isDigit(ch)) {
	                digits++;
	            }
	        }
		 
	        if(spaces< 1) {
	            if(chars >= 7) {
	                if(lowerCount > 0 && upperCount > 0) {
	                    if(digits > 0) {
	                        result = true;
	                    }
	                }
	            }
	        }
		
		return result;
	}
	
	public boolean passwordEncrypter(String s) {
		boolean result = false;
		
		return result;
	}
}