package student_management;

public class HighSchool extends Part2Student implements TestTaker {
	 
    private String physicalEd;
     
    /**public HighSchool(String id, String name, String school, String teacher, String physicalEd) {
    *   super(id, name, school, teacher);
    *   setPhysicalEd(physicalEd);
    *}
    */
     
    public String toString() {
        return super.toString() + " (Pysical Ed choice is: " + physicalEd + ") "; 
    }
     
    public void progressReport() {
        System.out.println("Student is progressing nicely");
    }
     
    public void takeTest() {
     
    }
     
    public String getTestResults() {
        return "Test results look good";
    }
     
         
    public void setPhysicalEd(String physicalEd) {
        this.physicalEd = physicalEd;
    }
 
    public String getPhysicalEd() {
        return physicalEd;
    }
}