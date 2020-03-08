
public class BankInterestRates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBC hsbc = new HSBC();
		Barclays barclays = new Barclays();
		Santander santander = new Santander();
		RBS rbs = new RBS();
		
		System.out.println("Bank Interest Rates: ");
		
		System.out.println(hsbc.getName() +  " APR = " + hsbc.RateOfInterest() + "%");
		System.out.println(barclays.getName() +  " APR = " + barclays.RateOfInterest() + "%");
		System.out.println(santander.getName() +  " APR = " + santander.RateOfInterest() + "%");
		System.out.println(rbs.getName() +  " APR = " + rbs.RateOfInterest() + "%");

	}

}
