package oop;


public class Counter {

	protected int myCount = 0;
	public static int numCounters=0;
	
	public Counter() {// constructor
		myCount=0;
		numCounters++;// keeps track of how many counters created...
	}
	public Counter(int initCount) {
		myCount= initCount;
		numCounters++;
	}
	
	public void increment() {// mutator
		myCount++;
	}
	public void increment(int amt) {//mutator
		myCount++;
	}
	
	public int value() { //accessor
		return myCount;
	}
	
	public void reset() {
		myCount = 0;
	}
	public void reset(int in) {
		myCount=in;
	}

}
