package kr.co.ezenac.collabration;

public class TransTest {

	public static void main(String[] args) {
		
		Student studentJung=new Student("정도전",5000);
		Student studentGung=new Student("궁예",10000);
		
		Bus bus9802 = new Bus(9802);
		Subway subway9 = new Subway(9);
		
		studentJung.takeBus(bus9802);
		studentGung.takeSubway(subway9);
		
		studentJung.studentInfo();
		studentGung.studentInfo();
		
		bus9802.busInfo();
		subway9.subwayInfo();
		
		
		
	}

}
