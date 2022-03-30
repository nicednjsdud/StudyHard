package kr.co.ezenac.array2;

public class TwoDArray {

	public static void main(String[] args) {
		
		//[][]대괄호의 갯수가 곧 차원을 의미함.
		int[][] score = new int[][] {
			{100,100,100},
			{50 ,50 ,50 },
			{10 ,20 ,30 },
			{60 ,20 ,40 }
		};
		// 2차원 배열의 값 읽고 쓰기 위해서는 더블루프가 반드시 필요함
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("2차원 배열의 주소 : "+score);
		System.out.println("2차원 배열의 크기 : "+score.length);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("1차원 배열의 주소값 : "+score[i]);
			System.out.println("1차원 배열의 크기 : "+score[i].length);
		}
	}

}
