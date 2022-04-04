package kr.co.ezenac.polymorphism3;

public class Parent {
	int x =100;
	
	public void method() {
		System.out.println("조상 메서드 호출");
	}
	/*
	 *  매개변수의 타입이 Object라는 것은 (매개변수의 다형성이 적용됨)
	 *  => 어떠한 클래스도 다 받아주겠다는 것임. 
	 */
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;		//강제 타입캐스팅 (다운 캐스팅)
			System.out.println("조상클래스의 멤버 x값 : "+parent.x);
		}
		else {
			System.out.println("Parent타입의 객체가 아니다. 상속관계가 있지 않은 클래스임. ");
		}
	}
}
