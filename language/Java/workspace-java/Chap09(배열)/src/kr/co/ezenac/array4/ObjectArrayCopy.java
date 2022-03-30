package kr.co.ezenac.array4;

public class ObjectArrayCopy {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("Go 프로그래밍 쿡북", "예런 토레스");
		book[1] = new Book("Go 프로그래밍 쿡북1", "예런 토레스1");
		book[2] = new Book("Go 프로그래밍 쿡북2", "예런 토레스2");
		book[3] = new Book("Go 프로그래밍 쿡북3", "예런 토레스3");
		book[4] = new Book("Go 프로그래밍 쿡북4", "예런 토레스4");
		
		
		System.arraycopy(book, 0, copyBook, 0, book.length);
		
		
		book[0].setTitle("데이터 플랫폼 설계와 구축");
		book[0].setAuthor("다닐 즈부리브스키");
		
		System.out.println("===========book===========");
		for(Book book1 : book) {
			book1.showInfo();
		}
		System.out.println("=========copyBook=========");
		for(Book copyBook1 : copyBook) {
			copyBook1.showInfo();
		}
	}

}
