
public class main {
	 public static void main(String[] args) {
		 EmployeeManagementSystem ems = new EmployeeManagementSystem(); 
	 
	 Manager m1=new Manager("Nazmus shakib",23,2000);
	 Developer d1=new Developer("adnan",1,1000,5);
	 Manager m2=new Manager("mun",21,3000);
	 
	 ems.addEmployee(m1);
	 ems.addEmployee(d1);
	 ems.addEmployee(m2);
	 
	 ems.displayAllemployees();
	 ems.calculateTotalsalary();
	 }
}
