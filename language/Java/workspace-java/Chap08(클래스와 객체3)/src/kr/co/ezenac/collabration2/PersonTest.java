package kr.co.ezenac.collabration2;

public class PersonTest {

	public static void main(String[] args) {
		Person person= new Person("이순신",20000);
		Taxi taxi= new Taxi("BoB");
		
		person.takeTaxi(taxi);
		person.PersonInfo();
		taxi.taxiInfo();
	}

}
