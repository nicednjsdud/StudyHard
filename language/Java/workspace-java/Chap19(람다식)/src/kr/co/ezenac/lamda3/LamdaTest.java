package kr.co.ezenac.lamda3;

public class LamdaTest {

	public static void main(String[] args) {
		MyInterface myInterface = null;
		
		myInterface = (x,y) -> {
			int result = x+y;
			return result;
		};
		int result = myInterface.method(30, 20);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값1 : "+result);  //50
		
		myInterface = (x,y) -> {return x+y;};
		result=myInterface.method(300, 300);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값2 : "+result);	// 600
		
		myInterface = (x,y) -> x + y;
		result=myInterface.method(1000, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값3 : "+result);	// 1200
		
	}

}
