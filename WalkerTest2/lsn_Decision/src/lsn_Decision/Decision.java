//Commemt header above
package lsn_Decision;
import java.util.Scanner;

public class Decision {
	public static void main(String [] args) {
	
		int x;
		
		Scanner kboard = new Scanner(System.in);
		System.out.println("1 for English, 2 for Spanish");
		x = kboard.nextInt();
		
		if (x==1) {
			System.out.println("Hello, World!");			
		}
		
		if (x==2) {
			System.out.println("Hallo, Mundo!");
		}
		
	}
	
}
