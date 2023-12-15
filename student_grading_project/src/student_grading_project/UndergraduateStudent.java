package student_grading_project;
class UndergraduateStudent extends Student {
	private double averageGrade;
	
	public UndergraduateStudent(String name, int id, double averageGrade) {
		super(name, id);
		this.averageGrade=averageGrade;
		//  Auto-generated constructor stub
	}
	@Override
	public double calculateGrade() {
		return averageGrade;
	}
	public void displayGrade() {
		System.out.println("Undergraduate Student");
		System.out.println("Name: "+getName());
		System.out.println("ID: " + getId());
		System.out.println("Numerical Grade:"+calculateGrade());
		System.out.println("LetterGrade: "+getLetterGrade(calculateGrade()));
		System.out.println("\n");
	}
	private String getLetterGrade(double numericalGrade) {
		if(numericalGrade>=90) {
			return "A+";
		}else if(numericalGrade>=80) {
			return "A";
		}
		else if (numericalGrade >= 70) {
            return "B";
        } else if (numericalGrade >= 60) {
            return "C";
        } else {
            return "F";
        }
	}
	
	

	
	

}
