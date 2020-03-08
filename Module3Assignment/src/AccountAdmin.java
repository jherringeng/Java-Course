import java.util.Scanner;

public class AccountAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner serviceInput = new Scanner(System.in);

		CurrentAccount currentAccount = new CurrentAccount();
		SBAccount sbAccount = new SBAccount();

		for (;;) {

			System.out.println("Please select your service: ");
			System.out.println("1: Open new account.");
			System.out.println("2: Check balance.");
			System.out.println("3: Deposit.");
			System.out.println("4: Withdraw.");
			
			int accountService = serviceInput.nextInt();
			int accountSelection = 0;

			serviceInput.nextLine();

			if (accountService == 1) {

				System.out.println("Please select your account: ");
				System.out.println("1: Current account.");
				System.out.println("2: SB balance.");

				accountSelection = serviceInput.nextInt();

				serviceInput.nextLine();

				if (accountSelection == 1) {

					AccountAdmin.openNewCurrentAccount(currentAccount);

				} else if (accountSelection == 2) {

					AccountAdmin.openNewSBAccount(sbAccount);

				}


			} if (accountService == 2) {

				System.out.println("Please enter your account number. ");
				int accountNumber = serviceInput.nextInt();

				serviceInput.nextLine();

				if (accountNumber == 1 && currentAccount.accountActive == true) {
					
					float currentAmount = currentAccount.getAmount();
					System.out.println("You have £" + currentAmount + ".");

				} else if (accountNumber == 2  && sbAccount.accountActive == true) {

					float sbAmount = sbAccount.getAmount();
					System.out.println("You have £" + sbAmount + ".");
					

				} else {

					System.out.println("That account is not recognised. ");

				}

			} else if (accountService == 3) {
				
				System.out.println("Please enter your account number. ");
				int accountNumber = serviceInput.nextInt();

				serviceInput.nextLine();

				if (accountNumber == 1 && currentAccount.accountActive == true) {
					
					float currentAmount = currentAccount.getAmount();
					System.out.println("You have £" + currentAmount + "." + "");
					
					System.out.println("Please enter the amount you would like to deposit.");
					
					float depositAmount = serviceInput.nextFloat();
					serviceInput.nextLine();
					
					currentAccount.deposit(depositAmount);
					currentAmount = currentAccount.getAmount();
					System.out.println("You have £" + currentAmount + "." + "");

				} else if (accountNumber == 2  && sbAccount.accountActive == true) {

					float sbAmount = sbAccount.getAmount();
					System.out.println("You have £" + sbAmount + "." + "");
					
					System.out.println("Please enter the amount you would like to deposit.");
					
					float depositAmount = serviceInput.nextFloat();
					serviceInput.nextLine();
					
					sbAccount.deposit(depositAmount);
					sbAmount = sbAccount.getAmount();
					System.out.println("You have £" + sbAmount + "." + "");
					

				} else {

					System.out.println("That account is not recognised. ");

				}
				
			} else if (accountService == 4) {
				
				System.out.println("Please enter your account number. ");
				int accountNumber = serviceInput.nextInt();

				serviceInput.nextLine();

				if (accountNumber == 1 && currentAccount.accountActive == true) {
					
					float currentAmount = currentAccount.getAmount();
					System.out.println("You have £" + currentAmount + " and can withdraw £" +(currentAmount - currentAccount.minBalance +"."));
					
					System.out.println("Please enter the amount you would like to withdraw.");
					
					float depositAmount = serviceInput.nextFloat();
					serviceInput.nextLine();
					
					currentAccount.withdraw(depositAmount);
					currentAmount = currentAccount.getAmount();
					System.out.println("You have £" + currentAmount + "." + "");

				} else if (accountNumber == 2  && sbAccount.accountActive == true) {

					float sbAmount = sbAccount.getAmount();
					System.out.println("You have £" + sbAmount + " and can withdraw £" +(sbAmount - sbAccount.minBalance +"."));
					
					System.out.println("Please enter the amount you would like to withdraw.");
					
					float depositAmount = serviceInput.nextFloat();
					serviceInput.nextLine();
					
					sbAccount.withdraw(depositAmount);
					sbAmount = sbAccount.getAmount();
					System.out.println("You have £" + sbAmount + "." + "");
					

				} else {

					System.out.println("That account is not recognised. ");

				}
				
			} 

			System.out.println(" ");
			System.out.println("********************************************* ");
			System.out.println(" ");

		}

	}

	public static void openNewCurrentAccount(CurrentAccount currentAccount) {

		Scanner serviceInput = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String accountName = serviceInput.nextLine();

		currentAccount.setName(accountName);

		System.out.println("Please enter the account you want to deposit: ");

		float amountInitial = serviceInput.nextFloat();
		serviceInput.nextLine(); 

		currentAccount.setAmount(amountInitial);

	} 

	public static void openNewSBAccount(SBAccount sbAccount) {

		Scanner serviceInput = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String accountName = serviceInput.nextLine();

		sbAccount.setName(accountName);

		System.out.println("Please enter the account you want to deposit: ");

		float amountInitial = serviceInput.nextFloat();
		serviceInput.nextLine(); 

		sbAccount.setAmount(amountInitial);

	}


}

