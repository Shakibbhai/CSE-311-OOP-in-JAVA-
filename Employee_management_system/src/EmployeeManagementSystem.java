import java.util.ArrayList;
public class EmployeeManagementSystem<yoo> {
 private ArrayList<Employee>yoo;
 public EmployeeManagementSystem() {
	 yoo=new ArrayList<>();
 }
 public void addEmployee(Employee new_employee) {
	 yoo.add(new_employee);
 }
 public void displayAllemployees() {
	 System.out.println("Employee Details:");
     System.out.println("------------------"); 
     for(Employee new_employee:yoo) {
    	 new_employee.diplayname();
    	System.out.println("Name: "+new_employee.getName());
    	System.out.println("ID: " + new_employee.getId());
    	new_employee.displaySalary();
    	
    	
    	System.out.println("------------------");
     }
    	
    	
     }
 public void calculateTotalsalary() {
	 double totalSalary=0;
	 for(Employee new_employee :yoo) {
		 totalSalary+=new_employee.calculateSalary();
		 
	 }
	 System.out.println("total salary is :" +totalSalary);
 }
     
 }

