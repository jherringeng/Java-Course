import java.util.Scanner;

public class JobApplication {

	static Scanner appInput = new Scanner(System.in);
	static HrTeam jobApp = null;

	static void checkMarks(int a) throws MarksException {
		if (a < 71)
			throw new MarksException(a);
		System.out.println("\nYour marks are sufficient for this application.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nWhich department would you like to apply for?");
		System.out.println("1. HR ");
		System.out.println("2. Technology ");
		System.out.println("3. Product ");

		int appChoice = appInput.nextInt();
		appInput.nextLine();

		if (appChoice == 1) {
			jobApp = new HR(); 
		} else if (appChoice == 2) {
			jobApp = new TECH(); 
		} else if (appChoice == 3) {
			jobApp = new PRODUCT();
		}

		System.out.println("\nPlease enter your marks:");

		int appMarks = appInput.nextInt();
		appInput.nextLine();

		try {
			checkMarks(appMarks);
			jobApp.hireEmployee();
			jobApp.showDepartment();

		} catch(MarksException ex1) {
			System.out.println(ex1);
		}

	}

}