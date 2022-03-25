package kr.co.ezenac.member3;

/*
 *  1. 사용자 정의 클래스 (User Define Class)
 *  	- 서로 의미가 있으며, 관련된 데이터라면 묶어서 하나의 타입으로 정의할 수 있음.
 *  
 *  2. this의 사용
 *  	- 유사한 의미로 사용되는 변수마다 이름을 가각 정의하는 것은 생각보다 쉽지 않음.
 *  	- 그래서 같은 이름을 사용하는데 멤버변수임을 구분해주는데 this를 사용함.
 *  
 *  3. 클래스 코딩
 *  	- 클래스는 대문자로 시작함
 *  	- java 파일 하나에 클래스는 여러 개가 있을 수 있지만, public 클래스는 하나이고, public 클래스와 .java 파일의 이름은 동일함.
 */
public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	/*
	 *  getter() : 멤버변수의 값을 읽어가는 메서드
	 *  setter() : 멤버변수의 값을 수정하는 메서드
	 */
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		//시에 대한 예외처리 코드를 작성
		if(hour<0 || hour>23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;				//exit
		}
		this.hour=hour;	
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute >59) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.minute=minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0 || second >59) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.second=second;
	}
	
	@Override
	public String toString() {
		
		return this.getHour() + "시"+
				this.getMinute()+"분"+
				this.getSecond()+"초";
	}
	
	
	
	
	
	
}
