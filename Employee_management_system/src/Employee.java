//import java.util.Arraylist;
abstract class Employee implements SalaryCalculator {
	private String name;
	private int id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	 public String getName() {
	        return name;
	    }

	   public int getId() {
	        return id;
	   }
	// Implementing methods from SalaryCalculator interface
	//public abstract double calculateSalary();
	 
	   public void displaySalary() {
			System.out.println("Salary is: "+calculateSalary());
		}
	public void diplayname() {
		// TODO Auto-generated method stub
		
	}
	   


}
