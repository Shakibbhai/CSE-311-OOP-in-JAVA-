package online_shopping;

public class Electronics extends CartItem {
	private String brand;

	public Electronics(String name, double price, int quantity,String brand) {
		super(name, price, quantity);
		this.brand=brand;
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "brand is :"+brand;
	}
	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		return  getPrice()*getQuantity();
	}
	

	
	

}
