package kr.co.ezenac.string;

public class SubString {

	public static void main(String[] args) {
		String str1 = "AppleBananaOrange";
		int num1 = str1.indexOf("Banana");		//5
		int num2 = str1.indexOf("Orange");		//11
		
		String str2= str1.substring(num1,num2);	// 5 ~ 10
		System.out.println(str2); 				//Banana
		
		String str3 = str1.substring(num2);
		System.out.println(str3); 				// 11 ~
	}

}
