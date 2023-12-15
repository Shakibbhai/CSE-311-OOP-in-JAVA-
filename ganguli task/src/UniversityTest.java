import java.util.ArrayList;

public class UniversityTest {
  public static void main(String[] args) {
    person person1 = new person("Nazmus", "shakib", 30);
    person person2 = new student("rakib", "hasan", 25);
    person person3 = new employee("imtiaz", "kabir", 35);

    ArrayList<person> p1= new ArrayList<>();
    p1.add(person1);
    p1.add(person2);
    p1.add(person3);

    university university = new university(p1);

    System.out.println("Full Names: " + university.fullnames());
    System.out.println("Oldest Person: " + university.olderperson().getFullName());
    System.out.println("Youngest Person: " + university.youngerperson().getFullName());
    ArrayList<person> voters = university.getvoters();
    System.out.println("Voters:");
    for (person voter : voters) {
        System.out.println(voter.getFullName());
    }
    System.out.println("Number of Employees: " + university.getNumberofemployee());
  }
}