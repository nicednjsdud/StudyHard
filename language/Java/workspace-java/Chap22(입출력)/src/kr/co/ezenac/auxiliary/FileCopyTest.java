package kr.co.ezenac.auxiliary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		
		long milisecond = 0;
		try(FileInputStream fis = new FileInputStream("mybatis-3.5.9.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")){			
			milisecond = System.currentTimeMillis();			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			milisecond = System.currentTimeMillis() - milisecond;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 "+milisecond+ "milisecond 소요");
		// 파일 복사하는 데 17274milisecond 소요		
	}
}
