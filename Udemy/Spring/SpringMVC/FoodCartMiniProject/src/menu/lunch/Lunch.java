package menu.lunch;

public class Lunch {
	
	private String lunchItemName;
	private double price;
	
	public Lunch() {
		
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
	
	public void priceDetails() {
		System.out.println(lunchItemName +"'s price is "+ price);
	}

}
