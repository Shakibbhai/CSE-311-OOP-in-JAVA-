package project_type_things;

public class Employee extends person {
	Employee(String firstName,String lastName,int age){
		
		super(firstName,lastName,age);
		}

	@Override
	public String getFullName() {
		return getFirstName()+" "+getLastName()+"(Employee)";
	}

}
