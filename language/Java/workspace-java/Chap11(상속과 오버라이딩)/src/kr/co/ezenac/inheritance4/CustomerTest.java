package kr.co.ezenac.inheritance4;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(202204);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println();
		
		VIPCustomer customerShin = new VIPCustomer(202205,"신사임당");
//		customerShin.setCustomerName("신사임당");
//		customerShin.setCustomerID(202205);
		customerShin.bonusPoint = 10000;
		
		System.out.println(customerShin.showCustomerInfo());
		
		
	}

}
