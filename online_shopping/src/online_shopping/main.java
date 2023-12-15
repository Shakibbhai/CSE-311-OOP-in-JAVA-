package online_shopping;

public class main {
	public static void main(String [] args) {
		Customer c1=new Customer("shakib bhai","n.m.shakib47@gmail.com",50000);
		
		Electronics a=new Electronics("iphone",455,1,"apple");
		Books b=new Books("DSA",455,2,"shams series");
		Clothing c=new Clothing("t shirt",455,1,"gulistan");
		
		c1.additem(a);
		c1.removeitem(a);
		c1.additem(b);
		c1.additem(c);
		c1.displayCustomerInfo();
		
	}

}
