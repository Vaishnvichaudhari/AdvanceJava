package day7;

public class SimpleThread extends Thread {

public void run() {
	 //This method get invokes when the thread execution begin
	 System.out.println("Simple thread works..");
 }
	public static void main(String[] args) {
	    Thread t1 = new SimpleThread();
	    t1.start();

	}

}
