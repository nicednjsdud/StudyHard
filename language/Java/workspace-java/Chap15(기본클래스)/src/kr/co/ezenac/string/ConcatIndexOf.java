package kr.co.ezenac.string;

public class ConcatIndexOf {

	public static void main(String[] args) {
		//concat
		String str1 = "기초";
		String str2 = "프로그래밍";		// String끼리 합치기
		
		String str3=str1.concat(str2);	// 합한것을 str3에 할당
		System.out.println(str3);
		
		String str4 = "자바".concat(str3);// 문자열 리터럴과 String합치기
		System.out.println(str4);
		
		//IndexOf
		String str5 = "AppleBananaOrange";
		int num1 = str5.indexOf("a");		// "a"위치 반환
		int num2 = str5.indexOf("a", num1+1); // 찾을 문자열, 시작할 위치
		System.out.println(num2); 			
	}
}
