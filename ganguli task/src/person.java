public class person {
  private String firstName;
  private String lastName;
  private int age;

  public person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean canVote() {
    return age >= 18;
  }

}