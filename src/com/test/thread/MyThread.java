package com.test.thread;

class MyThread extends Thread {
    public static void main(String args[]) {
        MyThread my = new MyThread();
        my.start();

    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getPriority());
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
	
		/*
		class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
} 
		*/
		

	