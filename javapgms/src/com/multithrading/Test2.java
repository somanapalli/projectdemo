package com.multithrading;

public class Test2 extends Thread {

	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
