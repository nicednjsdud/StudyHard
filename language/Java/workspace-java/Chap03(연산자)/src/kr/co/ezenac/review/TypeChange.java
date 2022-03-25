package kr.co.ezenac.review;

public class TypeChange {

	public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		int num1 = 2147483647;
//		int num2 = 2147483648;		//에러발생
//		long num3 = 2147483648;		//에러발생
		long num4 = 2147483648L;
		
//		 float num5 =1.0;			//에러발생
		float num6 = 1.0F;
		double num7 = 30;			// int => double 자동 형변환

	}

}
