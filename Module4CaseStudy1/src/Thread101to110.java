
public class Thread101to110 extends Thread{
	
    public void run() 
    { 
        for (int i = 101; i <= 110; i++) {
        	
        	System.out.println(i);  
        	try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}       	
        	
        }
    }
}