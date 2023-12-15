package shakib_java_project_starting_file_how_to_learn;
import java.io.*;
import java.util.Formatter;
import java.util.*;

public class custom_file_write_on {
	public static void main(String[]args)throws Exception {
		Formatter a=new Formatter("D:\\New folder\\custom.txt");
		Scanner sc =new Scanner(System.in);
		int no;
		String name,roll,id;
		System.out.println("enter the students no:");
		no=sc.nextInt();
		a.format("Name....Roll...ID......");
		a.format("\n");
//System.out.println("\n");
		for(int i=1;i<=no;i++) {
			System.out.printf("enter the students information no %d",i);
			System.out.println("name roll and ID:");
			name=sc.next();
			roll=sc.next();
			id=sc.next();
			a.format("%s\t%s\t%s\r\n",name,roll,id);
			
		}a.close();
		
		
		
		
	}

}
