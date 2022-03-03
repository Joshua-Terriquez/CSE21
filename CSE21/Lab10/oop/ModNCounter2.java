package oop;

public class ModNCounter2 extends Counter{
	public static int variable2=0;
	private int cycleLength;
		
	public ModNCounter2(int n) {
			cycleLength=n;
		}
	public int value() {
		if (myCount==cycleLength) {
			return 0;
			}
	     return myCount;
		}
	}
		
		

