package kr.co.ezenac.array4;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] bookStore =new Book[5];
		
		bookStore[0] = new Book("Go 프로그래밍 쿡북", "예런 토레스");
		bookStore[1] = new Book("Go 프로그래밍 쿡북1", "예런 토레스1");
		bookStore[2] = new Book("Go 프로그래밍 쿡북2", "예런 토레스2");
		bookStore[3] = new Book("Go 프로그래밍 쿡북3", "예런 토레스3");
		bookStore[4] = new Book("Go 프로그래밍 쿡북4", "예런 토레스4");
		
		for(int i=0;i<bookStore.length;i++) {
			bookStore[i].showInfo();
		}

	}
}
