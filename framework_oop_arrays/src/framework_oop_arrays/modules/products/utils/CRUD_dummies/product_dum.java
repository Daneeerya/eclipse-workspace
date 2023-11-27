package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.classes.date_object;

public abstract class product_dum {

	private int stock;
	private float weight;
	private float price;
	private String ID;
	private date_object purchaseDate;
	private date_object deliveryDate;
	private date_object returnDate;
	private date_object startPromoDate;
	private date_object endPromoDate;

//		Constructor
	public product_dum(int stock, float weight, float price, String iD, date_object purchaseDate,
			date_object deliveryDate, date_object returnDate, date_object startPromoDate, date_object endPromoDate) {
		super();
		this.stock = stock;
		this.weight = weight;
		this.price = price;
		this.ID = iD;
		this.purchaseDate = purchaseDate;
		this.deliveryDate = deliveryDate;
		this.returnDate = returnDate;
		this.startPromoDate = startPromoDate;
		this.endPromoDate = endPromoDate;
	}

//	Building default

//	Primary key building
	public product_dum(String iD_dummies) {
		this.ID = iD_dummies;
	}

//		Getters

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public date_object getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(date_object purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public date_object getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(date_object deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public date_object getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(date_object returnDate) {
		this.returnDate = returnDate;
	}

	public date_object getStartPromoDate() {
		return startPromoDate;
	}

	public void setStartPromoDate(date_object startPromoDate) {
		this.startPromoDate = startPromoDate;
	}

	public date_object getEndPromoDate() {
		return endPromoDate;
	}

	public void setEndPromoDate(date_object endPromoDate) {
		this.endPromoDate = endPromoDate;
	}

	// To String
	@Override
	public abstract String toString();
}
