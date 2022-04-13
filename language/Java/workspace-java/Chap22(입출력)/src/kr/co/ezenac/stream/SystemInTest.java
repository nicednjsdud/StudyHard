package kr.co.ezenac.stream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.print("알파벳 하나를 쓰고 [Enter]를 누르세요: ");
		
		int i;
		
		try {
			i = System.in.read();		// a
			System.out.println(i);		// 97
			System.out.println((char)i); // char형으로 변환 a
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
