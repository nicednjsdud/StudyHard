package kr.co.ezenac.set2;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet=new HashSet<Member>();	// 기본생성자에서 초기화
	}
	public void addMember(Member member){				//추가
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {			// 삭제
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			if(member.getMemberId()==memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+" 번호가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {				// 전체보기
		for(Member member: hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
