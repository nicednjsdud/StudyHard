package kr.co.ezenac.constructor2;

public class Car {

	String color;				// 색상
	String gearType;			// 변속기
	int door;					// 차문
	
	public Car() {
		this.color = "노랑";
		this.gearType = "수동";
		this.door = 4;
	}
	@Override
	public String toString() {
		return this.color +", "
				+ this.gearType+", "
				+ this.door;
	}
	
}
