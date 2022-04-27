package kr.co.ezenac.grade;

public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;
		
		if(score>=70 && score<=100) {
			grade="p";
		}
		else {
			grade="F";
		}
		return grade;
	}

}
