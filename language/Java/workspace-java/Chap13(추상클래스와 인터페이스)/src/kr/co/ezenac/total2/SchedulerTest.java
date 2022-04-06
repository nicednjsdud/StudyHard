package kr.co.ezenac.total2;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담원 할당방식을 선택하세요.");
		System.out.println("R : 순서대로 배분하기");
		System.out.println("L : 짧은 대기열을 찾아 배분하기");
		System.out.println("P : 우선 순위에 따라 배분하기");
		
		int click = System.in.read();
		
		Scheduler scheduler =null;
		if(click=='R'||click=='r') {
			scheduler=new RoundRobin();
			
		}
		else if(click=='L'||click=='l') {
			scheduler= new LeastJob();
			
		}
		else if(click=='P'||click=='p') {
			scheduler=new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
