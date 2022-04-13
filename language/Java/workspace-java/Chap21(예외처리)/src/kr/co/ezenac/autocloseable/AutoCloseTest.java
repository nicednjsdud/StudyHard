package kr.co.ezenac.autocloseable;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObject obj = new AutoCloseObject();
		
		try(AutoCloseObject obj2=obj){
			throw new Exception();	// 예외 강제 발생
		} catch (Exception e) {
			System.out.println(e);	// close 호출 O
		}
	}

}
