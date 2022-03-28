package kr.co.ezenac.collabration2;

public class Person {
	private String personName;
	private int money;
	
	public Person(String personName,int money) {
		this.personName=personName;
		this.money=money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -=10000;
	}
	public void PersonInfo() {
		System.out.println(personName+"님의 남은 돈은"+money+"입니다.");
	}
}
