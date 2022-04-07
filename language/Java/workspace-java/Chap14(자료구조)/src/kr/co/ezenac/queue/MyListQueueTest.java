package kr.co.ezenac.queue;

/*
 *  A
 *  B	add
 *  C
 *  A,B,C	-print
 */
public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue listQueue=new MyListQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.printAll();
//		listQueue.deQueue();
//		listQueue.deQueue();
		listQueue.printAll();
		listQueue.removeAll();
		listQueue.printAll();
	}

}
