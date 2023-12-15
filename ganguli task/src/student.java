
public class student extends person {

	  public student(String firstName, String lastName, int age) {
	    super(firstName, lastName, age);

	  }

	  public String getFullName() {
	    String[] arr = super.getFullName().split(" ");

	    return arr[1] + "," + arr[0];
	  }

	}
