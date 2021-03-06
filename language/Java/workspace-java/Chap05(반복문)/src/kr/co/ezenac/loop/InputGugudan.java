package kr.co.ezenac.loop;

import java.util.Scanner;

/*
 *  구구단을 출력합니다.
 *  몇단부터 출력할까요? : 3
 *  끝단은 얼마인가요? : 5
 *  =======3단===========
 *  3*1=3
 *  ~~
 *  3*9=27
 *  =======4단===========
 * 	4*1=4
 * 	~~
 * 	4*9=36
 * 	=======5단===========
 * 	 
 */
public class InputGugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 출력합니다.");
		System.out.print("몇단부터 출력할까요? : ");
		int num1 =sc.nextInt();
		System.out.print("끝단은 얼마인가요? : ");
		int num2 = sc.nextInt();
		sc.close();
		
		for(;num1<=num2;num1++) {
			System.out.println("============"+num1+"단==============");
			for(int i=1;i<10;i++) {
				System.out.println(num1+"*"+i+"="+(num1*i));
			}
		}
		
	}

}
