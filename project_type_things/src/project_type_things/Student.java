package project_type_things;

public class Student extends person {
	Student(String firstName,String lastName,int age){
	
	super(firstName,lastName,age);
	}
	@Override
	public String getFullName() {
		 return getLastName() + ", " + getFirstName();
	}
}
