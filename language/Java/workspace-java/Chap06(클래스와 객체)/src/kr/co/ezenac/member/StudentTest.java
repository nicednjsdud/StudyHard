package kr.co.ezenac.member;

public class StudentTest {

	public static void main(String[] args) {
		
		// 각각 독립된 저장공간을 가지는 인스턴스(객체)가 힙에 할당됨.
		// gc(garbage collector)가 쓰레기 객체를 수집하여 소멸시킴.
		Student student =new Student();
		Student student2 = new Student();
		
		student.age=10;
		student.name="김순신";
		
		// student의 주소를 student2에다가 대입
		student2 = student;
		
		
		System.out.println(student);
		System.out.println(student2);
				
	}

}
