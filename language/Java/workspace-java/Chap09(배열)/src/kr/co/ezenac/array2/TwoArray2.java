package kr.co.ezenac.array2;

public class TwoArray2 {

	public static void main(String[] args) {
		int[][] score=new int[][] {
			{100, 70, 50},
			{ 70, 50, 30},
			{ 50, 80, 70},				//5명 학생의 국영수
			{ 55, 85, 77},
			{100, 80, 50}
		};
		int korTotal = 0;				// 국어 총점
		int engTotal = 0;				// 영어 총점
		int mathTotal =0;				// 수학 총점
		int totalSum = 0;				// 국영수 총합
		double totalAvg = 0.0;			// 개인별평균의 평균
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================");
		for(int i=0;i<score.length;i++) {
			int sum = 0;				// 개인별 총점
			double avg = 0.0;			// 개인별 평균
			
			korTotal+= score[i][0];
			engTotal+= score[i][1];
			mathTotal+= score[i][2];
			System.out.print(i+1);
//			System.out.printf("%3d",i+1);
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
				System.out.print("\t"+score[i][j]);
			}
			totalSum+=sum;
			avg=(double)sum/score[i].length;
			totalAvg+=avg;
			System.out.print("\t"+sum+"\t"+avg);
			System.out.println();
			
		}
		totalAvg=totalAvg/score.length;
		
		System.out.println("============================================");
		System.out.print("개인별 평균의 평균 : "+totalAvg+" 국영수 총합: "+totalSum+"\n");
		
	}

}
