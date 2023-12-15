package fruit_seller_project;

public class User {
 String firstName;
	String lastName;
		String phoneNumber;
	public User(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	

}
