package kr.co.ezenac.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		 
		try(FileInputStream fis=new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read()) != -1) {
			System.out.print((char)i);	//마지막까지 출력
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("end");
	}

}
