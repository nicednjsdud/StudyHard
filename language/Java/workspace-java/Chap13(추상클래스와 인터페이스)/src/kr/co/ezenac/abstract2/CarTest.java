package kr.co.ezenac.abstract2;

public class CarTest {

	public static void main(String[] args) {
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
		System.out.println();
		
		Car SelfDrivingCar = new SelfDrivingCar();
		SelfDrivingCar.run();
	}

}
