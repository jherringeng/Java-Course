import maths.functions.MathsFunctions;

public class Module4Main extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Out of Bounds exception exercise
		OutOfBounds outOfBounds = new OutOfBounds();
		
		outOfBounds.arrayDetails();
		
		outOfBounds.testArray(1);
		outOfBounds.testArray(6);
		
		// Maths functions package exercise 
		MathsFunctions mathsFunctions = new MathsFunctions();
		
		mathsFunctions.subtract();
		mathsFunctions.multiply();
		mathsFunctions.divide();
		mathsFunctions.factorial();
		
		
		System.out.println("\nQueue Interface Exercise");
		QueueInterface qInterface = new QueueInterface();
		
		qInterface.insert(1);
		qInterface.insert(2);
		qInterface.insert(3);
		

		qInterface.delete();
		qInterface.delete();
		qInterface.delete();
		
		System.out.println("\nMultithread Exercise");
		
		ThreadTimes5 threadtimes5 = new ThreadTimes5(); 
		threadtimes5.start(); 
		
		Thread threadEvens = Thread.currentThread();
		
		for (int i = 2; i <= 40; i = i + 2) { 
			System.out.println(i); 
			}
		
	}

}
