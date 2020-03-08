import java.util.Scanner;

public class DrinksMenu {
	
	static Scanner drinksInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] drinks = {"Beer   ", "Wine   ", "Coke   ", "Whiskey", "Vodka"};		
		float[] prices = {4.00f, 5.00f, 3.00f, 4.5f, 4.0f};
		int[] drinksOrdered = {0, 0, 0, 0, 0};

		String drinksMenuSelected;
		float totalBill = 0f;

		System.out.println("Drinks Menu: ");
		System.out.println(" ");

		do {

			for (int i = 1; i < 6; i++) {

				System.out.println(i + ". " + drinks[i-1] + "\t£" + prices[i-1]);

			}

			System.out.println(" ");
			System.out.println("Please enter the number of your drink and quantity.");



			System.out.println("Please enter your drink selection:");
			int drinksSelection = drinksInput.nextInt();
			drinksInput.nextLine();

			System.out.println("Please enter the quantity of drinks:");
			int drinksQuantity = drinksInput.nextInt();
			drinksInput.nextLine();
			
			drinksOrdered[drinksSelection - 1] = drinksOrdered[drinksSelection - 1] + drinksQuantity;

			System.out.println("Select more drinks?");
			System.out.println("Type Yes to select more drinks.");

			drinksMenuSelected = drinksInput.nextLine();

		} while (drinksMenuSelected.equals("Yes"));
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("Total Bill:");
		System.out.println("");
		
		for (int i = 1; i < 6; i++) {
			
			if (drinksOrdered[i-1] > 0) {
				
				System.out.println(i + ". " + drinks[i-1] + "\tQuant x" + drinksOrdered[i-1] + "\t£" + (prices[i-1] * drinksOrdered[i-1]));
				totalBill = totalBill + (prices[i-1] * drinksOrdered[i-1]);

			}
			
		} 
		
		System.out.println("");
		System.out.println("Total Cost = £" + totalBill);

	}

}
