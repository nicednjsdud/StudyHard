package kr.co.ezenac.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		System.out.println(myList.toString()); // [A,B,C]
		
		myList.add(1, "D");
		System.out.println(myList); // [A,D,B,C]
		
		myList.removeLast();
		System.out.println(myList); // [A,D,B]
		
		for(int i=0;i<myList.size();i++) {
			String s = myList.get(i);
			System.out.print(s+" ");		// A,D,B
		}
		
	}

}
