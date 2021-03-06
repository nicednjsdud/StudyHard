package kr.co.ezenac.total;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		
		while(true) {
			//메뉴 출력
			showMenu();
			char myChar = sc.next().charAt(0);
			if(!checkNum(myChar)) {							// 숫자인지 확인
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
			}
			
			/*
			 *  int 변수 =  문자 - 문자 
			 */
			int num = myChar -'0';
			System.out.println(num);
			
			if(num == 0) {
				break;
			}
			else {
				if(num>4) {
					System.out.println("메뉴를 잘못 선택했습니다.");
					continue;
				}
				// 더하기, 빼기, 곱하기, 나누기
				System.out.print("첫번째 숫자: ");
				int num1 = sc.nextInt();
				
				System.out.print("첫번째 숫자: ");
				int num2 = sc.nextInt();
				
				if(num == 1) {	addNum(num1,num2);}
				if(num == 2) { delNum(num1,num2);}
				if(num == 3) { mulNum(num1,num2);}
				if(num == 4) { divNum(num1,num2);}
			}
		}
		System.out.println("계산기를 종료합니다.");
		
		
		sc.close();
	}

	private static void divNum(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(num1+" / "+num2+" = "+result);
	}
	

	private static void mulNum(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(num1+" X "+num2+" = "+result);
	}

	private static void delNum(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+result);
	}

	public static void addNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1+" + "+ num2+" = "+result);
	}

	public static void showMenu() {
		
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("0.끝내기");
	}
	public static boolean checkNum(char ch) {
		
		// char형 데이터를 매개변수로 받아 숫자 0 ~ 9 사이의 값인지 확인 
		if(ch >= '0' && ch <= '9') {
			return true;				// 숫자
		}
		else {
			return false;
		}

	}

}
