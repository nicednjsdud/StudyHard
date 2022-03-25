package kr.co.ezenac.constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		//매개변수가 있는 생성자 호출
		Student student2 =new Student("이순신",30);
		Student student3 =new Student("이순신");
		Student student4 =new Student(30);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		
	}

}
