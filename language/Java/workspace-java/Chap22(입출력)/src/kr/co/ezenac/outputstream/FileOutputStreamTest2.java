package kr.co.ezenac.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//byte[] 배열의 특정 위치에서부터 정해진 길이만큼 쓰기
public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		try(FileOutputStream fos = new FileOutputStream("output3.txt")){
			byte[] bs = new byte[26];
			byte data = 65;				// 'A'의 아스키 값
			for(int i=0;i<bs.length;i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);	// 배열의 2번째 위치부터 10개 바이트 출력하기
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}	

}
