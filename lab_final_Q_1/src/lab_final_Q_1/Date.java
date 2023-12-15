package lab_final_Q_1;
import java.util.Scanner;

public class Date  {
	private int a_month;
	private int a_day;
	private int a_year;
	public Date(int a_month, int a_day, int a_year) {
		this.a_month = a_month;
		this.a_day = a_day;
		this.a_year = a_year;
	}
	
		public  Date(int a_month,int a_day) {
		this.a_month=4;
		this.a_day=5;
		this.a_year=2023;
		
	}
	public int getA_month() {
		return a_month;
	}
	public int getA_day() {
		return a_day;
	}
	public int getA_year() {
		return a_year;
	}
	public void displayDate() {
		System.out.println(getA_month()+"/"+getA_day()+"/"+getA_year());
		
	}
	
	
	
	
	
	

}
