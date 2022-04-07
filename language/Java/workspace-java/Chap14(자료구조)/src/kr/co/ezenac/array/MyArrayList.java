package kr.co.ezenac.array;

public class MyArrayList {
	
	int[] intArr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;
	
	public MyArrayList() {									// 생성자(배열사이즈 10)
		count =0;
		ARRAY_SIZE =10;
		intArr=new int[ARRAY_SIZE];
	}
	
	public MyArrayList(int size) {							// 생성자(배열사이즈 int)
		count = 0;
		ARRAY_SIZE=size;
		intArr = new int[ARRAY_SIZE];
	}
	
	public void addElement(int num) {						//추가메서드()
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num ;// 추가
	}
	public void insertElement(int position,int num) {		//삽입메서드()
		int i;
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		
		if(position<0 ||position> count) {
			System.out.println("insert error");
			return;
		}
		for(i=count-1;i>=position;i--) {
			intArr[i+1]=intArr[i];// 하나씩 이동		
		}
		intArr[position]=num;
		count++;
	}
	public int removeElement(int position) {				//삭제메서드()
		int ret = ERROR_NUM;
		if(isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		if(position <0 || position >=count) {
			System.out.println("remove Error");
			return ret;
		}
		ret = intArr[position];
		for(int i=position;i<count-1;i++) {
			intArr[i]=intArr[i+1];// 하나씩 이동
		}
		count--;
		return ret;
	}
	public boolean isEmpty() {						// list가 비어있는지 여부 메서드()
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printAll() {						// 전체 출력 메서드()
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다.");	
			return;
		}
		for(int i=0;i<count;i++) {
			System.out.println(intArr[i]);
		}
	}
	public int getElement(int position) {			// getElement()
		int ret = ERROR_NUM;
		if(isEmpty()) {
			System.out.println("There is no element");	
			return ret;
		}
		if(position <0 || position >count-1) {
			System.out.println("검색 위치 오류임. 현재 리스트의 개수는 "+count+"개 입니다.");
			return ret;
		}
		ret=intArr[position];
		return ret;
		}
}
	




















