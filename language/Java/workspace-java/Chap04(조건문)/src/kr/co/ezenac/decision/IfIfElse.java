package kr.co.ezenac.decision;

public class IfIfElse {

	public static void main(String[] args) {
		
		int score = 93;
		
		// 몇 수십개의 if문이 존재하더라도, 모든 if문을 참조함 => 비효율적 코드
		if(score > 90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("학점은 A학점입니다.");
		}
		
		if(score > 80) {
			System.out.println("점수가 80점보다 큽니다.");
		}
		
		if(score >92) {
			System.out.println("점수가 92보다 큽니다.");
		}
		System.out.println();
		
		/*
		 *  if ~else 구문은 50% 확률일때, 사용하는게 바람직함
		 *  else 구문 옆에는 조건문이 오면 안됨.
		 */
		if(score >90) {
			System.out.println("90점 이상입니다.");
		}
		else {
		System.out.println("90점 미만입니다.");
		}
		
	}

}
