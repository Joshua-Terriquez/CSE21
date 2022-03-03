package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		 testModNCounter2();

		 testSeasonCounter();
	}

	
	public static void testCounter() {
		System.out.println("-- Testing Counter");
		Counter c = new Counter();
		for (int i = 0; i < 3; i++)

			c.increment();

		System.out.println(c.value());
		//without a new constructor simply increment counter 2 more times 
	}

	
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- Testing 7 statements");
		// include exactly 7 increment() and reset() statements below
		 c.increment();
		 c.increment();
		 c.increment();
		 c.reset();
		 c.increment();
		 c.increment();
		 c.increment();
		System.out.println("Current value: " + c.value());
	}
	public static void testModNCounter() {

		System.out.println("-- testing Counter");
		ModNCounter c = new ModNCounter (2);
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		}
		public static void testModNCounter2() {
			
			System.out.println("-- testing Counter");
			ModNCounter2 c = new ModNCounter2(2);
			System.out.println(c.value());
			c.increment();
			System.out.println(c.value());
			c.increment();
			System.out.println(c.value());
			c.increment();

	}

		public static void testSeasonCounter() {
			System.out.println("-- testing Seasons");
			SeasonCounter c = new SeasonCounter();
			System.out.println(c.toString());
			c.increment();
			System.out.println(c.toString());
			c.increment();
			System.out.println(c.toString());
			c.increment();

		}

}
