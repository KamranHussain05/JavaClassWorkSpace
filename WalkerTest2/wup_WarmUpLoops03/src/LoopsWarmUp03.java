// Warm Up
// 1) What are the three essential elements of all iterative loops?
// 2) Identify each element for each loop in the code below.
// 3) Write the console output for a single run of this program.

public class LoopsWarmUp03 {

	public void outputResult01() {
		
		int sum = 0, x = 1;
		
		while (sum < 20 && x <= 5){
			sum += 2 * x;
			x++;
		}
		
		System.out.println(sum);
	}
	
	public void outputResult02(int z) {
		
		do {
		  System.out.print(z + " ");
		  z -= 10;
		} while (z > 0);
	}
	
	public void outputResult03() {
		
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) 
				System.out.println (i + " Hello");
			else 
				System.out.println (i + " Goodbye");
		}
		
		for (int k = 0; k < 3; k++) {
//			System.out.print("*");
			for (int i = 0; i < 6; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		LoopsWarmUp03 fred = new LoopsWarmUp03();
		
		fred.outputResult01();
		fred.outputResult02(5);
		fred.outputResult02(10);
		fred.outputResult03();	
	}   
}


