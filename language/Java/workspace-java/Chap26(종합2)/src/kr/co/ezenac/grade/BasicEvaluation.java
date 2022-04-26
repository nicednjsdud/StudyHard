package kr.co.ezenac.grade;

public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		
		if(score<=100 || score>=90) {
			String str = "A";
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=55) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		return System.out.println(str);
		
	}

}
