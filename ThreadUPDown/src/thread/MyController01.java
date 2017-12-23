package thread;

public class MyController01 extends Thread{

	private static MyController01 c=null;
	private static Boolean LOCK; //程序是否加锁（程序运行时，如果出现某个状态则加锁，使stop（）无法执行）
	private static Boolean SLEEP;//系统是否处于休眠
	private static Boolean ISABLE;
	
	private MyController01() {		
		super();
	}
	public static void createController() throws InterruptedException{
		if(c==null) {
			c=new MyController01();
			LOCK=false;
			SLEEP=true;
		}
	}

	@Override
	public void run(){
		while(!this.isInterrupted()) {
			System.out.println("运行中");
			/////////
			//执行过程
			try {
				Thread.sleep(1000*100);

			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			/////////
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
			System.out.println("本次运行结束");
			
		}
	}
	
	public static void crun() {
		if(SLEEP==true) {
			c.start();
			SLEEP=false;
		}
	}
	public static void cstop() {
		if(SLEEP==false && LOCK==false) {
			c.interrupt();
			SLEEP=true;
			c=null;
		}
		
	}
	public static boolean isSleep() {
		return c.SLEEP;
	}
	public static boolean cisInterrupted() {
		return c.isInterrupted();
	}
	public static boolean cisAlive(){
		if(c==null) {
			return false;
		}
		else {
			State t=currentThread().getState();
			boolean a=c.isAlive();
			return "RUNNABLE".equals(t.name());
			
		}
	}




}
