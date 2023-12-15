package student_management;

import java.util.*;

public class Part2StudentList<InputHelper> {
 
    private InputHelper input;
    private ArrayList part2Students;
 
 
    public void run() {
        studentEntry();
        //part2StudentDisplay();
    }
 
    public void studentEntry() {
     
    ArrayList<Part2Student> part2Students = new ArrayList<Part2Student>();
    input = new InputHelper();
     
    String id           ="";
    String name         ="";
    String gradeString  ="";
    String teacher      ="";
    int grade           =0;
    String physicalEd   ="";
    String music        ="";
    String recess       ="";
    String moreStudents ="";
    HighSchool newHighSchool                = null;
    MiddleSchool newMiddleSchool            = null;
    ElementarySchool newElementarySchool    = null;
     
        while (true) {
            id = input.getUserInput("Enter student ID: ");
            name = input.getUserInput("Enter students name: ");
            teacher = input.getUserInput("Enter students homeroom teacher: ");
            gradeString = input.getUserInput("Enter students grade between 1 & 12: ");
            grade = Integer.parseInt(gradeString);
            if (grade > 0 && grade <6) {
                recess = input.getUserInput("Enter favorite recess game: ");
                newElementarySchool = new ElementarySchool();
                newElementarySchool.setId(id);
                newElementarySchool.setName(name);
                newElementarySchool.setGrade(grade);
                newElementarySchool.setTeacher(teacher);
                newElementarySchool.setRecess(recess);
                part2Students.add(newElementarySchool);
            } else if (grade >5 && grade <9) {
                music = input.getUserInput("Enter musical instrument choice: ");
                newMiddleSchool = new MiddleSchool();
                newMiddleSchool.setId(id);
                newMiddleSchool.setName(name);
                newMiddleSchool.setGrade(grade);
                newMiddleSchool.setTeacher(teacher);
                newMiddleSchool.setMusic(music);
                part2Students.add(newMiddleSchool);
            } else if (grade >8 && grade <13) {
                physicalEd = input.getUserInput("Enter Physical Ed choice: ");
                newHighSchool = new HighSchool();
                newHighSchool.setId(id);
                newHighSchool.setName(name);
                newHighSchool.setGrade(grade);
                newHighSchool.setTeacher(teacher);
                newHighSchool.setPhysicalEd(physicalEd);
                part2Students.add(newHighSchool);
            }
            if (!moreStudents.equals("y")) {
                break;
            }
        }
     
    }
     
     
}