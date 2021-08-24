package menu.model;

public class Lunch {

	private String lunchItemName;
	private double price;

	public Lunch() {

	}

	public Lunch(String lunchItemName, double price) {
		super();
		this.lunchItemName = lunchItemName;
		this.price = price;
	}

	public String getItemName() {
		return lunchItemName;
	}

	public void setItemName(String itemName) {
		this.lunchItemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
