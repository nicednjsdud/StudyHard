package kr.co.ezenac.constructor;

/*
 *  A클래스는 아무런 생성자가 존재하지 않으면,
 *  컴파일시에 컴파일러가 자동으로 기본생성자를 추가해줌.
 */
class A{
	int value;
}

class B{
	int value;
	
//	public B() {}
	public B(int value) {
		this.value=value;
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
		A a= new A();
		
		B b= new B(20);
		System.out.println(a);
		System.out.println(b);
	}

}
