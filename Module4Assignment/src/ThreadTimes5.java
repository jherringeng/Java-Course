
class ThreadTimes5 extends Thread 
{ 
    public void run() 
    { 
        for (int i =0; i <= 20; i++) {
        	
        	System.out.println(i + " x 5 = " + (i * 5));        	
        	
        }
    } 
}