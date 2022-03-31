package kr.co.ezenac.arraylist3;

import java.util.ArrayList;

public class Student {
	
	int StudnetID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studnetID, String studentName) {
		
		StudnetID = studnetID;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name,int scorePoint) {
		Subject subject =new Subject();
		subject.setName(name);
		subject.setScorePoint(scorePoint);
		subjectList.add(subject);
	}
	
	public void showInfo() {
		int total =0;
		for(Subject s: subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " +studentName+"의 " + s.getName() +"과목 성적은"
					+s.getScorePoint()+"입니다.");
			
		}
		System.out.println("학생 "+studentName+ " 의 총점은 "+total+"이다.");
	}
	
	
}













