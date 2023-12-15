package a_simple_password_manager;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	private ArrayList<AuthenticationInfo> s1;

	public Application() {
		s1=new ArrayList<>();
	}
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice!=3) {
			System.out.println("Password Manager Menu:");
			System.out.println("1. New Login Info");
			System.out.println("2. View Login Info");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				createLoginRecord();
				break;
			case 2:
				viewLoginRecord();
				break;
			case 3:
				System.out.println("3.Exiting:");
				break;
				default:
					System.out.println("invalid choice and maximum 3 again");
				break;
				
			}
			
		}
	}
	private void createLoginRecord() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the URL:");
		String url=s.nextLine();
		System.out.println("enter the username:");
		String username=s.nextLine();
		System.out.println("enter the password:");
		String password=s.nextLine();
		
		AuthenticationInfo yo=new AuthenticationInfo(url,username,password);
		 String encryptedPassword=EncryptionUtil.encrypt(password,2);
		
		s1.add(yo);
		System.out.println("log in created succesfully!");
		System.out.println("Password: " + encryptedPassword);
		
	}
private void viewLoginRecord() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter URL:");
	String url=s.nextLine();
	for(AuthenticationInfo saku:s1) {
		if(saku.getUrl().equals(url)) {
			String decryptedPassword=EncryptionUtil.decrypt(saku.getPassword(),saku.getPassword().length());
			  System.out.println("Username: " + saku.getUsername());
              System.out.println("Password: " + decryptedPassword);
		}
	}
	System.out.println("No login info found for the given URL.");
	
	}
	

}
