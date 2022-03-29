package kr.co.ezenac.singleton2;

import kr.co.ezenac.singleton.Company;

public class CarFactory {
	private CarFactory() {}
	private static CarFactory instance = new CarFactory();
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	public Car createCar() {
		Car car=new Car();
		return car;
	}
}
