package thread;

public class Mythread extends Thread {
	

	@Override
	public void run(){
		try {
			while(!this.interrupted()) {
				System.out.println("运行中");
				Thread.sleep(1000*60);
				System.out.println("本次运行结束");
				
			}
			
		} catch (InterruptedException e) {
			System.out.println("线程已被中断");
			Thread.currentThread().interrupt();
		}

	}
}
