package online_shopping;

public class Customer extends atmcard{
	private String name;
	private String email;
	 private ShoppingCart soooppingCart;
	public Customer(String name, String email,double balance) {
		super(balance);
		this.name = name;
		this.email = email;
		soooppingCart=new ShoppingCart();
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public void additem(CartItem x) {
		soooppingCart.addItem(x);
		balance=balance-(x.getPrice()*x.getQuantity());
	}
	public void removeitem(CartItem x) {
		soooppingCart.removeItem(x);
		balance=balance+(x.getPrice()*x.getQuantity());
	}
	 public void displayCustomerInfo() {
	        System.out.println("Customer Information:");
	        System.out.println("------------------");
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        soooppingCart.displayCart();
	        System.out.println("------------------");
	        System.out.println("Current balance: "+balance);
	 }
}
