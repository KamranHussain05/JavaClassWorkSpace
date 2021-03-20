package lsn_ExampleToolKit;

public class ExampleToolKit {

	public String getFirstName(String theString) {
		String result = "";
		
		int index = 0;
		
		index = theString.indexOf(" ");
		result = theString.substring(0, index);
		return result;
	}
	
	public String getLastName(String theString) {
		String result = "";
		
		result = theString.substring(theString.indexOf(" "));
		return result;
	}
	
	public String toUpperCase(String theString) {
		String result = "";

		result = theString.toUpperCase();
		return result;
	}
	
	public String toLowerCase(String theString) {
		String result = "";
		
		result = theString.toLowerCase();
		return result;
	}
	
	public String getDBFormat(String theString) {
		String result = "";
		String firstName = "";
		String lastName = "";
		String dbName = "";
		
		firstName = getFirstName(theString);
		lastName = getLastName(theString);
		dbName = lastName + ", " + firstName;
		result = toUpperCase(dbName);
		
		return result;
	}
}
