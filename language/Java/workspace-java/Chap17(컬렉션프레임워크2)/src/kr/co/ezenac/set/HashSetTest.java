package kr.co.ezenac.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("이순신");
		set.add("하륜");
		set.add("이방원");
		set.add("이순신");		// 중복 x 체크
		System.out.println(set); // [이순신, 하륜, 이방원]	
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str =ir.next();
			System.out.print(str+" "); // 이순신 하륜 이방원
		}
	}
}
