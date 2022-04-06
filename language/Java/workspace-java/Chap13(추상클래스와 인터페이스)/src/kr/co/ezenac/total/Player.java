package kr.co.ezenac.total;

public class Player {
	
	 int level =1;
	 public Player() {
		this.level=level;
	}
		
	public int getLevel() {
		return level;
	}
	public void upgradeLevel() {
		level++;
	}
	public void play(int level) {
		upgradeLevel();
		getLevel();
	}
	
}
