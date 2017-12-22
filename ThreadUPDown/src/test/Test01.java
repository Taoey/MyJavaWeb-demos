package test;

import org.junit.Test;

import thread.MyController;
import thread.Mythread;

public class Test01 {

	@Test
	public void test00() throws InterruptedException {
		Mythread t1=new Mythread();
		t1.start();
		Thread.sleep(1000*10);
		t1.interrupt();		
	}
	/**
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void test01() throws InterruptedException {
		MyController.createController();
		MyController.run();
		Thread.sleep(1000*5);
		MyController.stop();
	}
	
	/**
	 * 程序运行过程中被中断
	 * @throws InterruptedException
	 */
	@Test
	public void test02() throws InterruptedException {
		MyController.createController();
		MyController.run();
		MyController.stop();
	}

}
