
import java.util.Scanner;

public class BuyTickets {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ticketInput = new Scanner(System.in);
		
		for (;;) {
		
		System.out.println("Enter number of tickets required: ");
		int noOfTickets = ticketInput.nextInt();
		
		ticketInput.nextLine();
		
		
		System.out.println("Do you want to upgrade to Gold (type Yes for Gold): ");
		String goldTicketsChoice = ticketInput.nextLine();
		
		buyTickets(noOfTickets, goldTicketsChoice);
		
		System.out.println(" ");
		System.out.println("************************************************** ");
		System.out.println(" ");
		
		}
		
	}
	
	public static void buyTickets (int noOfTickets, String goldTicketsChoice) {
		
		float silverTicketPrice = 150;
		float goldTicketPrice = 200;
		float totalTicketCost;
		
		Boolean goldTicketsSelected = false;
		
		
		if (goldTicketsChoice.contentEquals("Yes")) {
			
			goldTicketsSelected = true;
			
		}
		
		
		if (goldTicketsSelected == true) {
		
			totalTicketCost = noOfTickets * goldTicketPrice;
		
		} else {
			
			totalTicketCost = noOfTickets * silverTicketPrice;
			
		}	
		
		System.out.println("Total Cost: " + totalTicketCost + " Rn");
		
	}

	
}

