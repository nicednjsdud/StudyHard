package kr.co.ezenac.array3;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] array = {
							{95, 86, 100, 55},
							{83, 92, 96},
							{78, 83, 93, 87, 88, 77, 10}
						};
		int sum = 0;
		double avg = 0.0;	
		int count = 0;
		
		for(int i=0; i<array.length;i++) {
			
			for(int j=0; j<array[i].length;j++) {
				sum+=array[i][j];
				count++;
			}
			avg=(double)sum/count;
			
			
		}
		System.out.println("위 가변배열의 합계(sum) : "+sum);
		System.out.printf("위 가변배열의 평균(avg) : %.1f",avg);
	}

}
