package kr.co.ezenac.decision3;

/*
 *  변수의 사용 범위 (구분)
 *  	- 작은쪽에서 큰쪽의 변수는 사용이가능, 반대로는 안됨.
 */
public class MethodTest {
	// 클래스 멤버변수
	static int temp;
	String name;
	Long balance;
/*
 * 	메서드 선언부
 * 	메서드 구현부(정의부) 
 */
	public static int add(int num1,int num2) {		//매개 변수
		
		System.out.println("add 메서드 호출됨");
		num1=20;
		return num1+num2;
	}
	
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 30;
		
		//call by value ( 값에 의한 복사 )
		int result = add(num1,num2);
		System.out.println("num1 + num2 : "+result);
		
		
		
	}
}
