package kr.co.ezenac.field;

public class FieldInitTest {
	
	public static void main(String[] args) {
		/*
		 *  fieldInit 라는 변수를 만드는데 변수의 자료형을 FieldInit이라는 클래스형으로 함.
		 *  FieldInit 클래스의 FieldInit() 생성자를 이용해서 new해서(새로 만들어서)
		 *  생성된 객체를 메모리에 적재하고 변수 fieldInit에 대입시킴.
		 */
		FieldInit fieldInit = new FieldInit();
		System.out.println(fieldInit);
		System.out.println(fieldInit.toString());
		
		System.out.println(fieldInit.byteField);
		System.out.println(fieldInit.booleanField);
		System.out.println(fieldInit.floatField);
		System.out.println(fieldInit.arrField);
		
	}
}
