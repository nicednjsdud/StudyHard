package kr.co.ezenac.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPhoneBookTest {
	
	static Scanner scanner = new Scanner(System.in);
	static Map<String, MyPhoneBook> map = new HashMap<>();
	

	
	public static void main(String[] args) {
		
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
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력했습니다.");
				break;
			}
			
				
		}
	}




	private static void delNumber() {
	}




	private static void selNumber() {
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
