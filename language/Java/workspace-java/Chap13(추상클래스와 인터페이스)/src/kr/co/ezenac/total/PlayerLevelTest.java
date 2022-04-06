package kr.co.ezenac.total;

public class PlayerLevelTest {

	public static void main(String[] args) {
		Player player = new Player();
		
		PlayerLevel beginnerLevel = new BeginnerLevel(); 
		beginnerLevel.go(player.getLevel());
		player.play(beginnerLevel.getLevel());
		
		PlayerLevel advancedLevel = new AdvancedLevel();
		advancedLevel.go(player.getLevel());
		player.play(advancedLevel.getLevel());
		
		PlayerLevel superLevel = new SuperLevel();
		superLevel.go(player.getLevel());
		
	}

}
