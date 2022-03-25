package kr.co.ezenac.overloading;

class Calc{
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a) {
		return a;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
}

public class OverloadingUse {

	public static void main(String[] args) {
		
		Calc clac=new Calc();
		int result = clac.add(3, 9);
		int result2 = clac.add(3);
		double result3 =clac.add(3.0, 9.0);
		
		System.out.println("result = " + result);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		
		
		
	}
}
