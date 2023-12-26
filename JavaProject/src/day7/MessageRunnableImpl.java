package day7;

public class MessageRunnableImpl implements Runnable {
    private String message;
    private int delaytime;
	
    
    public MessageRunnableImpl(String message, int delaytime) {
		super();
		this.message = message;
		this.delaytime = delaytime;
	}
    
    
	@Override
	public void run() {
	for(int i=0; i<=10; i++) {
		System.out.println(message);
	}
	try {
		Thread.sleep(delaytime);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
