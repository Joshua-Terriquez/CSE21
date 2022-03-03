import java.util.Random;
import java.util.Scanner;
public class GenericCheeseShop {

	public static void main(String[] args) {
		Scanner kbinput= new Scanner(System.in);
		int MAXCHEESE=3,DispItem;
		double HumbFog=0,subRedHwk,subHumbFog,subTeleme,redHwk=0,teleme1=0,subTotal;
		double discHumbFog,discRedHwk,newSubTotal,additDisc;
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		double[] amounts = new double[MAXCHEESE];
        
		// Three Special Cheeses
		names[0] = "Humboldt Fog";
		prices[0] = 25.00;
		names[1] = "Red Hawk";
		prices[1] = 40.50;
		names[2] = "Teleme";
		prices[2] = 17.25;
		
		System.out.print("Enter the number of Cheeses for shop setup: ");
		MAXCHEESE=kbinput.nextInt();
		System.out.println();
 		
		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese (in 0.5 lb packages)");
 		
		for (int i=0;i<MAXCHEESE;i++) {
 			System.out.println(names[i] + ": $" + prices[i] + " per pound");
 		} 		
		for(int i=0; i<MAXCHEESE;i++) {	
			if(MAXCHEESE==1) {
 		System.out.println();
 		System.out.print("Enter the amount of Humboldt Fog in lb: ");
		HumbFog=kbinput.nextDouble();
		while (HumbFog < 0 || HumbFog % 0.5!= 0){
			if (HumbFog< 0) {
				System.out.print("Invalid input. Enter a value >=0: ");
				HumbFog=kbinput.nextDouble();
			}else  if (HumbFog % 0.5!=0){
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				HumbFog=kbinput.nextDouble();
			}
		}
			}
			if (MAXCHEESE==2) {
			System.out.print("Enter the amount of Red Hawk in lbs: ");
			redHwk=kbinput.nextDouble();
			while (redHwk < 0 || redHwk % 0.5!=0) {
				if (redHwk < 0) {
					System.out.print("Invalid input. Enter a value >=0: ");
					redHwk=kbinput.nextDouble();
				}else if (redHwk % 0.5!=0){
					System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
					redHwk=kbinput.nextDouble();
				}else { continue;
				}
			}
			}
			if(MAXCHEESE==3) {
			System.out.print("Enter the amount of Teleme in lbs: ");
			teleme1=kbinput.nextInt();

			while (teleme1 < 0||teleme1 % 0.5!=0) {
				if (teleme1 <0) {
					System.out.print("Invalid input.Enter value >=0: ");
					teleme1=kbinput.nextInt();
				}else {
					System.out.print("Invalid input Enter a values that's multiple of 0.5: ");
					teleme1=kbinput.nextInt();
				}
			}
			}
		}	
 		System.out.println("");
 		System.out.print("Display the itemized list? (1 for yes) ");
 		DispItem=kbinput.nextInt();
 	//Subtotal
 		subHumbFog= HumbFog*25.00;
 		subRedHwk= redHwk*40.50;
 		subTeleme= teleme1*17.25;
 		subTotal= (subHumbFog+subRedHwk+subTeleme);
     //discounting
 				discHumbFog=HumbFog;
 				if(discHumbFog>=1) {
 					discHumbFog=((discHumbFog*25)/2);
 				}
 	// Red Hwk buy 2 packages get 1 free

 				discRedHwk=redHwk;
 				if( discRedHwk%2==0 || discRedHwk%3==0||discRedHwk%1.5==0) {
 						discRedHwk=discRedHwk/2;
 						discRedHwk*=20.25;
 				}
 		if(DispItem==1) {
 		System.out.println(HumbFog+" lb of Humboldt Fog @ $25.00"+" = "+"$"+subHumbFog);
 		}		
 		System.out.println("");
 		System.out.println("Original Sub Total: "+ subTotal);
 		System.out.println("Specials...");
 		System.out.println("Humboldt Fog (Buy 1 Get 1 Free): "+"-"+ discHumbFog);
 		System.out.println("Red Hawk (Buy 2 get 1 Free)");
 		newSubTotal= (subTotal-(discHumbFog+discRedHwk));
 		System.out.println("New Sub Total: "+(newSubTotal));
 		
 		if(newSubTotal>150) {
 			additDisc=0.10;
 		additDisc=newSubTotal*additDisc;
 		}
 		if (newSubTotal>250) {
 			additDisc=0.15;
 		additDisc=newSubTotal*additDisc;
 		}
 		System.out.println("Additional "+"Discount");
 		System.out.println("Final Total: ");
 		
 		
 		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
	}

}
