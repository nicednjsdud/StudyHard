package kr.co.ezenac.interface5;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		X xClass = myClass;
		xClass.x();
		
		Y yClass = myClass;
		yClass.y();
		
		MyClass mClass = myClass;
		mClass.x();
		mClass.y();
		mClass.myMethod();
		
	}

}
