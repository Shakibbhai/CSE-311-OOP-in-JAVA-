package student_grading_project;
 abstract class Student implements GradeCalculator {
	 private String name;
	 private int id;
	 public Student(String name,int id) {
		 this.name=name;
		 this.id=id;
	 }
	 public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}
