package kr.co.ezenac.console;



public class Printf {
	public static void main(String[] args) {
		
		String name = "Adimral Yi";
		int age = 20;
		double height = 189.5;
		
		System.out.println(age);
		
		System.out.printf("%s의 나이는 %d이고, 키는 %f 입니다. \n",name,age,height);
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f 입니다.", name,age,height);
	}
}
