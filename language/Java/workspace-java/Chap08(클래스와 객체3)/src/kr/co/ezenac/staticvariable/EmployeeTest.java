package kr.co.ezenac.staticvariable;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmployeeName("이순신");
		
		Employee employeeWang = new Employee();
		employeeWang.setEmployeeName("왕건");
		
		System.out.println(employee.getEmployeeName()+", "+employee.getEmployeeId());
		System.out.println(employeeWang.getEmployeeName()+", "+employeeWang.getEmployeeId());
		
		Employee.setSerialNum(2000);
		System.out.println(Employee.serialNum);
	}

}
