package kr.co.ezenac.reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee =new Student(2022, "이순신");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		
		Student studentShin = new Student(2021, "신사임당");
		studentShin.setKoreaSubject("국어", 99);
		studentShin.setMathSubject("수학", 98);
		
		studentLee.showStudentScore();
		studentShin.showStudentScore();
	}

}
