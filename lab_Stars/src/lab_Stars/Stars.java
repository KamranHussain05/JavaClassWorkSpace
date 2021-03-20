// Author: Kamran Hussain
// Date: 1/21/21
// Rev 01
// Notes:

package lab_Stars;

import java.util.Scanner;

public class Stars {
//Menu Option 1
	public void printStars(int x) {
		int i = 0;
		do {
			System.out.print("*");
			i++;
		} while (x>i);
	}
//Menu Option 2
	public void starSquare(int n) {
		int i = 0;
		do {
			for (int b = 0; n>b+1; b++) {
				System.out.print("*");
			}
			System.out.println("*");
			i++;
		} while(n>i);
	}
//Menu Option 3
	public void printStarTriangle(int n) {
		for (int i = 0; n>=i; i++) {
			for (int b = 0; b<i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
	public void printInvertedStarTriangle(int n) {
		for (int i = n; 1<=i; i--) {
			for (int b = i-1; b>=0; b--) {
				System.out.print(" ");
			}
			for (int a = n-i; a>=0; a--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printStarPyramid(int n) {
		int stars = 1;
		for (int i = 1; n>=i; i++) {
			int space = n-i;
			for (int b = 0; b<space; b++) {
				System.out.print(" "); 
			}
			for (int a = 0; a<stars; a++) { //even increase by 2 each level
				System.out.print("*");
			}
			stars += 2;
			System.out.println();
		}
	}
	
	public void printStarDiamond(int n) {

        for (int i = 1; i <= n - 1; i += 2) {
            for (int k = n+1; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
   }
	
	public void printScaleneTriangle(int n) {
		int stars = 1;
		for (int i = 1; n>=i; i++) {
			int spaces = n-i;
			for (int b = 0; b<stars; b++) {
				System.out.print(" "); 
			}
			for (int a = 0; a<spaces; a++) { //even increase by 2 each level
				System.out.print("*");
			}
			stars += 2;
			System.out.println();
		}
	}
}

