package student_management;

public abstract class Part2Student {
	 
    private String id;
    private String name;
    private String grade;
    private String teacher;
     
    abstract public void progressReport();
     
     
    public String toString() {
        return "\nStudent ID: " + id + 
                "\nStudent Name: " + name +
                "\nGrade: " + grade +
                "\nHomeroom Teacher: " + teacher;
    }
     
    /**public Part2Student(String id, String name, String school, String teacher) {
    *   setId(id);
    *   setName(name);
    *   setgrade(grade);
    *   setTeacher(teacher);
    *}
    */
     
    private void setId(String id) {
        this.id = new String(id);
    }
     
    private void setName(String name) {
        this.name = new String(name);
    }
     
    private void setGrade(String grade) {
        this.grade = new String(grade);
    }
         
    private void setTeacher(String teacher) {
        this.teacher = new String(teacher);
    }
     
    public String getId() {
        return new String(id);
    }
     
    public String getName() {
        return new String(name);
    }
 
    public String getGrade() {
        return  new String(grade);
    }
         
    public String getTeacher() {
        return  new String(teacher);
    }
    
}
