package kr.co.ezenac.loop;

public class ForTest3 {
	
	public static void main(String[] args) {
	
		// 1에서 100까지의 합중에 누적합계가 2000천 이상 일때 i 값을 출력하시오.
		int sum =0;
		int temp = 0;
		
		for(int i=1;i<=100;i++) {
			sum +=i;
			if(sum>=2000) {
				temp = i;
				break;
			}
			System.out.println("sum : "+sum);
		}
		System.out.println("누적합계가 2000이상 일때 i의 값 : "+temp);
		System.out.println("누적합계가 2000이상 일때 sum의 값 : "+sum);
	}
}






















