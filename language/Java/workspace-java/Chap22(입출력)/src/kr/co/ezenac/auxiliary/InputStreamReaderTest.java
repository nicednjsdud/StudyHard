package kr.co.ezenac.auxiliary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader isr =new InputStreamReader
								(new FileInputStream("reader.txt"))){
			
			int i;
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
				// 안녕하세요 여러분들. abc
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
