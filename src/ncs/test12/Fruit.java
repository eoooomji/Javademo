package ncs.test12;

public class Fruit {
	private String name;
	private int price;
	private int quantity;

	public Fruit() {

	}

	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return name + price + quantity;
	}

	public void setName() {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice() {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setQuantity() {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

}
