package recursion;

public class DigitCount {

	public static void main(String[] args) {
		System.out.println(digitCount(0));
		System.out.println(digitCount(10));
		System.out.println(digitCount(314159));
		int num = 1;
		for (int i = 1; i < 14; i++) {
			num = num * i;
		System.out.println("Digit count of " + num + " is: " + digitCount(num));
	
	}		
	}
	
	// Fix the bug in digitCount, so that it returns correct values.
	// You only need to change one line.
	public static int digitCount(int value) {
		if(value >= 0 && value < 10) {
			return 1;
		} else {
			return 1 + digitCount(value/10);
		} 
	}
}
