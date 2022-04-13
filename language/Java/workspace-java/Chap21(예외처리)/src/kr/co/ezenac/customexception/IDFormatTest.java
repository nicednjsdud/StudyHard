package kr.co.ezenac.customexception;

public class IDFormatTest {
	
	private String userId;
	
	
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) throws IDFormatException {
		
		if(userId == null) {
			throw new IDFormatException("아이디는 null 일수 없다.");
		}
		else if(userId.length()<8||userId.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.userId = userId;
	}
	public static void main(String[] args) {
		
		IDFormatTest idtest = new IDFormatTest();
		String myId = null;
		
		try {
			idtest.setUserId(myId);		// null
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		myId = "이순신";					// 8자 안됨
		try {
			idtest.setUserId(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}
