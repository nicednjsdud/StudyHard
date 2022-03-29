package kr.co.ezenac.array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// score는 참조변수
		int score[];
		score = new int[5];
		System.out.println("score의 주소값 : " +score);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] = "+ score[i]);
		}
		System.out.println();
		score[0] =100;
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] = "+ score[i]);
		}
		System.out.println();
		
		// 10 ~ 14 까지 할당하기
		int num=10;
		for(int i=0;i<score.length;i++) {
			score[i]=num;
			num++;
			System.out.println("score["+i+"] = "+ score[i]);
		}
		
	}

}
