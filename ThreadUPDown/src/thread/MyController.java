package thread;

public class MyController {
	private static Mythread t=new Mythread();
	private static Boolean LOCK; //程序是否加锁（程序运行时，如果出现某个状态则加锁，使stop（）无法执行）
	private static Boolean SLEEP;//系统是否处于休眠
	
	private MyController() {		
		super();		
	}
	
	public static void createController() throws InterruptedException{
		LOCK=false;
		SLEEP=true;
	}


	public static void run() {
		if(SLEEP==true) {
			t.start();
			SLEEP=false;
		}
	}
	
	public static void stop() {
		if(SLEEP==false && LOCK==false) {
			t.interrupt();
			SLEEP=true;
		}
		
	}


}
