package kr.co.ezenac.multithread;

import java.io.IOException;

public class TeminateThreadTest extends Thread {

	private boolean flag = false;

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public TeminateThreadTest(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (!flag) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "thread end");
	}

	public static void main(String[] args) throws IOException {
		
		TeminateThreadTest threadA = new TeminateThreadTest("A");
		TeminateThreadTest threadB = new TeminateThreadTest("B");
		TeminateThreadTest threadC = new TeminateThreadTest("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		System.out.print("종료시킬 스레드 이름 입력(A, B, C, M)");
		int in;
		while(true) {
			in = System.in.read();
			System.in.read(); 		// \r
			System.in.read(); 		// \n
			if(in == 'A') {
				threadA.setFlag(true);	// true넣으면 정지
			}
			else if(in == 'B') {
				threadB.setFlag(true);
			}
			else if(in == 'C') {
				threadC.setFlag(true);
			}
			else if(in =='M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
		System.out.println("main thread end");
	}

}









