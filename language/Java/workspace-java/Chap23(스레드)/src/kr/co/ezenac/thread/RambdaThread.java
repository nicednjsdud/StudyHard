package kr.co.ezenac.thread;

public class RambdaThread {

	public static void main(String[] args) {
		
		Runnable task = () -> {			// Runnable 참조변수에 람다식을 대입
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
		};
		
		Thread thread = new Thread(task);
		thread.start(); // Thread-0 : 45
	}

}
