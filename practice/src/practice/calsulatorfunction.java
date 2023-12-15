package practice;
import java.util.Scanner;
public class calsulatorfunction {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter x and y");
		int x=a.nextInt();
		int y=a.nextInt();
		int b=add(x,y);
		int c=mul(x,y);
		int d=divi(x,y);
		int e=sub(x,y);
		System.out.println(b+"mul is:"+c+"");
	}
	static int add(int x,int y) {
		int sum=x+y;
		return sum;
	}
	static int mul(int x,int y) {
		int sum=x*y;
		return sum;
	}
	static int divi(int x,int y) {
		int sum=x/y;
		return sum;
	}
	static int sub(int x,int y) {
		int sum=x-y;
		return sum;
	}

}
