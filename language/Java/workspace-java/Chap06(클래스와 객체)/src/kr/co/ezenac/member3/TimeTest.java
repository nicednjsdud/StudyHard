package kr.co.ezenac.member3;

public class TimeTest {
	
	public static void main(String[] args) {
		
		Time t = new Time();
		
		System.out.println(t.getHour());
		System.out.println(t);
		
		t.setHour(1);
		System.out.println(t);
		t.setHour(11);
		System.out.println(t);
		t.setMinute(39);
		t.setSecond(111);
		System.out.println(t);
	}
}
