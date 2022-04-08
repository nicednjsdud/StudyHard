package kr.co.ezenac.object;

class Book{
	String author;
	@Override
	public String toString() {
		return author.toString();
	}
}
public class ToStringTest extends Object{

	public static void main(String[] args) {
			
		String name = "이순신";
		System.out.println(name);
		System.out.println(name.toString());
		
		Book book =new Book();
		book.author="이도";
		System.out.println(book.author);
		System.out.println(book);			// 재정의 됨
	}

}
