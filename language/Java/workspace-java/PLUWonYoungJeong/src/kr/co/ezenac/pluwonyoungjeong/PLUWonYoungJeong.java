package kr.co.ezenac.pluwonyoungjeong;

import java.util.Scanner;

public class PLUWonYoungJeong {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();			//시작단
		int num2=sc.nextInt();			//마지막단
		int first_count=sc.nextInt();	//시작곱
		int last_count=sc.nextInt();	//마지막 곱
		sc.close();
		
		guguWonYoungJeong(num1,num2,first_count,last_count);
		System.out.println();
	}
	static void guguWonYoungJeong(int num1,int num2,int first_count, 
													int last_count) {
		int count=0;
		for(int i =num1;i<=num2;i++) {
			System.out.println(i);
			for(int j=first_count;j<=last_count;j++) {
				count= i*j;
				System.out.println(i+" X "+ j+" = "+count);
			}
		}
			
		
	}
	
}
