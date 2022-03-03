import java.util.*;

public class Lab21_Vars {

	public static void main(String[] args) {

		int i, j;
		int var0, var1;
		
		// Fix 1: Correctly typecast 5.0 to an int so it can assigned to var3.
		int var2 = 0,var3=(int)5.0;         /* var3 = 5.0;*/
		
		// Fix 2: Correctly declare a variable as an array.
		int[] arri0 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //classified the variable as an array of integers
		/*int arri0 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};*/
		double[] arrd0 = {0.0, 1.0, 2.0, 3.0, 4.0};
		
		// Fix 3: What's wrong with temp? Fix it.
		if (i < j) {
			int temp = 0;
			System.out.println("Temp is " + temp);
		} else {
			int temp=1; //classified temp as an int.
			//temp = 1; the variable temp is only known inside the if statement
			System.out.println("Temp is " + temp);
		}
		
		// Fix 4: Correctly calculate square of sums and print it as total.
		int total=0;
		int x=0;
		for ( x = 0; x < 10; x++) {
			//int total = 0; should be in the outside only defined in the loop...
		       total+= (x*x);	
		}
		System.out.println("i value is " + x);
		System.out.println("Total is " + total);
		// Fix 5: Figure out the logical error in lines 36-42, and correct it.
		Cheese jack=new Cheese("Jack");// correct way to do an object
		//Cheese jack;
	  Cheese monterey = new Cheese("Monterey");
		//jack=monterey;
		 jack = new Cheese[monterey]; // pointer
		  System.out.println("Monterey name is " + monterey.getName());
		 jack.setName("Jack");
		  System.out.println("Jack name is " + jack.getName());
		  System.out.println("Monterey name is still " + monterey.getName());
	
		// Fix 6: Make the following code shorter by combining redundant 
		//        (unnecessary/duplicate) statements
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		if (input.nextInt() > var3) {
			System.out.print("Enter second number: ");
			 num2 = input.nextInt();
			System.out.println("First is greater");}
			else if (input.nextInt() < var3) {
			System.out.println("First is Less than or equal");
	}
			 if (num2 < var3) {
			     	System.out.println("Second is Less than");
			     }else {
				    System.out.println("Second is Greater or equal");
		              }

		// Fix 7: Print out the first number entered by the user
		//        (Hint - You will need to modify the above code)
			 /*
			  
 
Scanner input = new Scanner(System.in);
System.out.print("Enter first number: ");  
if (input.nextInt() > var3) {
   System.out.print("Enter second number: "); 
   int num2 = input.nextInt(); 
   System.out.println("First is greater");
if (num2 < var3)  
   System.out.println("Second is Less than");
else   System.out.println("Second is Greater or equal");
         }
         else {  
          System.out.print("Enter second number: ");  
          int num2 = input.nextInt();
          System.out.println("First is Less than or equal"); 
            if (num2 < var3)  
            System.out.println("Second is Less than"); 
              else
            System.out.println("Second is Greater or equal");
			   */
	}

}
