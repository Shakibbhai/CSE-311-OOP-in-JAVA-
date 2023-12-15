package java_lab_final_q_2;

public class Item {
	private String name;
	private double unit_price;
	private double quantity;
	public Item(String name, double unit_price, double quantity) {
		this.name = name;
		this.unit_price = unit_price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public double getQuantity() {
		return quantity;
	}
	public double gettotalcost() {
		return unit_price*quantity;
	}
	
	
	

}
