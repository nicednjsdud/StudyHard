package kr.co.ezenac.statictest;

public class MemberReferTest {
	int iv;
	static int cv;
	
	// 인스턴스 메서드가 호출될 때는 이미 인스턴스가 생성되어 있을 것임.
	public void instanceMethod() {
		
	}
	
	// 인스턴스가 언제 생성될지 아무도 모르기 때문에 
	// 정적 메서드내에서는 인스턴스 멤버들을 사용할 수 없다.
	public static void staticMethod() {
		
	}
}
