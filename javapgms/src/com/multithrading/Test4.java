package com.multithrading;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		Runnable r = ()->{
			
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
			};
			
			//converts Runnable object into Thread object
			Thread t = new Thread(r);
			
			t.setName("rk");
			t.start();
			
			
			
	}

}
