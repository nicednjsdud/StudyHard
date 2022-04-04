package kr.co.ezenac.polymorphism2;

/*
 *  instanceof 연산자의 결과가 true라는 것은
 *  실제 형변환이 가능하다는 것을 의미함.
 *  아울러 상속관계에 있는 것임.
 */
public class InstanceofTest {

	public static void main(String[] args) {
		
		SportCar sportCar = new SportCar();
		
		if(sportCar instanceof SportCar) {
			System.out.println("SportCar로 타입 변환이 가능하다.");
		}
		if(sportCar instanceof Car) {
			System.out.println("Car로 타입 변환이 가능하다.");
		}
		if(sportCar instanceof Object) {
			System.out.println("Object로 타입 변환이 가능하다.");
		}
	}

}
