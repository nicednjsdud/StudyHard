package kr.co.ezenac.list;

import java.util.ArrayList;

class MyStack{
	//ArrayList로 stack구현
	private ArrayList<String> arrayStack = new ArrayList<>();	
	
	public void push(String data) {
		arrayStack.add(data);
	}
	// 후입선출
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len-1);		// 0부터 시작하니 -1해줌
	}
}
public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		String remove=stack.pop();
		System.out.println(remove);
	}
}
