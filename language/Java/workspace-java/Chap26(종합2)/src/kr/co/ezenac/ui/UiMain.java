package kr.co.ezenac.ui;

import org.graalvm.compiler.nodes.extended.GetClassNode;

import kr.co.ezenac.school.School;
import kr.co.ezenac.school.Score;
import kr.co.ezenac.school.Student;
import kr.co.ezenac.school.Subject;
import kr.co.ezenac.school.view.GradeReport;
import kr.co.ezenac.utils.Constant;

/*
 *  학점 부여 프로그램 정의
 *  1. EzenSchool 학교가 있습니다.
 *     이 학교에는 5명의 학생들이 있다. 
 *     과목은 국어와 수학이 있고, 각 학생은 두과목을 모두 수강한다.
 *     전공은 컴퓨터공학, 국어국문과 두가지가 있습니다.
 *     컴퓨터 공학과 학생은 수학이 필수과목이고, 국어국문과 학생은 국어가 필수 과목입니다.
 *     각 학생별로 한 개의 전공을 선택합니다.
 *     이번 학기 각 학생의 성적이 발표되었습니다.
 *     
 *     이름			학번		  전공		필수과목		국어점수		수학점수
 *     스티브잡스	  20000426	국어국문과		국어			 95			 56
 *     이순신		  20000427	컴퓨터공학과	수학			 95			 98
 *     리누스토발즈  20000428	국어국문과		국어			 100		 88
 *     제임스고슬링  20000429	국어국문과		국어			 89			 88
 *     이도		  20000430	컴퓨터공학과	수학			 83			 56
 *     
 *     학점을 부여하는 방식은 여러 가지가 있습니다.
 *     A,B,C,D,F를 부여하는 방식
 *     A+, B- 처럼 +/-를 사용하는 방식
 *     Pass/Fail만을 부여하는 방법 들이 있다.
 *     
 *     => 인터페이스 설계
 *     
 *     
 *     여기 각 학생에게 학점을 부여하는데 사용하는 정책은 두가지 입니다.
 *     일반과목이라면 A,B,C,D,F를 부여하는 방식으로,
 *     필수과목이라면 S,A,B,C,D,F를 부여하는 방식으로 분류합니다.
 *     점수에따른 학점 부여기준은 다음과 같습니다.
 *     
 *     필수과목 학점 기준
 *     S,		A,		B,		C,		D,		F
 *     -------------------------------------------
 *     95~100   90~94   80~89   70~79  60~69	60점미만
 *     
 *     일반과목 학점 기분
 *     A,		B,		C,		D,		F
 *     -----------------------------------------
 *     90~100  80~89    70~79	55~69	55점미만
 *     
 *     학점 결과가 나올수 있도록 구현하시오.
 *     학점의 정책이 추가되는 경우와 과목이 추과되는 경우를 고려하여 클래스를 설계하고
 *     학점 정책에 대해서는 인터페이스를 선언하고 각 정책이 해당 인터페이스를 구현하도록 하시오.
 *     
 *     국어 과목 결과 
 *     
 *     국어 강의 신청자 학점 >>
 *     이름		|  학번   | 		중점과목 		|	점수
 *     ===============================================
 *     스티브잡스	20000426	국어					95
 *     -----------------------------------------------
 *     스티브잡스	20000426	국어					95
 *     ------------------------------------------------
 *     스티브잡스	20000426	국어					95
 *     -----------------------------------------------
 *     스티브잡스	20000426	국어					95
 *     -----------------------------------------------
 *     스티브잡스	20000426	국어					95
 *     
 *     
 *     수학 과목 결과 
 *     
 */
public class UiMain {
	
	School bobSchool = School.getInstance(); 
	
	Subject korean;
	Subject math;
	
	GradeReport gradeReport = new GradeReport();
	
	public static void main(String[] args) {
		
		UiMain uimain = new UiMain();
		
		uimain.createSubject();
		uimain.createStudent();
			
	}

	public void createStudent() {
		Student student1 = new Student(20000426,"스티브잡스", korean);
		Student student2 = new Student(20000427,"이순신", math);
		Student student3 = new Student(20000428,"리누스토발즈", korean);
		Student student4 = new Student(20000429,"라이언고스링", korean);
		Student student5 = new Student(20000430,"이도", math);
		
		bobSchool.addStudent(student1);
		bobSchool.addStudent(student2);
		bobSchool.addStudent(student3);
		bobSchool.addStudent(student4);
		bobSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		addScoreForStudent(student1,korean, 95);
		addScoreForStudent(student1,math, 56);
		
		addScoreForStudent(student2,korean, 95);
		addScoreForStudent(student2,math, 98);
		
		addScoreForStudent(student3,korean, 100);
		addScoreForStudent(student3,math,88);

		addScoreForStudent(student4,korean, 89);
		addScoreForStudent(student4,math,95);

		addScoreForStudent(student5,korean, 83);
		addScoreForStudent(student5,math,56);
	}

	public void addScoreForStudent(Student student, Subject subject, int score) {
		Score score1 = new Score(student.getStudentId(), subject, score);
		student.addSubjectScore(score1);
	}

	public void createSubject() {
		korean = new Subject(Constant.KOREAN, "국어");
		math = new Subject(Constant.MATH,"수학");
		
		bobSchool.addSubject(korean);
		bobSchool.addSubject(math);
	}

}

































