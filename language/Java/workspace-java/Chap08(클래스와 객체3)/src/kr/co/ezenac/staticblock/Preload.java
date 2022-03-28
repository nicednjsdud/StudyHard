package kr.co.ezenac.staticblock;

import java.util.Random;

public class Preload {
	static int num; 		//클래스 변수, 스태틱 멤버 변수, 전역 변수, 공유 변수
	
	// static 초기화 블록
	// main() 실행 전에 이미 난수값이 대입 됨.
	static {
		Random random=new Random();
		num = random.nextInt(100);			// 100을 매개변수로 넣어주면 0~99 사이에서 임의의 숫자 반환.
	}
	public static void main(String[] args) {
		System.out.println(num);
	}
}
