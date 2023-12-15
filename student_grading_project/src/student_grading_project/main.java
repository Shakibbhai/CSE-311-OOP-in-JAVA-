package student_grading_project;

public class main {
	public static void main(String[] args) {
		UndergraduateStudent u1 = new UndergraduateStudent("saku vai", 12345, 90);
		u1.displayGrade();
		GraduateStudent g1 = new GraduateStudent("imtiax", 12345, 70);
		g1.displayGrade();
	}

}
