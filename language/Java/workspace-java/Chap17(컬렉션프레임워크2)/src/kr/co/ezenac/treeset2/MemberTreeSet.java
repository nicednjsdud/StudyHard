package kr.co.ezenac.treeset2;

import java.util.Iterator;
import java.util.TreeSet;

import kr.co.ezenac.treeset2.Member;

public class MemberTreeSet {
	
	private TreeSet<Member> treeset;
	public MemberTreeSet() {
		treeset = new TreeSet<>();			// 기본생성자에서 초기화
	}
	public void addMember(Member member) {		// 추가
		treeset.add(member);
	}
	public boolean removeMember(int memberId) {		// 삭제
		Iterator<Member> ir = treeset.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId()==memberId) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberId +"번호가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {				// 전체보기
		for(Member member: treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
