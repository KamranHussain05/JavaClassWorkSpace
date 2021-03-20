package lsn_ExampleToolKit;

public class ExampleTester {

	public static void main(String[] args) {
		String testString = "Jerry Chu";
		String firstName = "";
		String lastName = "";
		String upperCase = "";
		String lowerCase = "";
		String dbName = "";
		
		ExampleToolKit nameObject = new ExampleToolKit();
		
		firstName = nameObject.getFirstName(testString);
		lastName = nameObject.getLastName(testString);
		upperCase = nameObject.toUpperCase(testString);
		lowerCase = nameObject.toLowerCase(testString);
		dbName = nameObject.getDBFormat(testString);
		
		System.out.println("firstName:\t " + firstName);
		System.out.println("lastName: \t" + lastName);
		System.out.println("upperCase: \t" + upperCase);
		System.out.println("lowerCase: \t" + lowerCase);
		System.out.println("dbName: \t" + dbName);
	}

}
