package kr.co.ezenac.thread;

public class AnonymousThread {

	public static void main(String[] args) {
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);	// 3초후 실행 
				} catch (InterruptedException e) {
					e.printStackTrace();
					throw new RuntimeException(e);	// 일부러 예외발생!
				}
				int sum=0;
				for(int i=0;i<10;i++)
					sum+=i;
				String name = Thread.currentThread().getName();
				System.out.println(name + " : "+ sum);
			}
		};
		Thread thread = new Thread(task);
		thread.start(); // 3초후 Thread-0 : 45
	}

}
