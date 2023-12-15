package java_lab_final_q_2;
import java.util.ArrayList;
import java.util.Scanner;

public class User extends Item{
	private String Name;
	private double contact_number;
	private ArrayList<Item>cart;
	public User(String name, double unit_price, double quantity,String Name,double contact_number) {
		super(name, unit_price, quantity);
		this.Name=Name;
		this.contact_number=contact_number;
		cart=new ArrayList<>();
	}
	
	
	public String getName() {
		return Name;
	}


	public double getContact_number() {
		return contact_number;
	}


	public void additem(Item s1) {
		cart.add(s1);
	}
	public void removeitem(Item s2) {
		cart.add(s2);
	}
	public double total_changes_amount() {
		double total_amount=50000;
		for(Item x:cart) {
			total_amount-=x.gettotalcost();
		}
		return total_amount;
	}
	
	public void displayCart() {
		  System.out.println("Shopping Cart:");
	      System.out.println("------------------");
	      for(int i=0;i<cart.size();i++) {
	    	  System.out.println("Name: " + cart.get(i).getName());
	          System.out.println("unit Price:" + cart.get(i).getUnit_price());
	          System.out.println("Quantity: " + cart.get(i).getQuantity());
	          System.out.println("------------------");
	
	      }
	      System.out.println("Total Price:" + total_changes_amount());

}
	public void creditcard() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valid credit no:");
		double a=sc.nextDouble();
		if(User.getContact_number().equals(a)) {
			System.out.println("Log in succesFully:");
		}
		
		
	}
	
	
	
}