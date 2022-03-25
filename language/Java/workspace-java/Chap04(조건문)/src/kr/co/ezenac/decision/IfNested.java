package kr.co.ezenac.decision;

import java.util.Scanner;

/*
 * 	성별 (1은 남자 2은 여자)
 * 	나이, 신체등급 순으로 입력 받아서
 *  ==> 신체등급 1~3 : 현역
 *  	신체등급 4 : 공익
 *  	그외 :면제가 출력되는 프로그램을 작성하시오.
 *   
 * 	여자 일때에는 추가적인 정보 입력 대신 "여성에게는 국방의무가 없습니다."가 출력되게 작성하시오.
 * 	남자이지만 미성년자일 경우 추가적인 정보 입력 대신 "미성년자에게는 아직 신체등급이 부여되지 않습니다." ~~
 * 
 * 
 */
public class IfNested {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("성별을 입력해주세요 ( 1은 남자 2은 여자) : ");
		int grade=0;
		int gender =sc.nextInt();
		if(gender==1) {
			// 남자이므로 나이를 입력 받는다.
			System.out.print("나이를 입력해주세요 : ");
			int age=sc.nextInt();
			if(age>=19) {
				System.out.print("등급을 입력해주세요 : ");
				 grade =sc.nextInt();
				 if(grade<4) {
					 System.out.println("현역");
				 }
				 else if(grade==4) {
					 System.out.println("공익");
				 }
				 else {
					 System.out.println("면제");
				 }
			}
			else {
				System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
			}
		}
		else {
			System.out.println("여성에게는 국방의무가 없습니다.");
		}		
	
		sc.close();
		
		
		
	}
}






























