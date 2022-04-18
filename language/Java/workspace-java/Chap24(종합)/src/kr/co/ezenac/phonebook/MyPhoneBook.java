package kr.co.ezenac.phonebook;

public class MyPhoneBook {
	
	String name;
	String phoneNumber;
	String email;
	
	public MyPhoneBook(String name,String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	public MyPhoneBook(String name,String phoneNumber,String email) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	
	void showInfo() {
		System.out.println(name+", "+phoneNumber+", "+email);
	}
}
