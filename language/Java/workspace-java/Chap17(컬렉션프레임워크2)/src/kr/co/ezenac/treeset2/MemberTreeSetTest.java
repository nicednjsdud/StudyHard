package kr.co.ezenac.treeset2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001,"이방원");
		Member memberHa = new Member(1002,"하륜");
		Member memberSunk = new Member(1003, "이숙번");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberHa);
		memberTreeSet.addMember(memberSunk);
		memberTreeSet.showAllMember();
		
		memberTreeSet.removeMember(1000);
		memberTreeSet.removeMember(1001);
		memberTreeSet.showAllMember();
		
		Member memberHang =new Member(1003,"황희");
		memberTreeSet.addMember(memberHang);
		memberTreeSet.showAllMember();
	}

}
