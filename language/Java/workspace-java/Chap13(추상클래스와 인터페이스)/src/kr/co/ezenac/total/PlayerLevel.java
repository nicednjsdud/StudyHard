package kr.co.ezenac.total;

/*
 *  - Player라는 클래스가 있고 Player는 PlayerLevel 속성을 가짐
 *  - 각 게임레벨 단계마다 jump(), run(), turn() 세가지 기능이 업그레이드됨
 *  - Player는 한번에 하나의 레벨 상태만 가질수 있습니다.
 *  - Player는 play()중에 레벨에 있는 go()라는 메서드를 호출하면 run()하고
 *    count횟수만큼 jump()하고 turn 메서드 호출한다. 
 *    
 *  <출력예시>
 *  *******************초보자 레벨*********************
 *  천천히 달립니다.
 *  jump 못합니다. 
 *  turn못합니다.
 *  *******************중급자 레벨*********************
	빨리 달립니다. 
	높이 jump 합니다.
	높이 jump 합니다. 
	turn못합니다.
 *  *******************상급자 레벨*********************
 *  엄청 달립니다.
 *  아주높이 jump 점프합니다.
 *  아주높이 jump 점프합니다.
 *  아주높이 jump 점프합니다. 
 *  turn합니다.

 */

public abstract class PlayerLevel extends Player{
	
	
	public abstract void jump();
	public abstract void run();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	public final void go(int level) {
		play(level);
		showLevelMessage();
		run();
		if(level==1) {
			jump();
		}
		else if(level==2) {
			jump();
			jump();
		}
		else if(level==3) {
			jump();
			jump();
			jump();
		}
		turn();
	}
}
