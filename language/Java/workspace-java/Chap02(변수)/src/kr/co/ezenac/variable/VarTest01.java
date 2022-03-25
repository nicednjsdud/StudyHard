package kr.co.ezenac.variable;

public class VarTest01 {

	public static void main(String[] args) {
		
		int num =10;						//10 진수 (Decimal)
		int bNum = 0B1010;					// 2 진수 (Binary)
		int oNum = 012;						// 8 진수 (Octal)
		int xNum = 0xA;						//16 진수 (Hexadecimal)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
		int year = 2022;
		int month = 3;
		
		System.out.println(year);
		System.out.println(year+month);
		
		String str =new String("자바");
		System.out.println(str);
		

	}

}
