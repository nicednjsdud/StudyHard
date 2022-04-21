package kr.co.ezenac.phonebook;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBookTest {
		
	
	static Scanner scanner = new Scanner(System.in);
	static Map<String, MyPhoneBook> map = new HashMap<>();
	

	
	public static void main(String[] args) {
		
		readInfo();
		
		int choice;
		while(true) {
			showMenu();
			choice = scanner.nextInt();
			scanner.nextLine(); 	// 숫자를 입력하고 enter을 입력하기 때문에, 이 처리를 위함.
			
			switch(choice) {
			case 1:
				addNumber();
				break;
			case 2:
				selNumber();
				break;
			case 3:
				delNumber();
				break;
			case 4:
				saveInfo();
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력했습니다.");
				break;
			}
			
				
		}
	}
	
	public static void readInfo() {
		try( ObjectInputStream ois=		// 파일에서 객체를 읽어들림
				new ObjectInputStream(new FileInputStream("Object.bin"))){
	
			while(true) {
				MyPhoneBook myPhoneBook =(MyPhoneBook)ois.readObject();
				
				if(myPhoneBook==null) {
					return;
				}	
				map.put(myPhoneBook.name, myPhoneBook);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}



	public static void saveInfo() {
		try(ObjectOutputStream oos = // 해시맵에 있는 정보를 파일을 만들고 파일에 저장
				new ObjectOutputStream(new FileOutputStream("Object.bin"))){
			// 해시맵에 있는 키 값을 가져옴.
			Set<String> ks = map.keySet();
			
			for(String s : ks) {
				// 키값 이용해서 모드 해시에 저장된 값들을 가져옴
				MyPhoneBook myphonebook = map.get(s);
				oos.writeObject(myphonebook); // 가져온 myphonebook 객체를 파일에 저장
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}




	public static void delNumber() {
		System.out.println("조회할 이름 : ");
		String name = scanner.nextLine();
		MyPhoneBook myPhoneBook = map.remove(name);
		
		if(myPhoneBook !=null) {
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("해당 값이 없습니다.");
		}
	}




	public static void selNumber() {
		System.out.print("조회할 이름 : ");
		String name =scanner.nextLine();
		
		MyPhoneBook myphonebook =map.get(name);
		if(myphonebook == null) {
			System.out.println("해당 값이 없습니다.");
		}
		else {
			myphonebook.showInfo();
		}
		
	}




	public static void addNumber() {
		// 전화번호 정보 입력 받기
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("전화 번호 : ");
		String phoneNumber = scanner.nextLine();
		System.out.print("이메일 : ");
		String email = scanner.nextLine();
		
		MyPhoneBook myPhoneBook;
		if(email !=null) {
			myPhoneBook = new MyPhoneBook(name, phoneNumber);
		}
		else {
			myPhoneBook = new MyPhoneBook(name, phoneNumber, email);
		}
		myPhoneBook.showInfo();
		
		map.put(name, myPhoneBook);
		System.out.println("맵의 크기 : "+map.size());
	}




	public static void showMenu() {
		System.out.println("[메뉴 선택]");
		System.out.println("1. 전화번호 입력");
		System.out.println("2. 전화번호 조회");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
	}
	
	
}
