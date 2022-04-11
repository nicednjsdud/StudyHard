package kr.co.ezenac.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("정도전");
		treeSet.add("최영");
		treeSet.add("이순신");
		
		for(String s : treeSet) {			// 오름차순
			System.out.println(s);			// 이순신, 정도전, 최영
		}
	}

}
