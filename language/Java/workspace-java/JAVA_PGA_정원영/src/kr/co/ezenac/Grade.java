package kr.co.ezenac;

public class Grade {
	int number;
	String name;
	int korCount;
	int engCount;
	int mathCount;
	int sum;
	double avg;
	public Grade(int number, String name, int korCount, int engCount, int mathCount) {
		this.number = number;
		this.name = name;
		this.korCount = korCount;
		this.engCount = engCount;
		this.mathCount = mathCount;
		
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorCount() {
		return korCount;
	}

	public void setKorCount(int korCount) {
		this.korCount = korCount;
	}

	public int getEngCount() {
		return engCount;
	}

	public void setEngCount(int engCount) {
		this.engCount = engCount;
	}

	public int getMathCount() {
		return mathCount;
	}

	public void setMathCount(int mathCount) {
		this.mathCount = mathCount;
	}

	public void showInfo(int i) {
		int sum=korCount+engCount+mathCount;
		double avg=sum/3;
		System.out.println("----------------");
		System.out.println("----"+i+"번 학생의 정보----");
		System.out.printf("번호: %03d번 이름: %s\n",number,name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korCount,engCount,mathCount);
		System.out.printf("총점: %03d점 평균: %06.2f점\n",sum,avg);
		
	}
}
