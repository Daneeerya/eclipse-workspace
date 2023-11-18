package modules_oop2.modules.products.classes;

import modules_oop2.classes.date_object;

public class smartphone extends product {
	// Atributes
	private int n_days_last_units;
	private int n_sales_days;
	private char brand;

//		Constructor
	public smartphone(int stock, float weight, float price, String iD_prod, date_object purchaseDate,
			date_object deliveryDate, date_object returnDate, date_object return_Purchase_Date,
			date_object iniPromoDate, date_object endPromoDate, int n_days_last_units, int n_sales_days, char brand,
			float price_total) {
		super(stock, weight, price, iD_prod, purchaseDate, deliveryDate, returnDate, return_Purchase_Date, iniPromoDate,
				endPromoDate, price_total);
		this.n_days_last_units = n_days_last_units;
		this.n_sales_days = n_sales_days;
		this.brand = brand;
	}

	// date_object return_Purchase_Date,
	// Getters
	public int getN_days_last_units() {
		return n_days_last_units;
	}

	public int getN_sales_days() {
		return n_sales_days;
	}

	public char getBrand() {
		return brand;
	}

	// Setters

	public void setN_sales_days(int n_sales_days) {
		this.n_sales_days = n_sales_days;
	}

	public void setN_days_last_units(int n_days_last_units) {
		this.n_days_last_units = n_days_last_units;
	}

	public void setBrand(char brand) {
		this.brand = brand;
	}

//		To String
	@Override
	public String toString() {
		String cad = "";
		cad = cad + ("ID: " + super.getID_prod() + "\n");
		cad = cad + ("Stock: " + super.getStock() + "\n");
		cad = cad + ("Weight: " + super.getWeight() + "\n");
		cad = cad + ("Price: " + super.getPrice() + "\n");
		cad = cad + ("Purchase Date: " + super.getpurchaseDate() + "\n");
		cad = cad + ("Delivery Date: " + super.getdeliveryDate() + "\n");
		cad = cad + ("Return Date: " + super.getreturnDate() + "\n");
		cad = cad + ("Return Purchase Date: " + super.getreturn_Purchase_Date() + "\n");
		cad = cad + ("Start Promotion Date: " + super.getiniPromoDate() + "\n");
		cad = cad + ("End Promotion Date: " + super.getendPromoDate() + "\n");
		cad = cad + ("Number days with last units: " + this.getN_days_last_units() + "\n");
		cad = cad + ("Number with sales days: " + this.getN_sales_days() + "\n");
		cad = cad + ("Brand: " + this.getBrand() + "\n");
		cad = cad + ("Price total: " + super.getPrice_total() + "\n");
		return cad;
	}

}
