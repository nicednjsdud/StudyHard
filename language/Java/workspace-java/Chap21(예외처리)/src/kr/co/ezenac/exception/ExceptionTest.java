package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("Hello.txt")){
			
		} catch (FileNotFoundException e) {
				System.out.println(e);
		} catch (IOException e) {
				System.out.println(e);  		// 자동 close()
		}
		System.out.println("여기도 수행 됩니다.");	// O
	}

}
