package kr.co.ezenac.phonebook;

public class MyPhoneBookTest {

	public static void main(String[] args) {
		
		MyPhoneBook myPhoneBook1 = new MyPhoneBook("이순신","010-1234-5678");
		myPhoneBook1.showInfo();
		
		MyPhoneBook myPhoneBook2 = new MyPhoneBook("이방원","010-2345-6789","Lee@naver.com");
		myPhoneBook2.showInfo();
	}

}
