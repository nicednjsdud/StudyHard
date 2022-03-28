package kr.co.ezenac.collabration2;

public class Taxi {
	private String taxiName;
	private int money;
	
	public Taxi(String taxiname) {
		this.taxiName=taxiname;
	}
	public void take(int money) {
		this.money +=money;
	}
	public void taxiInfo() {
		System.out.println(taxiName+" 운수택시 수입은"+money+"입니다.");
	}
	
	
	
	
}
