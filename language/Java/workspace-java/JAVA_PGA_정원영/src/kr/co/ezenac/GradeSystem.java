package kr.co.ezenac;



import java.util.Scanner;

public class GradeSystem {
	private static Grade[] gradeArray = new Grade[5];
	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i=0;
		while(true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.print(">");
			
			int check =sc.nextInt();
			switch(check) {
			case 1 : 
				if(i>5) {
					System.out.println("더이상 입력하실 수 없습니다.");
					return;
				}
				insertInfo();
				i++;
				break;
			case 2 :
				if(i==0) {
					System.out.println("아직 입력된 정보가 없습니다.");
					
				}
				selectInfo();
				break;
			
			case 3 :
				endInfo();
				break;
			default :
				continue;
		}
		
		}
		
		
					
	}

	private static void endInfo() {
		System.out.println("사용해 주셔서 감사합니다.");
	}

	private static void selectInfo() {
		if(gradeArray== null) {
			System.out.println("아직 입력된 정보가 없습니다.");
			return;
		}
		for(int j=0;j<gradeArray.length;j++) {
			if(gradeArray !=null) {
				gradeArray[j].showInfo(j+1);
			}
			
		}
		System.out.println("----------------");	
	}

	private static void insertInfo() {
		System.out.print("번호: ");
		int number =sc.nextInt();
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("국어: ");
		int korCount=sc.nextInt();
		System.out.print("영어: ");
		int engCount=sc.nextInt();
		System.out.print("수학: ");
		int mathCount=sc.nextInt();
		
		Grade grade = new Grade(number, name, korCount, engCount, mathCount);
		for(int j=0;j<gradeArray.length;j++) {
			if(gradeArray[j]==null) {
				gradeArray[j]=grade;
				break;
			}
		
			
			
		}
	}
	
}

	


















