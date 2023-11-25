package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.classes.date_object;

public abstract class product_dum {

	private int stock;
	private float weight;
	private float price;
	private String ID;
	private date_object purchaseDate;

//		Constructor

	public product_dum(int stock, float weight, float price, String ID, date_object purchaseDate) {
		super();
		this.stock = stock;
		this.weight = weight;
		this.price = price;
		this.ID = ID;
		this.purchaseDate = purchaseDate;

	}

//	Building default

//	Primary key building
	public product_dum(String ID) {
		this.ID = ID;
	}

//		Getters
	public int getStock() {
		return stock;
	}

	public float getWeight() {
		return weight;
	}

	public float getPrice() {
		return price;
	}

	public String getID() {
		return ID;
	}

	public date_object getpurchaseDate() {
		return purchaseDate;
	}

	// Setters
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public boolean equals(Object product_dum) {
		return getID().equals(((product_dum) product_dum).getID());
	}

// To string
	@Override
	public abstract String toString();

}
