package kr.co.ezenac.collabration;

public class Subway {
	private int lineNumber;
	private int passengerCount;
	private int money;
	
	public Subway(int lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	public void subwayInfo() {
		System.out.println(lineNumber + "호선 지하철의 승객은 "+
					passengerCount+"명이고, 수입은"+money+" 원 입니다.");
	}
}
