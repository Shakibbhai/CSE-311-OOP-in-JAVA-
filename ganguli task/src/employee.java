
public class employee extends person {

	  public employee(String firstName, String lastName, int age) {
	    super(firstName, lastName, age);
	  }

	  @Override
	  public String getFullName() {

	    return super.getFullName() + "(employee)";

	  }

	}
