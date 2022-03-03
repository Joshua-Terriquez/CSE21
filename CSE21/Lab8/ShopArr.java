import java.util.*; 
import java.util.Random;
public class ShopArr {

	// Instance Variables
	private Cheese[] cheese;
	
	// Initialize method
	private void init(int max) {
		
		// Create max number of Cheese pointers
		cheese = new Cheese[max]; 
		
		if (max > 0) {
			cheese[0] = new Cheese();
			cheese[0].setName("Humboldt Fog");
			cheese[0].setPrice(25.00);
			
			if (max > 1) {
				cheese[1] = new Cheese("Red Hawk");
				cheese[1].setPrice(40.50);
			
				if (max > 2) {
					cheese[2] = new Cheese("Teleme", 17.25);
					cheese[2].setName("Teleme");
					cheese[2].setName("wrong name");
				}
				if(max > 3) {
					Random ranGen = new Random(100);
			    	
					for (int i = 3; i < max; i++) {
				   cheese[i]= new Cheese("Cheese Type "+(char)('A' + i), ranGen.nextInt(1000)/100.0);
					}	
				}
			}
			
		}
		
	}
	public ShopArr() {
		init(10);
	}
	public ShopArr(int amtCheese) {
		init(amtCheese);
	}

	/*
	 * Displays the intro message informing the user of various cheeses sold and
	 * Gets the amount of each cheese the user would like to purchase. 
	 */
	private void intro(Scanner input) {
		System.out.println("We sell " + cheese.length + " kinds of Cheese (in 0.5 lb packages)");
		if (cheese.length >= 1 ) {
		System.out.println(cheese[0].getName() + ": $" + cheese[0].getPrice() + " per pound");
		}if (cheese.length >= 2 ) {
		System.out.println(cheese[1].getName() + ": $" + cheese[1].getPrice() + " per pound");
		}if (cheese.length >= 3 ) {
		System.out.println(cheese[2].getName() + ": $" + cheese[2].getPrice() + " per pound");
		for(int i=3;i<cheese.length;i++) {
			System.out.println(cheese[i].getName() + ": $" + cheese[i].getPrice() + " per pound");
		}
		}if(cheese.length >= 1 ) {
		System.out.print("\nEnter the amount of " + cheese[0].getName() + " in lbs: ");
		cheese[0].setAmount(input);
		}if(cheese.length >= 2 ) {
		System.out.print("Enter the amount of "+cheese[1].getName()+ " in lbs: ");
		cheese[1].setAmount(input);
		}if(cheese.length >= 3 ) {
		System.out.print("Enter the amount of "+cheese[2].getName()+ " in lbs: ");
		cheese[2].setAmount(input);
		}
		for(int i=3;i<cheese.length;i++) {
			System.out.print("Enter the amount of " + cheese[i].getName() + " in lbs: ");
			cheese[i].setAmount(input);
		}
	}

	/*
	 * Displays the itemized list of all cheeses bought or a special message if none 
	 * were purchased.
	 */
	private void itemizedList(){
		double amt = 0, price = 0;
	       for(int i=0;i<cheese.length;i++) {
	    	   amt+=cheese[i].getAmount();
	       }
		   if (amt==0) {
			System.out.println("No items were purchased.");
		   }else {
			   for (int i=0;i<cheese.length;i++) {
				   if ((amt = cheese[i].getAmount()) > 0) {
						price = cheese[i].getPrice();
						System.out.printf("%.1f lb of %s @ $%.2f = $%.2f\n", amt, cheese[i].getName(), price, price*amt);
					}
		   }
		
		}

	}

	/*
	 * Calculates the Original Sub Total, which is the price*amount of each 
	 * cheese added together. Returns the Original Sub Total.
	 */
	private double calcSubTotal() {
		double subTotal = 0;
		for (int i=0; i < cheese.length; i++) {
			subTotal += cheese[i].getAmount() * cheese[i].getPrice();
		}
		return subTotal;
	}

	/*
	 * Calculates discounts based on special offers on Humboldt Fog and Red Hawk, 
	 * stores them in disSpecials[0] and disSpecials[1], and returns the array. 
	 * Minor changes from Lab 07 (identical logic). 
	 */
	private double[] discountSpecials() {
		double[] disSpecials = {0, 0};
		double count=0.0;
		double hfAmt = 0, rhAmt = 0;
		if(cheese.length >= 1) {
		hfAmt=cheese[0].getAmount();
		}if (cheese.length >= 2) {
		rhAmt=cheese[1].getAmount();
		}
		if (hfAmt > 0) {
			if (hfAmt > 1 && (hfAmt/2)!=0) {
				hfAmt=hfAmt-0.5;
				hfAmt= ((hfAmt*25)/2);
				disSpecials[0]= hfAmt;
				}
			if (hfAmt==1){
				hfAmt= ((hfAmt*25)/2);
				disSpecials[0]= hfAmt;
				}
			if ((hfAmt/2)==0) {
				hfAmt= ((hfAmt*25)/2);
				disSpecials[0]= hfAmt;
			      }
			}
		if(rhAmt > 0) {
			if(rhAmt%0.5==0) {
				rhAmt=(rhAmt/0.5);
				for(int i=2;i < rhAmt;rhAmt--) {
					count+=0.5;
					i+=2;
				}
				rhAmt=count;
				rhAmt*=40.5;
				disSpecials[1]=rhAmt;
			  }
			}
		return disSpecials;
		}	

	/*
	 * Displays the Original Sub Total, discounts based on specials, and the New Sub 
	 * Total. Returns the New Sub Total. Identical to Lab 07.
	 */
	private double printSubTotals(double subTotal, double[] disSpecials) {
		double newSubTotal=0;
		System.out.println("\nOriginal Sub Total:\t\t  $"+subTotal);
		System.out.println("Specials...");
		if(disSpecials[0]>0) {
		System.out.println("Humboldt Fog (Buy 1 Get 1 free): -$"+disSpecials[0]);
		}
		if(disSpecials[1]>0) {
		System.out.println("Red Hawk (Buy 2 Get 1 Free):     -$"+disSpecials[1]);
		}
		if (disSpecials[0]==0 && disSpecials[1]==0) {
			System.out.println("None\t\t\t         -$0.0");
		}
		newSubTotal=subTotal-(disSpecials[0]+disSpecials[1]);
		System.out.println("New Sub Total:\t\t\t  $"+newSubTotal);
		return newSubTotal;
	}

	/*
	 * Calculates the additional discount based on the New Sub Total and displays 
	 * the Final Total. Identical to Lab 07.
	 */
	private void printFinalTotal(double newSubTotal) {
		double addDisc=0, finalTot=0;
		if(newSubTotal > 150 && newSubTotal < 250 ) {
		addDisc=(newSubTotal * .10);
		System.out.println("Additional 10% Discount:  \t -$"+addDisc);
		}
		if(newSubTotal > 250) {
			addDisc= (newSubTotal *.15);
			System.out.println("Additional 15% Discount:  \t -$"+addDisc);
		}
		
		finalTot=newSubTotal-addDisc;
		if (addDisc == 0) {
		System.out.println("Additional 0% Discount:\t\t -$"+addDisc);
		}
		
		System.out.println("Final Total:\t\t\t  $"+finalTot);
		}
	

	private void printFree(){
		double amt;
		System.out.println();
		System.out.println("Today is your lucky day!");
		for (int i = 0; i < cheese.length; i++) 		
			if ((amt = cheese[i].getAmount()) > 0)
				System.out.println(amt + " lb of " + cheese[i].getName() + " @ $0 = $" + 0);
		System.out.println("Total Price: FREE!!!\n");
	}

	public void run() {

		Scanner input = new Scanner(System.in);
		intro(input);
		double subTotal = calcSubTotal();
		
		System.out.println();
		System.out.print("Display the itemized list? (1 for yes): ");
		int list = input.nextInt();
		if (list == 1)
			itemizedList();	
		if(list==0) {
			System.out.print("NO items were purchased.");
		}

		int free = (new Random()).nextInt(100);
		//System.out.println("Random num is " + free);
		if (free != 0) {
			double newSubTotal = printSubTotals(subTotal, discountSpecials());
			printFinalTotal(newSubTotal);
		} else {
			printFree();
			return;
		}
		
		System.out.println();
		System.out.print("Do you wish to redo your whole order? (1 for yes): ");
		int redo = input.nextInt();

		System.out.println();

		if (redo == 1)
			run();
		else
			System.out.println("Thanks for coming!");
	}
}
