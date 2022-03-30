package kr.co.ezenac.array4;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int ball[] = new int [5];
		
		for(int i=0;i<ball.length;i++) {
			ball[i]=(int)(Math.random()*45)+1;
		}
		System.out.println("정렬 전");
		for(int b:ball) {
			System.out.print(b+" ");
		}
		
		//버블 정렬
		// 1차원 배열이라도 더블 루프가 필요하고 조건문이 하나 필요
		
		for(int i=0;i<ball.length;i++) {	
			for(int j=0;j<ball.length-1;j++) {
				int temp=0;
				if(ball[j]>ball[j+1]) {
					temp=ball[j];
					ball[j]=ball[j+1];
					ball[j+1]=temp;
				}
				else {
					continue;
				}
			}
		}
		System.out.println();
		System.out.println("정렬 후");
		for(int b:ball) {
			System.out.print(b+" ");
		}
		
	}

}
