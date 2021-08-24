package menu.model;

public class Dinner {
	
	private String dinnerItemName;
	private double price;

	public Dinner() {

	}

	public Dinner(String dinnerItemName, double price) {
		super();
		this.dinnerItemName = dinnerItemName;
		this.price = price;
	}

	public String getItemName() {
		return dinnerItemName;
	}

	public void setItemName(String itemName) {
		this.dinnerItemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
