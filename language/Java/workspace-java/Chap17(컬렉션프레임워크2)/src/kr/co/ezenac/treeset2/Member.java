package kr.co.ezenac.treeset2;

import java.util.Comparator;

public class Member implements Comparable<Member> {
	
	private int memberId;
	private String memberName;
	
	public Member() {};
	public Member(int memberId,String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName +"회원님의 아이디는"+memberId+"입니다.";
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode() 호출");
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return this.memberId==member.memberId;
		}
		return false;
	}
	@Override
	public int compareTo(Member member) {
		
		return this.memberName.compareTo(member.getMemberName());
	}
	
	/*
	 *  id로 정렬함 
	 *  양수면 오름차순 *(-1) 곱해주면 내림차순 정렬
	 *  
	 *  implements Comparator<Member>
	 */
//	@Override
//	public int compare(Member member1, Member member2) {
//		return (member1.memberId- member2.memberId);
//	}
}
