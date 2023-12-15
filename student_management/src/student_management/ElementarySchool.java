package student_management;

public class ElementarySchool extends Part2Student implements TestTaker {
	 
    private String recess;
     
    /**public ElementarySchool(String id, String name, String school, String teacher, String recess) {
    *   super(id, name, school, teacher);
    *   setRecess(recess);
    *}
    */
     
    public String toString() {
        return super.toString() + " (Favorite recess game is: " + recess + ") "; 
    }
    public void progressReport() {
        System.out.println("Elementary Student is progressing nicely");
    }
    public void takeTest() {
     
    }
     
    public String getTestResults() {
        return "Test results look good";
    }
     
    public void setRecess(String recess) {
        this.recess = recess;
    }
 
    public String getRecess() {
        return recess;
    }
     
}