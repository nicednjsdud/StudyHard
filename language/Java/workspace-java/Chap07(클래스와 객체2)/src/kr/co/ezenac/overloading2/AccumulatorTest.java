package kr.co.ezenac.overloading2;
/*
 *  인스턴스(객체) : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
 *  참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
 *  참조 값  : 생성된 인스턴스의 메모리 주소 값
 *  
 */
public class AccumulatorTest {

	public static void main(String[] args) {
		
		Accumulator ac =new Accumulator();
//		System.out.println(ac);
		int iresult = ac.add(10, 50);
		System.out.println("iresult : "+iresult);
		
		long lresult = ac.add(100, 32424L);
		System.out.println("lresult : "+lresult);
		
		lresult = ac.add(1000L, 10);
		System.out.println("lresult : "+lresult);
		
		double dresult =ac.add(107.88, 11.55);
		System.out.println("dresult : "+dresult);
		
		iresult =ac.add(new A());
		System.out.println("iresult : "+iresult);
	}

}


























