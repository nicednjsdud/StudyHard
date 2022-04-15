package kr.co.ezenac.auxiliary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ // 직렬화하겠다는 의도 표시
	String name;		
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name +", "+job;
	}
}
public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person personLee = new Person("이순신", "프로그래머");
		Person personHa	= new Person("하륜", "영업사원");
		// 보내기
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personHa);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// 받기
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person person1 =(Person)ois.readObject();
			Person person2 =(Person)ois.readObject();
			
			System.out.println(person1);
			System.out.println(person2);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
