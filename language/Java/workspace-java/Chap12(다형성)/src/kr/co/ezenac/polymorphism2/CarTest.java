package kr.co.ezenac.polymorphism2;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = null;
		SportCar sportCar=new SportCar();
		PoliceCar policeCar=new PoliceCar();
		
		sportCar.speedUp();	
		
		car = sportCar;				// 업캐스팅 (자손 -> 조상)
		
		SportCar sportCar2 = null;
		sportCar2 = (SportCar) car; // 다운캐스팅 (조상 -> 자손)
									// :조작할수 있는 멤버가 늘어남.
		sportCar2.speedUp();
		
		//sportCar = policeCar;
	}

}
