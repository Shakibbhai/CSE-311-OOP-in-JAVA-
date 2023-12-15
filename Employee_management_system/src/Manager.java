public class Manager extends Employee{
	private double bonus;
public Manager(String name,int id,double bonus){
	super(name,id);
	this.bonus=bonus;
}
public double getBonus() {
    return bonus;
}
//@override
public double calculateSalary() {
	//base salary 3000 for manager
	return 3000+bonus;
}
public void diplayname() {
	System.out.println("manager:");
}

}
