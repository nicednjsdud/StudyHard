package kr.co.ezenac.overloading2;
class A{
	int data =10;
	int data2 =20;
}
public class Accumulator {
	
	public int add(int x,int y) {
		System.out.println("add(int x,int y)");
		return x + y;
	}
	public long add(int x, long y) {
		System.out.println("add(int x,long y)");
		return x + y;
	}
	
	public long add(long x, int y) {
		System.out.println("add(long x,int y)");
		return x + y;
	}
	
	public double add(double x,double y) {
		System.out.println("add(double x,double y)");
		return x + y;
	}
	//참조형 변수를 받아 오버로딩 하는 케이스
	public int add(A a) {
		System.out.println("add(A a)");
		return a.data + a.data2;
	}
	
}	
