package kr.co.ezenac.thread;

class MyThread2 implements Runnable{

	@Override
	public void run() {
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += i;
		}
		String name = Thread.currentThread().getName();
		System.out.println(name +" : "+sum);
	}
	
}

public class RunnableInterface {

	public static void main(String[] args) {
		Thread myThread = new Thread(new MyThread2());
		myThread.start(); // Thread-0 : 45
		
	}

}
