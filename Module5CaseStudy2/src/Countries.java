import java.util.ArrayList;
import java.util.Collections;

public class Countries { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> countries = new ArrayList<String>();
		
		countries.add("Italy");
		countries.add("Germany");
		countries.add("USA");
		countries.add("UK");
		countries.add("Japan");
		countries.add("France");
		countries.add("Canada");
		countries.add("Russia (currently excluded)");
		
		System.out.println("G8 Countries ArrayList: ");
		System.out.println(countries);
		
		System.out.println("\nUnsorted G8 countries: ");
		
		for (int i = 0; i < countries.size(); i++) {
		      System.out.println(countries.get(i));
		    }
		
		Collections.sort(countries);
		
		System.out.println("\nSorted G8 countries: ");
		
		for (String i : countries) {
		      System.out.println(i);
		    }

	}

}
