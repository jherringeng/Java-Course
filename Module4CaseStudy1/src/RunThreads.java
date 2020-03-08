
public class RunThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1 = new Thread(new Thread0to10());
		Thread thread2 = new Thread(new Thread101to110());
		
		// Thread0to10 thread1 = new Thread0to10(); 
		// Thread101to110 thread2 = new Thread101to110();
		
		thread1.start(); 
		thread2.start(); 
		
	}

}
