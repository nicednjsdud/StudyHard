package kr.co.ezenac.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// 임시공간
		StringBuilder buffer = new StringBuilder("학교종이 땡땡땡")	;
		
		buffer.append(" 어서모이자.");			// 뒤에 붙이기
		System.out.println(buffer.toString());// 학교종이 땡떙땡 어서모이자
		
		buffer.append(12345);
		System.out.println(buffer.toString());// 학교종이 떙떙떙 어서모이자 12345
		
		buffer.delete(0, 4);				//삭제 0부터 4까지
		System.out.println(buffer.toString());//땡땡땡 어서모이자 12345
		
		buffer.replace(4, 8, "ABC"); 		// 4~7 까지 바꾸기
		buffer.reverse();					// 순서거꾸로
	}

}
