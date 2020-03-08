
public class PRODUCT implements HrTeam {
	
	String name = "Product Development";

	@Override
	public void showDepartment() {
		
		System.out.println("\nDepartment: " + name);
		
	}

	@Override
	public void hireEmployee() {

		System.out.println("\nYour application has been successful. ");
		System.out.println("\nWe will contact you for the next stage of our recruitment process. ");	
		
	}

	@Override
	public void checkMarks() {
		// TODO Auto-generated method stub
		
	}

}
