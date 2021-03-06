package kr.co.ezenac.review;

/*
 *  	1. 자바 콘솔화면에 출력하는 3가지 메서드
 *  	(System.out에 있는 3가지 메서드)
 *  		1) print() : ()괄호안의 내용을 그대로 출력하고, 오른쪽 칸부터 출력한다.
 *  		2) println() : print a line, ()괄호안의 내용을 그대로 출력하고, 그 다음의 출력할 내용이 있으면 다음줄 첫번째 칸부터 출력 시작함.
 *  		3) printf() : print in format, ()괄호안의 내용을 "형식"에 맞추어 출력하고, 그 다음의 출력할 내용이 있으면 출력된 내용의 오른쪽 칸부터 출력을 시작함 .
 *  
 *  	2. escape character
 *  		1) \n : 다음줄 문자, 이후의 출력 내용을 다음줄로 옮김
 *  		2) \t : 탭공백 문자, 탭 공백을 넣음
 *  		3) \" : 문자로써의 "을 의미하게 됨
 */


public class Printf {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("DEF");
		
		// 1) 다음줄 문자
		System.out.print(str1+"\n");
		System.out.print(str2+"\n");
		
		// 2) 탭공백 문자
		System.out.println(str1 + "\t"+ str2);
		
		// 3) \"
		System.out.println("\"");
		
		/*
		 *  printf(,)
		 */
		
		int number = 2800;
		System.out.println("======1. Decimal =======");
		// 10진법 정수를 그대로 출력해라.
		System.out.printf("[%d]\n",number);
		// 10진법 정수를 오른쪽 정렬 5자리로 출력하시오.
		System.out.printf("[%5d]\n",number);
		// 10진법 정수를 오른쪽 정렬 3자리로 출력하시오.
		// 출력해야할 내용이 지정된 자리수보다 많으면 자릿수 지정은 무시됨.		
		System.out.printf("[%3d]\n",number);
		
		// 10진법 정수를 왼쪽 정렬 5자리 출력하시오.
		System.out.printf("[%-5d]\n",number);
		// 10진법 정수를 왼쪽 정렬 5자리로 맞추고 왼쪽 공백은 0으로 채우시오.
		System.out.printf("[%05d]\n",number);
		
		System.out.println("======2. Hexadicimal =======");
		number = 1787;
		// 16진법 정수를 그대로 자릿수는 그대로, 알파벳은 소문자로 출력하시오.
		System.out.printf("[%x]\n",number);
		// 16진법 정수를 그대로 자릿수는 그대로, 알파벳은 대문자로 출력하시오.
		System.out.printf("[%X]\n",number);
		// 16진법 정수를 5자리로 오른쪽 정렬하고 알파벳은 대문자 출력하시오.
		System.out.printf("[%5X]\n",number);
		// 16진법 정수를 5자리로 왼쪽 정렬하고 알파벳은 소문자 출력하시오.
		System.out.printf("[%-5x]\n",number);
		// 16진법 정수를 5자리로 오른쪽 정렬하고 알파벳은 대문자로, 왼쪽 빈자리는 0으로 채워서 출력하시오.
		System.out.printf("[%05X]\n",number);
		
		System.out.println("======3. float =======");
		double d = 123.45;
		// 실수 그대로 출력하시오.
		System.out.printf("[%f]\n",d);
		// 실수를 15자리 오른쪽 정렬로 출력하시오.
		System.out.printf("[%15f]\n",d);
		// 실수를 15자리 오른쪽 정렬하고, 소수점은 1번째 자리까지 나오게 출력하시오.
		System.out.printf("[%15.1f]\n",d);
		// 실수를 15자리 왼쪽 정렬하고, 소수점은 3번째 자리까지 나오게 출력하시오.
		System.out.printf("[%-15.3f]\n",d);
		// 실수를 15자리 오른쪽 정렬하고, 왼쪽 빈자리는 0으로, 소수점은 3번째 자리까지 나오게 출력하시오.
		System.out.printf("[%015.3f]\n",d);
		System.out.println("======4. String =======");
		String str3=new String("abcDEF");
		// String을 그대로 출력하시오.
		System.out.printf("[%s]\n",str3);
		// String을 모두 대문자로 바꿔서 출력하시오.
		System.out.printf("[%S]\n",str3);

		
		//printf() 사용시 주의할점
		// 1) %문자와 넘겨받는 값의 종류가 다르면 에러가 발생함.
		//		System.out.printf("%d",3.4);
		
		// 2) 존재하지 않는 %문자를 사용하면 에러가 발생함.
		//	    System.out.printf("%z",3);
		
		// 3) %문자의 갯수보다 넘어오는 값의 개수가 많으면 문제없음.
		System.out.printf("%d %d",1,2,3,4);
		
		// 4) %문자의 갯수가 넘어오는 값의 갯수보다 많으면 문자게 발생함.
		//		System.out.printf("%d %d %d",1);
			

		

		
		
	}
}




























