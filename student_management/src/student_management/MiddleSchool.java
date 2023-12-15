package student_management;

public class MiddleSchool extends Part2Student implements TestTaker {
	 
    private String music;
     
    /**public MiddleSchool(String id, String name, String school, String teacher, String music) {
    *   super(id, name, school, teacher);
    *   setMusic(music);
    *}
    */
     
    public String toString() {
        return super.toString() + " (Music choice is: " + music + ") "; 
    }
     
    public void progressReport() {
        System.out.println("Middle School Student is progressing nicely");
    }
    public void takeTest() {
     
    }
     
    public String getTestResults() {
        return "Test results look good";
    }
     
    public void setMusic(String music) {
        this.music = music;
    }
 
    public String getMusic() {
        return music;
    }
     
     
     
     
}
