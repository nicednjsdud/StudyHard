package kr.co.ezenac.school;

import java.util.ArrayList;

import kr.co.ezenac.utils.Constant;

public class Subject {
	
	private int subjectId;			// 과목 고유번호
	private String subjectName;		// 과목 이름
	private int gradeType;			// 학점 부여 (과목 평가) 방식
	private ArrayList<Student> students = new ArrayList<>(); // 수강신청한 학생리스트
	
	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Constant.AB_TYPE;					// 학점 A ~ F;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void register(Student student) {
		students.add(student);
	}
	
}
