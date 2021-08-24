package menu.breakfast;

public class Breakfast {
	
	private String breakfastItemName;
	private double price;
	
	public Breakfast() {
		
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
	
	public void priceDetails() {
		System.out.println(breakfastItemName +"'s price is "+ price);
	}

}
