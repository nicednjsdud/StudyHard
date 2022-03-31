package kr.co.ezenac.inheritance;

public class MountainBike extends Bicycle{
	
	String frame;
	int gear;
	int price;
	
	public void print() {
		System.out.println("id : "+ this.id);
		System.out.println("brand : "+this.brand);
		System.out.println("frame : "+ this.frame);
		System.out.println("gear : "+ this.gear);
		System.out.println("price : "+ this.price);
		System.out.println("owner :"+this.owner);
	}

	public static void main(String[] args) {
		MountainBike mBike = new MountainBike();
		mBike.id = 824;
		mBike.brand = "LESPO";
		mBike.frame = "알루미늄";
		mBike.gear = 33;
		mBike.price= 300000;
		mBike.owner ="이순신";
		
		mBike.print();
		
	}
}
