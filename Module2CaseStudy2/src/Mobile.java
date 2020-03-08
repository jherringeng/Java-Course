import java.util.Scanner;

public class Mobile {

	static Scanner mobileInput = new Scanner(System.in);
	static String numberInput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String menuInput;

		for(int i = 1;;i++) {
			
			if (i % 2 == 1) {

			System.out.println("Select your service:");
			System.out.println("1. Call");
			System.out.println("2. Message");

			menuInput = mobileInput.nextLine();

			if (menuInput.contentEquals("1")) 
				Mobile.dial(); 

			if (menuInput.contentEquals("2")) 
				Mobile.message(); 
			
			} else 
				Mobile.receive();
				
			System.out.println("\n--------------------------------------- \n");

		}

	}

	public static void dial() {

		System.out.println("Please enter number to call: ");
		numberInput = mobileInput.nextLine();
		if (numberInput.equals("999")) {
			
			System.out.println("Which emergency service do you require? ");
			
		} else
			System.out.println("Number not recognised. ");
			
	}

	public static void receive() {

		System.out.println("Call from 07674567899 ");
		System.out.println("1. Answer ");
		System.out.println("2. Ignore ");

		String receiveInput = mobileInput.nextLine();

		if (receiveInput.contentEquals("1")) {
			System.out.println("Hello? "); 
			System.out.println("Hello? Is Dave there?");
			System.out.println("No, this is Mike. You've got the wrong number.");
			System.out.println("Oh, okay. Sorry, bye.");

		}

		if (receiveInput.contentEquals("2")) 
			System.out.println("Missed call"); 

	}

	public static void message() {

		System.out.println("Please enter number to message: ");
		numberInput = mobileInput.nextLine();		

		System.out.println("Enter text: ");
		numberInput = mobileInput.nextLine();
		System.out.println("Message sent ");

	}

}
