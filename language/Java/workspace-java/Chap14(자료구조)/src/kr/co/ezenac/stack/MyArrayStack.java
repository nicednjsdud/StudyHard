package kr.co.ezenac.stack;

import kr.co.ezenac.array.MyArrayList;

public class MyArrayStack {
	
	int top;
	MyArrayList arrayList;
	
	public MyArrayStack() {
		top=0;
		arrayList=new MyArrayList();
	}
	public MyArrayStack(int size) {
		arrayList=new MyArrayList(size);
	}
	
	public void push(int data) {					//push()
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
			arrayList.addElement(data);
			top++;
	}
		
	public boolean isFull() {						//isFull()
		if(top== arrayList.ARRAY_SIZE) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void printAll() {
		arrayList.printAll();
	}
	public int pop() {
		if(top==0) {
			System.out.println("stack is empty");
			return arrayList.ERROR_NUM;
		}
		return arrayList.removeElement(top-1);
	}
	public int getSize() {
		return top-1;
	}
}
