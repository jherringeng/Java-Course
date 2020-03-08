import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Collection {

	public void insert1to10 () {
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();

		for (Integer i = 1; i < 11; i++ )

			intArrayList.add(i);

		System.out.println("ArrayList = ");
		System.out.println(intArrayList);

	}

	public void createEmployeeRecords() {
		
		HashMap<String, String> employeeRecords = new HashMap<String, String>();

		employeeRecords.put("Wayne", "Marketing");
		employeeRecords.put("Dwight", "Development");
		employeeRecords.put("Stuart", "Operations");
		employeeRecords.put("Nigel", "Sales");
		employeeRecords.put("Pam", "Management");

		System.out.println("\nEmployee Records Hashmap: ");
		System.out.println("Name: \tDepartment: ");

		for (String i : employeeRecords.keySet()) {
			System.out.println(i + " \t" + employeeRecords.get(i));
		}


	}

	public void createStudentRecords() {
		
		Hashtable<String, Integer> studentRecords = new Hashtable<String, Integer>();

		studentRecords.put("Francis", 70); 
		studentRecords.put("Mabel", 71); 
		studentRecords.put("Arnold", 72); 
		studentRecords.put("Donald", 73); 
		studentRecords.put("Raymond", 74);

		Integer highMark = new Integer (0);
		String highStudent = null;
		
		System.out.println("\nStudent Records Hashmap: ");
		System.out.println("Name: \tScore: ");
		
		for (String i : studentRecords.keySet()) {
			
			System.out.println(i + " \t" + studentRecords.get(i));
			
			if (studentRecords.get(i) > highMark)  {
				highMark = studentRecords.get(i);
				highStudent = i;
			}
			
		}

		System.out.println("\nHighest scoring student:");
		System.out.println(highStudent + " \t" + studentRecords.get(highStudent));

	}

}
