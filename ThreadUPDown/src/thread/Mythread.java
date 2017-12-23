package thread;

public class Mythread extends Thread {
	

	@Override
	public void run(){
		while(!this.interrupted()) {
			System.out.println("运行中");
			/////////
			//执行过程
			/////////
			System.out.println("本次运行结束");
			
		}

	}
}
