import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
	
	Queue<Integer> qExample = new LinkedList<>();
	
	public void insert (int i) {
		
		qExample.add(i);
		System.out.println("\n" + qExample);
		int size = qExample.size(); 
	    System.out.println("Size of queue = " + size); 
		
	}
	
	public void delete () {
		
		int i = qExample.remove();
		System.out.println("\nDeleted " + i);
		System.out.println(qExample);
		int size = qExample.size(); 
	    System.out.println("Size of queue = " + size); 
		
	}
		
}
