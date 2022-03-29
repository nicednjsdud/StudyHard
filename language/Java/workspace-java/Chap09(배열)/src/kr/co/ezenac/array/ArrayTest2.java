package kr.co.ezenac.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int sum =0;
		double avg =0.0;
		// 선언과 동시에 초기화
//		int[] score = {100, 200,300};
		int[] score = new int[] {100, 200, 300, 400, 500};
		
		System.out.println("배열의 크기 : "+ score.length);
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println("총점 :"+sum);
		
		avg= sum/score.length;
		System.out.println("평균 : "+avg);
	}

}
