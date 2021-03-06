package kr.co.ezenac.review;

public class Operator {

	public static void main(String[] args) {
				
		System.out.println(3 + 5);
		System.out.println("3" + "5");
		
		/*
		 *  문자열 + Any => 문자열
		 */
		System.out.println("3"+5);
		System.out.println(3+"5");
		
		System.out.println();
		
		// 참조형 변수
		String str1 = new String("abc");
		String str2 = "abc";
		String str3 = str2;
		
	
		System.out.println("str1의 현재값 : "+"["+str1+"]");
		System.out.println("str2의 현재값 : "+"["+str2+"]");
		System.out.println("str3의 현재값 : "+"["+str3+"]");
		
		// 비교연산자 == 
		/*
		 *  비교연산자를 이용하여 참조형 변수들을 비교하는 경우
		 *  => 실제 값 비교가 아닌 그 변수에 저장된 주소값 비교 
		 */
		System.out.println("str1 == str2 : "+(str1==str2));
		System.out.println("str1 == str3 : "+(str1==str3));
		System.out.println("str2 == str3 : "+(str2==str3));
		
		/*
		 *  참조형 변수 즉 객체를 비교할 때에는
		 *  해장 객체의 equals() 메서드를 사용해서 비교해야 함
		 *  
		 * 			객체.equals(비교대상)
		 */
		
		System.out.println("str1.equals(str2): " + (str1.equals(str2)));
		System.out.println("str2.equals(str3): " + (str2.equals(str3)));
		System.out.println("str1.equals(str3): " + (str1.equals(str3)));
		
	}

}
