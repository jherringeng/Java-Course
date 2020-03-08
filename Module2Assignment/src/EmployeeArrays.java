
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrays {

	static Scanner adminInput = new Scanner(System.in);

	static ArrayList<String> employeeIDArray = new ArrayList<>();
	static ArrayList<String> employeeNameArray = new ArrayList<>();
	static ArrayList<String> employeeSalaryArray = new ArrayList<>();


	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			System.out.println("Please enter employee ID: ");
			String employeeIDInput = adminInput.nextLine();

			System.out.println("Please enter employee name: ");
			String employeeNameInput = adminInput.nextLine();

			System.out.println("Please enter employee salary (£): ");
			String employeeSalaryInput = adminInput.nextLine();

			employeeIDArray.add(employeeIDInput);
			employeeNameArray.add(employeeNameInput);
			employeeSalaryArray.add(employeeSalaryInput);

			System.out.println("--------------------------------- ");

		}	

		display(employeeIDArray, employeeNameArray);
		display(employeeIDArray, employeeNameArray, employeeSalaryArray);
		for (;;) {

			System.out.println("\n---------------------------------\n ");
			searchName();

		}



	}

	public static void display(ArrayList<String> employeeIDArray, ArrayList<String> employeeNameArray) {

		System.out.println("");
		System.out.println("ID \tName");

		for (int i = 0; i < employeeIDArray.size(); i++) {
			System.out.print(employeeIDArray.get(i) + "\t");
			System.out.print(employeeNameArray.get(i) + "\t");
			System.out.println();
		}


	}

	public static void display(ArrayList<String> employeeIDArray, ArrayList<String> employeeNameArray, ArrayList<String> employeeSalaryArray) {

		System.out.println("");
		System.out.println("ID \tName \tSalary");

		for (int i = 0; i < employeeIDArray.size(); i++) {
			System.out.print(employeeIDArray.get(i) + "\t");
			System.out.print(employeeNameArray.get(i) + "\t");
			System.out.print("£" + employeeSalaryArray.get(i) + "\t");
			System.out.println();
		}

	}

	public static void display(ArrayList<String> employeeIDArray, ArrayList<String> employeeNameArray, ArrayList<String> employeeSalaryArray, int i) {

		System.out.println("");
		System.out.println("ID \tName \tSalary");

		System.out.print(employeeIDArray.get(i) + "\t");
		System.out.print(employeeNameArray.get(i) + "\t");
		System.out.print("£" + employeeSalaryArray.get(i) + "\t");
		System.out.println();

	}

	public static void searchName() {

		System.out.println("Search for employee by name:");
		String nameSearchInput = adminInput.nextLine();

		int i;

		for (i = 0; i < employeeIDArray.size(); i++) {

			if  (employeeNameArray.get(i).equals(nameSearchInput))
				break;

		}


		if (i == employeeIDArray.size())
			System.out.println("Employee name not recognised.");
			
		else 
			display(employeeIDArray, employeeNameArray, employeeSalaryArray, i);



	}

}