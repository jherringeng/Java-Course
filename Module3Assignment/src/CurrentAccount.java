
final public class CurrentAccount extends Account{

	int number = 1;

	final float minBalance = -400;

	public float getMinBalance () {

		return minBalance;

	}

	public void setAmount (float inputAmount) {

		if (inputAmount >= 1) {

			amount = inputAmount;
			accountActive = true;

			System.out.println("Thank you " + name +".");
			System.out.println("Your account number is " + number +".");
			System.out.println("Your balance is £" + amount +" and you have £" + (amount -minBalance) + " available.");

		} else {

			System.out.println("Please deposit at least £1 to activate this account.");

		}

	}

	public void withdraw (float amountWithdrawn) {

		if (amount - amountWithdrawn >= minBalance) {

			amount = amount - amountWithdrawn;

		} else {

			System.out.println("You do not have the funds available to withdraw this amount.");

		}


	}

}
