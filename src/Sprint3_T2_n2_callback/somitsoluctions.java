package Sprint3_T2_n2_callback;

public class somitsoluctions {

	public static void main(String[] args) {
		
		Caller caller = new Caller();
		caller.callAsynctaskOfCallee();
		
	}
}


class Caller implements Callback{
	
	Callee callee = new Callee(this);

	@Override
	public void notifyCaller() {
		System.out.println("Thank you callee for executing my task");
		System.out.println("Now I will take the data and process");

	}
	
	public void callAsynctaskOfCallee() {
		callee.doAsynchronousTask();
		
	}
	
}

class Callee{
	
	private Callback cb;

	public Callee(Callback cb) {
		this.cb = cb;
	}
	
	// Execute the main task in a background thread asynchronous 
	public void doAsynchronousTask() {
		System.out.println("I am starting async task");
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

		System.out.println("I am don whith the Async task");
		cb.notifyCaller();
	}
	
}


interface Callback{
	
	void notifyCaller();
	
}
