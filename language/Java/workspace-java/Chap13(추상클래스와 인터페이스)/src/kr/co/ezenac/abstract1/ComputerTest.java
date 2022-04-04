package kr.co.ezenac.abstract1;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new MyNoteBook();
		computer.display();
		computer.turnOn();
		
		NoteBook noteBook = new MyNoteBook();
		noteBook.typing();
	}

}
