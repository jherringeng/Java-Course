
import java.util.Scanner;

public class BuyTickets {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		for (;;) {
			
			System.out.println("Enter number of tickets required: ");
			int noOfTickets = userInput.nextInt();
			
			buyTickets( noOfTickets );
			
			System.out.println(" ");
			System.out.println("********************************* ");
			
		}
		
	}
	
	public static void buyTickets(int noOfTickets) {
		
		float ticketPrice = 400;
		float ticketDiscount = 0.1f;
		float totalTicketCost;
		float totalTicketDiscount = 0;
		
		
		totalTicketCost = noOfTickets * ticketPrice;
		
		if (noOfTickets > 10) {
			
			totalTicketDiscount = ticketDiscount * totalTicketCost;
			totalTicketCost = totalTicketCost - totalTicketDiscount;
			
		}
		
		System.out.println("Total Cost: " + totalTicketCost + " Rn");

		if (noOfTickets > 10) {
			
			System.out.println("You Saved: " + totalTicketDiscount + " Rn");
			
		}
		
	}

	
	
	
}
