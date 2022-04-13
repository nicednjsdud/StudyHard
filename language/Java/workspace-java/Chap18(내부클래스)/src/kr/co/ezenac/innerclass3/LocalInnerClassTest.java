package kr.co.ezenac.innerclass3;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(/*final*/ int i) {		// 지역 변수 - 메서드 호출후 끝날때까지 유효함
		/*final*/ int num = 100;				// 지역 변수 - 메서드 호출후 끝날때까지 유효함
		
		class MyRunnable implements Runnable{
			@Override
			public void run() {			// 내부 객체를 생성한 후 언제든 다시 호출 가능
//				num = 200;				// Err 이때 local변수는 유효하지 않은 상태
//				i = 10;					// Err 값 재할당 불가
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		}
		return new MyRunnable();
	}
}
public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(30);	// 로컬 변수는 호출후 유효하지 않게됨
		runnable.run();							
	}

}
