package kr.co.ezenac.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList list =new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		
		list.insertElement(3, "D");
		list.printAll();
		
		list.insertElement(0, "A-1");
		list.printAll();
		
		list.insertElement(2, "A-2");
		list.printAll();
		System.out.println("사이즈 : "+list.getSize());
		
		list.removeElement(0);
		list.printAll();
		
		list.removeElement(1);
		list.printAll();
		
		System.out.println(list.getElement(1));
		System.out.println(list.getElement(3));
//		list.removeAll();
//		list.printAll();
		
		
	}

	
	
}
