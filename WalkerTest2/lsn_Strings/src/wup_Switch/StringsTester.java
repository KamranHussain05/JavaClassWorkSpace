//Author: Kamran Hussain

package wup_Switch;

public class StringsTester {

	public static void main(String[] args) {
//		String fred = " this is Fred's contents ... this is a literal string";
//		String jeff = " this is jeffs contents ... this is a literal string";
//		String bob = " this is bobs contents ... this is a literal string";
//		
//		System.out.println(fred);
//		System.out.println(jeff);
//		System.out.println(bob);
//		
//		String william = "contents for William - this is a literal string";
//		String jiwoo = "contents for Jiwoo - this is a literal string";
//		
//		william = jiwoo+william;
//		
//		System.out.println(william);
		
		String testString1 = "Vivie";
		String testString2 = "Jerry";
		
//		System.out.println("testString: " + testString1);
//		System.out.println("testString: " + testString2);
		
		int length = 0;
		length = testString1.length();
		char character01 = ' ';
		System.out.println("length: " +length);
		character01 = testString1.charAt(3);
		System.out.println("char testString1: "+character01);
		
		System.out.print(testString1 + testString2);
		System.out.print("\n\"" + testString1 +"\"\n\"" +testString2 + "\"");
		
		String subString = testString1.substring(0,2);
		System.out.println("substring= " +subString);
		
		System.out.println("index of V: " + testString1.indexOf('V'));
		System.out.println("index of v: " + testString1.indexOf('v'));
		
	}

}
