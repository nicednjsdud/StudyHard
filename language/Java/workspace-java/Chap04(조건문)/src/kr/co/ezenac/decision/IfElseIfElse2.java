package kr.co.ezenac.decision;

import java.util.Scanner;

/*
 *  점수를 입력하세요 : 87
 *  
 *  점수가 80~89점 사이입니다.
 *  학점은 B입니다.
 *  
 *  90~100  A
 *  80~89   B
 * 	70~79	C
 * 	70미만	D
 */
public class IfElseIfElse2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		// score변수의 값에 따라서 조건문에서 분기가 일어남
		if(score>=90) {
			System.out.println("점수가 90점~100점 사이입니다.");
			System.out.println("학점은 A입니다.");
		}
		else if(score>=80) {
			System.out.println("점수가 80점~89점 사이입니다.");
			System.out.println("학점은 B입니다.");	
		}
		else if(score>=70) {
			System.out.println("점수가 70점~79점 사이입니다.");
			System.out.println("학점은 C입니다.");
		}
		else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("학점은 D입니다.");
		}
		sc.close();
		
		
		
	}

}
