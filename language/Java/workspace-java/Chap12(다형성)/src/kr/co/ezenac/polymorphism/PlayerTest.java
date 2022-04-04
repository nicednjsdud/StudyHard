package kr.co.ezenac.polymorphism;

public class PlayerTest {

	public static void main(String[] args) {
		// 다형성 미적용 코드
		Player player1 = new Player("이순신", 40, 20, 60);
		player1.info();
		
		System.out.println();
		
		// 다형성이 적용된 코드 (필드의 다형성)
		// 원래 타입은 그대로 유지.
		Player player2 = new Striker("이방원", 25, 10, 90, 50);
		Player player3 = new MidFielder("하륜", 18, 18, 80, 120);
		Player player4 = new Defender("이숙번", 28, 18, 60, 60);
		
		// 상속관계에 있다면 자손클래스에서 오버라이딩을 하게 되면
		// 현재 참조하고 있는 인스턴스의 메서드를 호출됨.
		player2.info();
		System.out.println();
		player3.info();
		System.out.println();
		player4.info();
	}

}
