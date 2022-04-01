package kr.co.ezenac.inheritance4;

// 이미 Customer에 구현된 내용이 Customer를 확장하여 구현함(상속)
public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio= 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	public VIPCustomer(int customerID,String customerName) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio= 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}

	public int getAgentID() {
		return agentID;
	}
	
	
}
