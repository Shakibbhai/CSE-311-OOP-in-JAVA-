package student_grading_project;

public class GraduateStudent extends Student {
private double averageGrade;
	public GraduateStudent(String name, int id,double averageGrade) {
		super(name, id);
		this.averageGrade=averageGrade;
		// TODO Auto-generated constructor stub
	}
	@Override
	 public double calculateGrade() {
	        return averageGrade;
	    }
	@Override
	 public void displayGrade() {
	        System.out.println("Graduate Student");
	        System.out.println("Name: " + getName());
	        System.out.println("ID: " + getId());
	        System.out.println("Numerical Grade: " + calculateGrade());
	        System.out.println("Letter Grade: " + getLetterGrade(calculateGrade()));
	    }
	 private String getLetterGrade(double numericalGrade) {
	        if (numericalGrade >= 85) {
	            return "A";
	        } else if (numericalGrade >= 75) {
	            return "B";
	        } else if (numericalGrade >= 65) {
	            return "C";
	        } else if (numericalGrade >= 55) {
	            return "D";
	        } else {
	            return "F";
	        }

}
}
