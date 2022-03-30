package kr.co.ezenac.array3;

import java.util.Scanner;

/*
 *  반 수 입력 : 3
 *  
 *  1반의 인원 : 2
 *  1반의 1번의 점수 : 90 
 *  1반의 2번의 점수 : 100
 *  
 *  2반의 인원 : 3
 *  2반의 1번의 점수 : 80 
 *  2반의 2번의 점수 : 89
 *  2반의 3번의 점수 : 90
 *  
 *  2반의 인원 : 2
 *  3반의 1번의 점수 : 100 
 *  3반의 2번의 점수 : 80
 *  
 *  반		합계 	평균 
 *  -------------------
 *  1반		190		95.0
 *  2반
 *  3반				
 */ 
public class TwoDArray2 {

	public static void main(String[] args) {
		// 1. 입력
		Scanner sc= new Scanner(System.in);				//입력 스캐너
		System.out.print("반 수 입력 : ");
		int class1=sc.nextInt();						// 반 수
		int arr2[]=new int[class1];						// 반 인원 합 배열
		int arr[]=new int[class1];						// 반 인원 합 입력 받을 배열
		double arr3[]=new double[class1];				// 반 인원 평균 받을 배열
		int Totalcount=0;								// 총 인원 수
		// 2. 반 수
		for(int i=0;i<class1;i++) {
			int sum=0;									// 각반의 합								
			System.out.print(i+1+"반의 인원 : ");
			//2.1 반의 인원
			int people=sc.nextInt();					// 각반의 인원 수
			//2.2 반의 인원 수와 총합 
			for(int j=0;j<people;j++) {
				System.out.print((i+1)+" 반의 "+(j+1)+"번의 점수 :");
				arr2[j]=sc.nextInt();
				sum+=arr2[j];
				Totalcount++;
			}
			//2.3 배열의 담기
			arr[i]=sum;
			arr3[i]=(double)sum/people;
		}
		//2.4  총계
		int totalSum=0;
		double totalAvg=0.0;
		//3.1 출력
		System.out.println("반\t\t합계\t\t평균");
		System.out.println("--------------------------------------");
		for(int i=0;i<arr.length;i++) {
			totalSum+=arr[i];
			System.out.print(i+1+"반\t\t"+arr[i]+"\t\t");
			System.out.printf("%.1f\n",arr3[i]);
			
		}
		totalAvg=(double)totalSum/Totalcount;
		System.out.print("총계\t\t"+totalSum+"\t\t");
		System.out.printf("%.1f\n",totalAvg);
		System.out.println("--------------------------------------");
		sc.close();
	}

}
