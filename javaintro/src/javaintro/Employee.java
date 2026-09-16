package javaintro;

public class Employee {
	static String companyname;
	int Employeeid;
	String Employeename;
	int salary;
	public static void main(String[] args) {
		companyname="wipro";
		System.out.println("companyname:"+companyname);
		Employee emp1 = new Employee();
		emp1.Employeeid=1;
		emp1.Employeename="usha";
		emp1.salary=50000;
		System.out.println("Employeeid:"+emp1.Employeeid);
		System.out.println("Employeename:"+emp1.Employeename);
		System.out.println("salary:"+emp1.salary);
	}
}
