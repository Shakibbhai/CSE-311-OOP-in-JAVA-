package practice;
import java.util.Scanner;

public class mainly {
	public static void main(String [] args) {
		car mycar=new car();
		car mycar1=new car();
		
		System.out.println(mycar.car_name+"\n"+mycar.year+"\n"+mycar.price);
		System.out.println(mycar1.car_name+"\n"+mycar1.year+"\n"+mycar1.price);
		

			Scanner sc =new Scanner(System.in);
			
		int i,j;
		System.out.println("to stop the car press 1");
	    i=sc.nextInt();
	    if(i==1) {
	    	mycar.brake();
	    }
	    else {
	    	System.out.println("no");
	    }
	    System.out.println("to drive the car press 3");
		j=sc.nextInt();
		if(j==3) {
			mycar1.drive();
		}else {
			System.out.println("no");
		}
		
		
	}

}
