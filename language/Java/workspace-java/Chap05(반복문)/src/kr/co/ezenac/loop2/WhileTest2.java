package kr.co.ezenac.loop2;

import java.util.Scanner;

/*
 *  =====================
 *  1.증속   2.감속   3.중지
 *  =====================
 *  입력 : 1 
 *  
 *  현재 속도 : 1
 *  
 *  
 *  
 */
public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed=0;
		boolean run = true; 	//flag 변수
		while(run) {
			System.out.println("=====================");
			System.out.println("1.증속   2.감속   3.중지");
			System.out.println("=====================");
			System.out.print("입력 : ");
			int num =sc.nextInt();
			if(num==1) {
				speed++;
				System.out.println("현재 속도 : "+speed);
			}
			else if(num==2) {
				speed--;
				if(speed<0) {
					System.out.println("속도는 0 밑으로 내려갈수 없습니다.");
					speed++;
				}
				System.out.println("현재 속도 : "+speed);
				
			}
			else if(num==3) {
				
//				break;
				run=false;
			}
			else {
				System.out.println("잘못된 입력 값입니다.");
			}
			}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		}

	}


