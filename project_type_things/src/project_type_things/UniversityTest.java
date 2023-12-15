package project_type_things;
import java.util.ArrayList;

public class UniversityTest {
    public static void main(String[] args) {
        ArrayList<person> persons = new ArrayList<>();
        persons.add(new person("kibria", "Hossain", 20));
        persons.add(new person("Nazmus", "Shakib", 25));
        persons.add(new Student("Mainuddin", "vai", 19));
        persons.add(new Employee("Imtiaz", "Kabir", 10));

        University university = new University(persons);

        System.out.println("Full Names: " + university.getFullNames()+"\n");
        System.out.println("Oldest Person: " + university.getOldestPerson().getFullName()+"\n");
        System.out.println("Youngest Person: " + university.getYoungestPerson().getFullName()+"\n");

        ArrayList<person> voters = university.getVoters();
        System.out.print("Voters: ");
        int i=1;
        for (person voter : voters) {
            System.out.print(i+"."+voter.getFullName() + "\n");
            i++;
        }
        System.out.println();

        int numberOfEmployees = university.getNumberOfEmployees();
        System.out.println("Number of Employees: " + numberOfEmployees);
   

}
}
