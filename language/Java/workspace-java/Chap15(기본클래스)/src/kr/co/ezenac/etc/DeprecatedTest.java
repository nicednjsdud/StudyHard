package kr.co.ezenac.etc;

interface Unit{
	
	@Deprecated
	void move(String str);			// 판단하라
	void run(String str);
}

class Horse implements Unit{

	@Override
	public void move(String str) {	// 사용하는데 큰문제없음
		System.out.println(str);
	}

	@Override
	public void run(String str) {
		System.out.println(str);
	}
	
}
public class DeprecatedTest {

	public static void main(String[] args) {
		Unit unit =new Horse();
		unit.move("이동합니다."); 		// 취소선으로 표시됨
		unit.run("달립니다.");
	}

}
