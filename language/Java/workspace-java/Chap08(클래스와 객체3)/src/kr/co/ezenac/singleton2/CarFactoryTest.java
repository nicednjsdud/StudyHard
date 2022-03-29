package kr.co.ezenac.singleton2;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car myPALISADE = factory.createCar();
		Car yourPALISADE = factory.createCar();
		
		System.out.println(myPALISADE.getCarNum());		//10001
		System.out.println(yourPALISADE.getCarNum());	//10002
	}

}
