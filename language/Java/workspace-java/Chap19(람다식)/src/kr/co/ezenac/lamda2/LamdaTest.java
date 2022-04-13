package kr.co.ezenac.lamda2;

public class LamdaTest {

	public static void main(String[] args) {
		MyInterface myInterface = null;
		myInterface = (x) -> {
			int result = x *10;
			System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 값 : "+result);
		};
		myInterface.method(10); //100
		
		myInterface = x -> System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 값 : "+(x*10));
		myInterface.method(100); // 1000
	}

}
