package kr.co.ezenac.generic2;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();	//powder
		Powder powder = new Powder();		// 기본생성자 
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);	// 재료는 powder입니다.
		
//		GenericPrinter<Water> water = new GenericPrinter<>();	// 상속x 
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		Plastic plastic = new Plastic();	// 기본생성자
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter); // 재료는 plastic 입니다.
	}

}
