package menu.model;

public class Breakfast {

	private String breakfastItemName;
	private double price;

	public Breakfast() {

	}

	public Breakfast(String breakfastItemName, double price) {
		super();
		this.breakfastItemName = breakfastItemName;
		this.price = price;
	}

	public String getItemName() {
		return breakfastItemName;
	}

	public void setItemName(String itemName) {
		this.breakfastItemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
