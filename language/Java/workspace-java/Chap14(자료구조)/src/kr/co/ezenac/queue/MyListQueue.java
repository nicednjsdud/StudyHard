package kr.co.ezenac.queue;

import kr.co.ezenac.linkedlist.MyLinkedList;
import kr.co.ezenac.linkedlist.MyListNode;

interface IQueue{
	void enQueue(String data);
	void deQueue();
	void printAll();
	
}

public class MyListQueue extends MyLinkedList implements IQueue {
	
	private MyListNode front;
	private MyListNode rear;
	private int tail;
	public MyListQueue() {
		front=null;
		rear=null;
		tail=0;
	}
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear= newNode;
		}
		else {								// 맨뒤에 들어가는 경우
			newNode = addElement(data);
			rear=newNode;
		}
		System.out.println(newNode.getData()+" 추가됨");
	}
	

	@Override
	public void deQueue() {
			if(isEmpty()) {
				return;
			}
			MyListNode tempNode=front;
			front = tempNode.next;
		}
	public void removeAll() {
		if(isEmpty()) {
			return;
		}
		MyListNode temp=front;
		temp=null;
	}
	

	@Override
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		MyListNode temp = front;
		while(temp!=null) {
			System.out.print(temp.getData() + ",");
			temp=temp.next;
		}
		System.out.println();
	}

}
