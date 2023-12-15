package lab_final_Q_1;

public class child_of_Date extends Date{

	public child_of_Date(int a_month,int a_day, int a_year) {
		super(a_month, a_day, a_year);
		// TODO Auto-generated constructor stub
	}
	//overload
	public void getdisplayDate() {
		System.out.println(getA_month()+"."+getA_day()+"."+getA_year());
		
	}
	
	

}
