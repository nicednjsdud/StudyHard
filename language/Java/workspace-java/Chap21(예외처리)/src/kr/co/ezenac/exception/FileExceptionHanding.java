package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHanding {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis =new FileInputStream("Hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		} finally {
			if(fis != null) {
				try {
					fis.close();			// 리소스 반납
				} catch (IOException e) {
					System.out.println(e);
				}
			}
					System.out.println("항상 수행 됩니다.");	// O
		}
		System.out.println("여기도 수행됩니다.");	// O
	}
}
