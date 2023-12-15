package practice;

import java.util.Scanner;

public class LINE {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
	  
		System.out.println("enter the LINE:");
		String c=a.nextLine();
		System.out.println("the no is:"+c);
		String s="hi am laltu";
		System.out.println(s);
		String []d=s.split(" ");
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}
}
