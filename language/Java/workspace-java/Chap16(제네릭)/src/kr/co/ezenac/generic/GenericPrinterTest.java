package kr.co.ezenac.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // powder
		powderPrinter.setMaterial(new Powder());                       // 객체생성
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);	// 재료는 powder 입니다.
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();// plastic
		plasticPrinter.setMaterial(new Plastic());						// 객체생성
		Plastic plastic= plasticPrinter.getMaterial();			
		System.out.println(plastic);// 재료는 plastic 입니다.
		
	}

}
