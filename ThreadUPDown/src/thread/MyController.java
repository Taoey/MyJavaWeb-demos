package thread;

public class MyController {
	
	
	private static Mythread t;
	
	private MyController() {
		super();
	}

	public static void createController(){
		t = new Mythread(); 
	}


	public static void run() {
		t.start();
	}
	
	public static void stop() {
		t.interrupt();
	}


}
