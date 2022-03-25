package kr.co.ezenac.operator2;

import java.util.Scanner;

/*
 *  입력 받은 두 수중에서 큰수를 출력하시오.
 *  
 *  입력 1 : 23
 *  입력 2 : 56
 *  56 삼항 연산자
 */
public class ConditonTest {
	public static void main(String[] args) {
		
		System.out.println("입력 받은 두 수중에서 큰수를 출력하시오.");
		Scanner scan = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1=scan.nextInt();
		System.out.print("입력2 : ");
		int num2=scan.nextInt();
		scan.close();
		int result = (num1>num2) ? num1 : num2 ;
		System.out.println( result );
		
		
		
		
	}
}
