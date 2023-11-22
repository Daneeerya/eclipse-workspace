package framework_oop_arrays.modules.products.classes;

import framework_oop_arrays.classes.date_object;

public abstract class product {
	private int stock;
	private float weight;
	private float price;
	private String ID;
	private date_object creationDate;
	private date_object purchaseDate;
	private date_object deliveryDate;
	private date_object returnDate;
	private date_object return_Purchase_Date;
	private date_object startPromoDate;
	private date_object endPromoDate;
	private float price_total;

//		Constructor
	public product(int stock2, float weight, float price, String ID, date_object purchaseDate, date_object deliveryDate,
			date_object returnDate, date_object startPromoDate, date_object endPromoDate, float price_total) {
		super();
		this.stock = stock2;
		this.weight = weight;
		this.price = price;
		this.ID = ID;
		this.purchaseDate = purchaseDate;
		this.deliveryDate = deliveryDate;
		this.returnDate = returnDate;
		this.startPromoDate = startPromoDate;
		this.endPromoDate = endPromoDate;
		this.price_total = price_total;
	}

//	Building default
	public product() {
	}

//	Primary key building
	public product(String ID) {
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

	public date_object getcreationDate() {
		return creationDate;
	}

	public date_object getpurchaseDate() {
		return purchaseDate;
	}

	public date_object getdeliveryDate() {
		return deliveryDate;
	}

	public date_object getreturnDate() {
		return returnDate;
	}

	public date_object getreturn_Purchase_Date() {
		return return_Purchase_Date;
	}

	public date_object getstartPromoDate() {
		return startPromoDate;
	}

	public date_object getendPromoDate() {
		return endPromoDate;
	}

	public float getPrice_total() {
		return price_total;
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

	public void setcreationDate(date_object creationDate) {
		this.creationDate = creationDate;
	}

	public void setpurchaseDate(date_object purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setdeliveryDate(date_object deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public void setreturnDate(date_object returnDate) {
		this.returnDate = returnDate;
	}

	public void setreturn_Purchase_Date(date_object return_Purchase_Date) {
		this.return_Purchase_Date = return_Purchase_Date;
	}

	public void setstartPromoDate(date_object startPromoDate) {
		this.startPromoDate = startPromoDate;
	}

	public void setendPromoDate(date_object endPromoDate) {
		this.endPromoDate = endPromoDate;
	}

	public void setPrice_total(float price_total) {
		this.price_total = price_total;
	}

	public boolean equals(Object param) {
		return getID().equals(((product) param).getID());
	}

// To string
	@Override
	public abstract String toString();

}
