package online_shopping;

public class Clothing extends CartItem {
	private String size;

    public Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

	public String getSize() {
		return size;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "size is :"+size;
	}
	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		return  getPrice()*getQuantity();
	}

	


}
