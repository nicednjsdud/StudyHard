package kr.co.ezenac.variable;

public class VarTest03 {

	public static void main(String[] args) {
		/*
		 *  메모리 2바이트 공간에 0000 0000 0100 0001 신호를 저장 
		 */
		
		char ch1 = 'A';		
		char ch2 = 65; 					// 10진수 값 할당		
		char ch3 = 0x41;				// 16진수 값 할당		
		char ch4 = 0b0000000001000001;	//  2진수 값 할당
		
		
		/*
		 * 	ch1 자료형이 char인 것을 확인해서 해당 값을 유니코드표에서 보고
		 * 	디코딩에서 'A'라고 보여줌.
		 */
		
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		
		char ch5 = '한';
		char ch6 = '\uD55C';			
		
		System.out.println(ch5);
		System.out.println(ch6);
		
		
		
		
		
	
		
		
	}

}
