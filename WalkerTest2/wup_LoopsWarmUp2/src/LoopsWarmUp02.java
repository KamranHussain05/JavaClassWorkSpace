
// 1)  A typical for loop has this syntax: for (initialization; condition; change){}
//     in what order is the initialization, condition, and change executed?
//
// 2)  Write the exact console output for this program.

public class LoopsWarmUp02 {
	
	public void outputResult01() {
		
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) 
				System.out.println (i + " Hello");
			else 
				System.out.println (i + " Goodbye");
		}

		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				System.out.println (i + " Hello");
			break;
		} 
				System.out.println (i + " Goodbye");
		}
	}
	
	public static void main(String[] args) {
		LoopsWarmUp02 fred = new LoopsWarmUp02();
		fred.outputResult01();
	}   

}
