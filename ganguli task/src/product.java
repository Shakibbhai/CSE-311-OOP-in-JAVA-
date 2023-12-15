
public class product {
	private String name;
	private int price;
	private double quantity;
	
	public product(String name,int price,double quantity) {
		
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	
	public String getname() {
		return name;
	}
	public int getprice() {
		return price;
	}
	public double getquantity() {
		return quantity;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setprice(int  price) {
		this.price=price;
	}
	public void setquantity(double quantity) {
		this.quantity=quantity;
	}
   public double gettotalvalue() {
	   return price*quantity;
   }
}
