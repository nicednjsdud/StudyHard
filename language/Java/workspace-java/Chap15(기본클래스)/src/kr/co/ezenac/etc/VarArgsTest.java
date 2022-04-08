package kr.co.ezenac.etc;

public class VarArgsTest {
	
	public static void helloEzen(String...args) {		// 가변인수 표시
		for(String str : args) {
			System.out.print(str +"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		helloEzen("이순신");		
		helloEzen("이도","이방원");				//중복가능
		helloEzen("이도","이방원","이순신");
	}

}
