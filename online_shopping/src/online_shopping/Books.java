package online_shopping;

public class Books extends CartItem {
	private String author;

    public Books(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        this.author = author;
    }
    public String getDescription() {
		// TODO Auto-generated method stub
		return "authors are :"+ author;
	}
	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		return  getPrice()*getQuantity();
	}

}
