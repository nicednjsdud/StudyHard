package kr.co.ezenac.lambda5;

public class StringConcatTest {

	public static void main(String[] args) {
		// 일반 방식 
		StringConcat impl= new StringConcatImpl();
		impl.makeString("Hello", "Won!");
		
		// 람다식
		StringConcat concat =(s,v) -> System.out.println(s+","+v);
		concat.makeString("Hello!", "Won!");
		
		// 익명내부클래스에서 내부적으로 익명이 적용
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
			}
		};
		concat2.makeString("Hello", "Won!");
	}

}
