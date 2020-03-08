
final public class SBAccount extends Account {
	
	int number = 2;
	
	final float minBalance = 100;
	
	float interestAPR = 4;
	float interest = 1.04f;
	
	public float getMinBalance () {
		
		return minBalance;
		
	}
	
	public float getInterestAPR () {
		
		return interestAPR;
		
	}
	
	public float getInterest () {
		
		return interest;
		
	}
	
	public void setAmount (float inputAmount) {
		
		if (inputAmount >= minBalance) {
			
			amount = inputAmount;
			accountActive = true;
			
			System.out.println("Thank you " + name +".");
			System.out.println("Your account number is " + number +".");
			System.out.println("Your balance is £" + amount +" and you have £" + (amount -minBalance) + " available.");

			
		} else {
			
			
			System.out.println("Please deposit at least £ " + minBalance + " to activate this account.");
			
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
