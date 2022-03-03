import java.util.Scanner;

public class RunShop {
	
	public static int amtCheese=0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Cheeses for shop setup: ");
	    int amtCheese=input.nextInt();
	    ShopArr shop = new ShopArr(amtCheese);
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
		input.close();
	
	}

}
