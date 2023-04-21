package lv.venta.models;

public class Product {
	private static long itCounter = 0;
	
	private long id;
	private String title;
	private String description;
	private int quantity;
	private float price;
	
	public Product() {
		super();
		this.id = itCounter++;
		this.title = "";
		this.description = "";
		this.quantity = 0;
	}
	
	public Product(String title, String description, int quantity, float price) {
		super();
		this.id = itCounter++;
		this.title = title;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
