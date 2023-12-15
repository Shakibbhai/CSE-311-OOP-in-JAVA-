import java.util.ArrayList;
public class university {

	ArrayList<person>persons;

 university(ArrayList<person> persons) {

    this.persons = persons;
  }
  
  public String fullnames() {
    String fullname="";

    
    for (int i = 0; i < persons.size(); i++) {

      if (i != persons.size() - 1)
        fullname = fullname + persons.get(i).getFullName() + ",";

      else
        fullname = fullname + persons.get(i).getFullName();
    }
    return fullname;
  }

  public person olderperson() {
    person older = persons.get(0);

    for (person per : persons) {
      if (per.getAge() > older.getAge()) {
        older = per;
      }
    }
    return older;

  }

  public person youngerperson() {
    person younger = persons.get(0);

    for (person per : persons) {
      if (per.getAge() < younger.getAge()) {
        younger = per;
      }
    }
    return younger;

  }

  public ArrayList<person> getvoters() {
    ArrayList<person>s1 = new ArrayList<>();

    for (person per : persons) {
      if (per.canVote()) {
        s1.add(per);
      }
    }

    return s1;

  }

  public int getNumberofemployee() {
    int count = 0;

    for (person per : persons) {
      if (per.getFullName().endsWith("(employee)")) {
        count++;
      }
    }
    return count;
  }

}
