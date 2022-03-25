package kr.co.ezenac.variable;

/*
 * 	리터럴 (literal)
 * 		- 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함
 * 		- 정수 리터럴은 int로 저장
 * 			- int 범위를 벗어나는 long 경우는 접미사(식별자) L, l 을 써 줘야 한다.
 * 		- 실수 리터럴 double로 저장
 * 			- float로 사용하려는 경우 접미사(식별자) F, f 을 써 줘야 한다.
 */

public class VarTest02 {

	public static void main(String[] args) {
		
		long result = 10L;
		float result2 = 10.1F;
		double dou = 9.999;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(dou);
		
		double num1 = 1.0000001;
		System.out.println(num1);
		
		double num2 = 2.0000001;
		System.out.println(num2);
		
		double result4 = num1 + num2;
		System.out.println(result4);			//부동 소수점 값을 연산하면 약간의 오차 발생
												//애초에 근사치 값이기 때문에.
				
	}

}
