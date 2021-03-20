//comment header above

public class BrainTeaser {

	public static void main(String[] args) {
		
		int x, y, z;
		x = 5;
		y = 9;
		z = x + y;
		
		System.out.println("the value of z after line 11 is: "+z );
		
		z = y - x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(z);
		
		if(true) {
			//do this
			System.out.println("If statement condition is true");
		}
		
		while (x<y) {
			//do this until the condition is false
			System.out.println("While loop is doing stuff");
			x = x+1;
		}
	}

}
