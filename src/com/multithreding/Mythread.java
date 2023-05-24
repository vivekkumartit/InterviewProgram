package com.multithreding;
/*
 * Thread life cycle
 * >Born
 * >Runnable
 * >Running
 * >Dead
 * >Wait
 * 
 * 
 * prevent thread execution
 * yield()
 * join()
 * sleep()
 * 
 * race condition/datainconsistency/concurrency
 * 
 * 
 * 
 * */

public class Mythread {
	public static void main(String[] args) {
		Test t1=new Test();
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("hy");
		}

}
}


 class Test extends Thread {
	 public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("hello");
			}
		}

	
}
