package methods.java;

public class MethodsJava {
	// Calculation
	// case 1= not taking params, not returning output

	int x = 10, y = 20;

	/*
	 * void sum() { System.out.println(x+y); }
	 */

	// Case 2 = not taking paramters, returns output

	/*
	 * int sum() { return(x+y); }
	 */

	// case 3- taking params, not return output

	void sum(int a, int b) {
		x = a;
		y = b;

		System.out.println(x + y);
	}

	// case 4 - taking params, return output
	/*
	 * int sun (int x,int y) { return (x+y); }
	 */

	public static void main(String[] args) {
		MethodsJava cal = new MethodsJava();
		// int res=cal.sum();
		// System.out.println(res);
		cal.sum(10, 20);
	}

}
