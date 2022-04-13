package kr.co.ezenac.lamda2;

@FunctionalInterface
public interface MyInterface {
	void method(int x);
//	void method1();	// 추상메서드가 2개이상이면 컴파일 예외 발생시킴.
}
