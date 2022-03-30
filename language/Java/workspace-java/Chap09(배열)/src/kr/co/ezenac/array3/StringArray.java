package kr.co.ezenac.array3;

public class StringArray {

	public static void main(String[] args) {
		String str = new String("1차원 배열");
		System.out.println(str);
		System.out.println();
		
		String[] str2 = new String[] {
										"Ezen","이순신","류성룡"
									 };
		System.out.println("배열 str2의 주소 : "+str2.toString());
		System.out.println("str2[0] 배열 : "+str2[0]);
		
		for(String s:str2) {
			System.out.print(s+" ");
		}
	}

}
