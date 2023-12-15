
public class Developer extends Employee {
	private double hourlyRate;
	private int hoursWorked;
	public Developer(String name,int id,double hourlyRate,int hoursWorked){
		super(name,id);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public double calculateSalary() {
    	//base salary 300 for manager
    	return hourlyRate * hoursWorked;
    }
    public void display() {
    	System.out.println("Salary is: "+calculateSalary());
    }
    @Override
    public void diplayname() {
    	System.out.println("developer:");
    }

}
