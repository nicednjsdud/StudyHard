package kr.co.ezenac.inputstream;

import java.io.FileInputStream;

public class FileInputStream4 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			byte[] bs = new byte[10];
			while((i=fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.print((char)b);	//쓰레기 값까지 나옴
//				}
				for(int k=0;k<i;k++) {
					System.out.print((char)bs[k]);// 읽은 만큼만 출력
				}
				
				System.out.println();	
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
