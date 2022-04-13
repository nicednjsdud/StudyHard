package kr.co.ezenac.throwsexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName,String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();		// loadClass에서 던짐
		try {
			test.loadClass("Hello.txt", "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
