package kr.co.ezenac.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//byte[] 배열에 A-Z까지 넣고 배열을 한꺼번에 파일에 쓰기
public class FileOutputStreamTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		
		try(fos){
			byte[] bs = new byte[26];
			byte data = 65;				// 'A'의 아스키 값
			for(int i=0;i<bs.length;i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);	// 배열 한꺼번에 출력하기
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}	

}
