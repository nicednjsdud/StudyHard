package kr.co.ezenac.ciriticalsection;

class Bank{
	private int money = 10000;
	
	
	public int getMoney() {
		return money;
	}


	public  void setMoney(int money) {
		this.money = money;
	}


	public synchronized void saveMoney(int save) {		// 입금
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m+save);
	}
	public synchronized void minusMoney(int minus) {		// 출금
		int m =this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(money<minus) {
			System.out.println("잔액 부족");
			return;
		}
		else {
		setMoney(m-minus);
		}
	}
}

// PersonA - 3000 저장하는 스레드
class PersonA extends Thread{
	
	@Override
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : "+SyncMain.myBank.getMoney());
	}
}

// PersonB - 1000원 소비하는 스레드 
class PersonB extends Thread{
	
	@Override
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000): "+SyncMain.myBank.getMoney());
		
	}
}

public class SyncMain {
	
	
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		PersonA pA = new PersonA();
		pA.start();	// 9000 동기화 처리 안됨.
		
		Thread.sleep(200);
		
		PersonB pB = new PersonB();
		pB.start();	// 13000
		
	}

}
