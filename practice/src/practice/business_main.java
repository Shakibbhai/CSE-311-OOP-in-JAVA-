package practice;
import java.util.ArrayList;
import java.util.Scanner;
//John Smith,
//johnsmith@example.com, (123) 456-7890, 123 Main St
public class business_main {
	public static void main(String []args) {
		Scanner a=new Scanner(System.in);
		
		System.out.println("enter the customer information:");
		String customerinfo=a.nextLine();
		System.out.println(customerinfo);
		
		String []customer_name;
		String []customer_address;
		String []number;
		String []address;
		String customerinfo1[]=customerinfo.split(",",3);
		for(String x:customerinfo1) {
			System.out.println(x);
		}
		
		
		ArrayList<String> saku=new Arraylist<String>();
		saku.add(customerinfo);
		
		
	}
	

}
