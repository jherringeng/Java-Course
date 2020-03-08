
public class Main {

	public static void main(String[] args) {
	
		String output = "";
		
		for (int i = 17; i <= 53; i++) {
						
			if (i % 10 == 0) {
				
				output = "FooBar";
				
			} else if (i % 2 == 0) {
				
				output = "Foo";
				
			} else if (i % 5 == 0) {
				
				output = "Bar";
				
			} else {
				
				output =  Integer.toString(i);
				
			}
			
			System.out.println(output);
			
		}
		
	}

}
