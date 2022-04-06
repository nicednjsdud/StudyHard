package kr.co.ezenac.totalex;


public abstract class PlayerLevel {
	
	public abstract void jump();
	public abstract void run();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public final void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}
}
