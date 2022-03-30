package kr.co.ezenac.array4;

public class ObjectArrayCopy2 {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("Go 프로그래밍 쿡북", "예런 토레스");
		book[1] = new Book("Go 프로그래밍 쿡북1", "예런 토레스1");
		book[2] = new Book("Go 프로그래밍 쿡북2", "예런 토레스2");
		book[3] = new Book("Go 프로그래밍 쿡북3", "예런 토레스3");
		book[4] = new Book("Go 프로그래밍 쿡북4", "예런 토레스4");
		
		copyBook[0]=new Book();
		copyBook[1]=new Book();
		copyBook[2]=new Book();
		copyBook[3]=new Book();
		copyBook[4]=new Book();
		
		for(int i=0;i<book.length;i++) {
			copyBook[i].setTitle(book[i].getTitle());
			copyBook[i].setAuthor(book[i].getAuthor());
		}
		
		
	
		copyBook[0].setTitle("데이터 플랫폼 설계와 구축");
		copyBook[0].setAuthor("다닐 즈부리브스키");
		
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
