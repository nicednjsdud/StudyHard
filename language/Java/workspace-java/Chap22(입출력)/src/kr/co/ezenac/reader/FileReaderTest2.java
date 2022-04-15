package kr.co.ezenac.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {

		try (FileReader fis=new FileReader("reader.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}

}
