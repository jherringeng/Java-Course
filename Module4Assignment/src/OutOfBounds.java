
public class OutOfBounds {
	
	int[] iArray = {1, 2, 3, 4, 5};
	
	public void arrayDetails() {
		
		System.out.println("Array elements: " + iArray);
		System.out.println("Array size: " + iArray.length);
		
	}
	
	
	public void testArray (int i) {
		
		try {
			
			System.out.println("Array element = " + iArray[i]);
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}		
		
	}

}
