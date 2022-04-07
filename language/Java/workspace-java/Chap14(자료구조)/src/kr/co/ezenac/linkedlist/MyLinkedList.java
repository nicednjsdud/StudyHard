package kr.co.ezenac.linkedlist;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {						// 추가()
		
		MyListNode newNode;
		if(head == null) {											// 맨 처음일때
			newNode=new MyListNode(data);
			head = newNode;
		}
		else {
			newNode=new MyListNode(data);
			MyListNode temp = head;
			while(temp.next!=null) {								// 맨 뒤로 가서 null인 노드
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		
		return newNode;
	}
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	public MyListNode insertElement(int position,String data) {		//중간에 노드가 추가되는 경우()
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);					//추가할 노드
		
		if(position<0 || position>count) {
			System.out.println("추가 할 위치 오류임. 현재 리스트의 개수는 "+count+"개 입니다.");
			return null;
		}
		if(position == 0) {
			newNode.next=head;
			head=newNode;
		}
		else {														//중간에 추가되는 경우
			MyListNode preNode=null;								//추가할려는곳 앞에노드
			for(i=0;i<position;i++) {
				preNode = tempNode;
				tempNode =tempNode.next;
			}
			newNode.next=preNode.next;
			preNode.next=newNode;
		}
		count++;
		return newNode;	
	}
	//preNode 찾아서삭제처리하면 된다.
	
	public MyListNode removeElement(int position) {					// 요소 삭제()
		int i;
		MyListNode tempNode=head;
		if(position<0 || position>count) {
			System.out.println("삭제 할 위치 오류임. 현재 리스트의 개수는 "+count+"개 입니다.");
			return null;
		}
		if(position==0) {											// 맨 앞에있는 경우의 삭제하는 케이스
			head = tempNode.next;
		}
		else {
			MyListNode preNode=null;
			for(i=0;i<position;i++) {
				preNode=tempNode;
				tempNode=tempNode.next;
			}
			preNode.next=tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		return tempNode;
	}
	
	public void printAll() {										// 전체 출력()
		if(count==0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.getData());
			temp=temp.next;
			if(temp!=null) {
				System.out.print(" -> ");
			}
		}
		System.out.println("");
	}
	
	public void removeAll() {										// 전체 삭제()
		head=null;
		count =0;
	}
	
	public int getSize() {											// size()
		return count;
	}
	public String getElement(int position) {
		int i;
		MyListNode tempNode = head;
		if(position>=count) {
			System.out.println("검색 위치 오류임. 현재리스크의 개수는"+count+"입니다.");
			return new String("error");
		}
		if(position ==0) {
			return head.getData();
		}
		for(i=0;i<position;i++) {
			tempNode=tempNode.next;
		}
		return tempNode.getData();
		
	}
}





















