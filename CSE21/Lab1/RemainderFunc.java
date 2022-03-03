import java.util.Scanner;

public class RemainderFunc {

	public static void main(String[] args) {
		int max,divisor,count=0;
		Scanner kbinput=new Scanner(System.in);
		
		System.out.print("Please enter the max number: ");
		max=kbinput.nextInt();
		
			while(max<0) {
			System.out.print("Invalid input. Please enter a valid max number (>=0): ");
			max=kbinput.nextInt();
	        }
		
		System.out.print("Please enter the divisor: ");
		divisor=kbinput.nextInt();
			  
		while(divisor<=0) {
				System.out.print("Invalid input. Please enter a valid divisor (>= 0): ");
				divisor=kbinput.nextInt();
				}
		
		System.out.println("Multiples of "+divisor+" between 1 and "+ max +" (inclusive) are: ");
		
			for(int i=1;i<=max;i++) {
				if(i % divisor == 0) {
					System.out.println(i);
					count++;
				}
			}
	    if(count==0) {
	    	System.out.println("No number were found.");
	    }

}


}