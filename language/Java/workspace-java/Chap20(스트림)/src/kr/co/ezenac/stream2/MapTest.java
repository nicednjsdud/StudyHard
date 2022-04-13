package kr.co.ezenac.stream2;

import java.util.Arrays;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","orange");
		// 대문자로 변환
		list.stream()
			 .map(s -> s.toUpperCase())
			  .forEach(n -> System.out.print(n+"\t"));
	}

}
