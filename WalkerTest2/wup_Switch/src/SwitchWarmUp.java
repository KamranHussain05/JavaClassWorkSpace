

public class SwitchWarmUp {

	public static void main(String[] args) {
		int x, y, z;
		double xx, yy, zz;
		
		SwitchWarmUp newSwitchTest = new SwitchWarmUp();
		
		z = 1;
		System.out.println("Calling test01(" + z + ")");
		newSwitchTest.test01(z);
		z = 2;
		System.out.println("Calling test01(" + z + ")");
		newSwitchTest.test01(z);
		z = 3;
		System.out.println("Calling test01(" + z + ")");
		newSwitchTest.test01(z);		
	}
		
	private void test01(int x) {			
		switch (x) {
			case 1:
				System.out.println("Case 'one' got executed");
			case 2:
				System.out.println("Case 'two' got executed");
				break;
			case 3: 
				System.out.println("Case 'three' got executed");
			default:
				System.out.println("Default condition got executed");
		}
	}
}


