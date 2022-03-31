package kr.co.ezenac.arraylist2;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> bookstore = new ArrayList<>();
		
		bookstore.add(new Book("프로그래밍","이순신"));
		bookstore.add(new Book("나도 잘 할수있다", "애슐리"));
		bookstore.add(new Book("나도 잘 할수있다123", "애슐리12"));
		bookstore.add(new Book("프로그래밍", "에듀오닉스"));
		bookstore.add(new Book("헬스케어", "이순신2"));
		
		for(int i=0;i<bookstore.size();i++) {
			bookstore.get(i).showInfo();
		}
	}
}



