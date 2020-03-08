
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tester tester = new Tester();
		Developer developer = new Developer();
		
		System.out.println("Employee Details: ");
		
		System.out.println(tester.getName());
		System.out.println("Salary £" + tester.earn());
		System.out.println("job details: " + tester.work());
		
		System.out.println(developer.getName());
		System.out.println("Salary £" + developer.earn());
		System.out.println("job details: " + developer.work());
		
	}

}
