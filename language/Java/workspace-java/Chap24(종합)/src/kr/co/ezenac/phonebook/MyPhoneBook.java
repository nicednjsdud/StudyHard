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
	
	public void showInfo() {
		System.out.println("Name : " + name);
		System.out.println("PhoneNumber : "+phoneNumber);
		if(email != null)
			System.out.println("Email : "+email);
	}
}
