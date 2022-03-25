package kr.co.ezenac.decision;

import java.util.Scanner;

/*
 *  검증(Validation)
 *  	- 사용자가 입력한 데이터가 올바른 값인지를 체크하여
 *  	  올바른 값일 경우에만 프로그램을 실행시키는 것.
 */

public class ValidationTest {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("점수 : ");
		int score=sc.nextInt();
		
		System.out.println("======= 1) 정확한 값 범위======");
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("B");
		}
		else if(score >= 70 && score < 80 ) {
			System.out.println("C");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("D");
		}
		else if(score>=0 && score <60){
			System.out.println("F");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
			
		System.out.println("======= 2) 입력값 범위 확인=====");
		
		if(score >=0 && score <=100) {
			if(score >=90) {
				System.out.println("A");
			}
			else if(score>=80) {
				System.out.println("B");
			}
			else if(score>=70) {
				System.out.println("C");
			}
			else if(score>=60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
		else {
			System.out.println("잘못입력하셨습니다2.");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
