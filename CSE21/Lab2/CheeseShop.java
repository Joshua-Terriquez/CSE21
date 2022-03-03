
import java.util.Scanner;
public class CheeseShop {

	public static void main(String[] args) {
		Scanner kbinput=new Scanner(System.in);
		double amntFog,total,teleme1,redHwk,discHumbFog=0,discRedHwk=0,subTotal;
		int dispAnsr;

		System.out.println("We sell 3 kinds of Cheese (in 0.5 lb packages):\nHumboldt Fog: $25.0 per pound\nRed Hawk: $40.5 per pound\nTeleme: $17.25 per pound");
		//amntFog
		System.out.print("\nEnter the amount of Humboldt Fog in lbs: ");
		amntFog=kbinput.nextDouble();
		while (amntFog < 0 || amntFog % 0.5!= 0){
			if (amntFog< 0) {
				System.out.print("Invalid input. Enter a value >=0: ");
				amntFog=kbinput.nextDouble();
			}else  if (amntFog % 0.5!=0){
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				amntFog=kbinput.nextDouble();
			}
		}
		//RedHawk input...
		System.out.print("Enter the amount of Red Hawk in lbs: ");
		redHwk=kbinput.nextDouble();
		while (redHwk < 0 || redHwk % 0.5!=0) {
			if (redHwk < 0) {
				System.out.print("Invalid input. Enter a value >=0: ");
				redHwk=kbinput.nextDouble();
			}else {
				System.out.print("Invalid input. Enter a value that's multiple of 0.5: ");
				redHwk=kbinput.nextDouble();
			}
		}
		//teleme1 input...
		System.out.print("Enter the amount of Teleme in lbs: ");
		teleme1=kbinput.nextDouble();

		while (teleme1 < 0||teleme1 % 0.5!=0) {
			if (teleme1 <0) {
				System.out.print("Invalid input.Enter value >=0: ");
				teleme1=kbinput.nextInt();
			}else {
				System.out.print("Invalid input Enter a values that's multiple of 0.5: ");
				teleme1=kbinput.nextInt();
			}
		}
		//subtotal
		double totFog= (amntFog*25.0);
		double totredHwk= (redHwk*40.5);
		double  totTeleme= (teleme1*17.25);

		//discounting
		discHumbFog=amntFog;
		if(discHumbFog>=1) {
			discHumbFog=((discHumbFog*25)/2);
		}
		// Red Hwk buy 2 packages get 1 free

		discRedHwk=redHwk;
		if( discRedHwk%2==0 || discRedHwk%3==0||discRedHwk%1.5==0) {
			discRedHwk=discRedHwk/2;
			discRedHwk*=20.25;
		}
		System.out.println("");
		System.out.print("Display the itemized list? (1 for yes) ");
		dispAnsr=kbinput.nextInt();

		//Calculations
		subTotal=(totFog + totredHwk + totTeleme);

		if (discRedHwk>=4) {
			total= subTotal-(discHumbFog + discRedHwk);
		}else {
			total= subTotal-(discHumbFog);
		}
		//Display results...
		if(dispAnsr==1) {
			if (amntFog>0) {
				System.out.println(amntFog+" lb of Humboldt Fog @ $25.0 = "+"$"+(totFog));
			}if(redHwk>0) {
				System.out.println(redHwk+" lb of Red Hawk @ $40.5 = "+ "$"+(totredHwk));
			}if (teleme1>0)
				System.out.println(teleme1+" lb of Teleme @ 17.25 = "+"$"+(totTeleme));
		}
		System.out.println("");
		System.out.println("SubTotal:\t\t\t  "+"$"+(subTotal));
		System.out.println("Discounts...");
		if (amntFog>=1) {
			System.out.println("Humboldt Fog (Buy 1 Get 1 Free)\t -"+"$"+discHumbFog);
		}
		if (discRedHwk < 0 ||discRedHwk>=4) {
			System.out.println("Red Hawk (Buy 2 Get 1 Free)\t -"+"$"+discRedHwk);
		}
		if (amntFog<=1 && discRedHwk < 1) {
			System.out.println("None\t\t\t\t -$0.0");
		}
		System.out.println("Final Total:\t\t\t "+" $"+total);
	}

}
