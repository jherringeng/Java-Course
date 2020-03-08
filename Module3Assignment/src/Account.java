
public abstract class Account {

	int number;
	String name;
	float amount;
	
	boolean accountActive = false;
	
	public void activateAccount() {
		
		accountActive = false;
		
	}
	
	public boolean checkAccountActive() {
		
		return accountActive;
		
	}

	public void setNumber (int inputNumber) {

		number = inputNumber;

	}

	public int getNumber () {

		return number;

	}

	public void setName (String inputName) {

		name = inputName;

	}

	public String getName () {

		return name;

	}

	public void setAmount (float inputAmount) {

		amount = inputAmount;

	}

	public float getAmount () {

		return amount;

	}

	public void deposit (float amountDeposited) {

		amount = amount + amountDeposited;

	}

	public void withdraw (float amountWithdrawn) {

		amount = amount - amountWithdrawn;

	}

}

