package kr.co.ezenac.linkedlist;

public class MyListNode {
	
	private String data;				// 자료
	public MyListNode next;				// 다음 노드를 가리키는 링크
	
	public MyListNode() {				// 둘다 null 값
		data=null;
		next=null;
	}
	
	public MyListNode(String data) {	// 데이터는 o 다음노드링크는 null
		this.data=data;
		this.next=null;
	}
	public MyListNode(String data,MyListNode link) {	
		this.data=data;
		this.next=link;
	}
	
	public String getData() {
		return data;
	}
	
	
	
}
