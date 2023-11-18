package module_oop.modules.products.classes;

import module_oop.classes.date_object;
import module_oop.modules.products.utils.product_data;

public class smartphone extends product {
	// Atributes
	private int n_days_last_units;
	private int n_sales_days;
	private String brand;
	private float price_promo;

//	Constructor
	public smartphone(int stock, float weight, float price, String iD_prod, date_object purchaseDate,
			date_object deliveryDate, date_object returnDate, date_object iniPromoDate, date_object endPromoDate,
			int n_days_last_units, int n_sales_days, String brand, float price_total, float price_promo) {
		super(stock, weight, price, iD_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate, endPromoDate,
				price_total);
		this.n_days_last_units = n_days_last_units;
		this.n_sales_days = n_sales_days;
		this.brand = brand;
		this.price_promo = price_promo;

	}

// Getters
	public int getN_days_last_units() {
		return n_days_last_units;
	}

	public int getN_sales_days() {
		return n_sales_days;
	}

	public String getBrand() {
		return brand;
	}

	public float getPrice_promo() {
		return price_promo;
	}

// Setters	
	public void setN_sales_days(int n_sales_days) {
		this.n_sales_days = n_sales_days;
	}

	public void setN_days_last_units(int n_days_last_units) {
		this.n_days_last_units = n_days_last_units;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice_promo(float price_promo) {
		this.price_promo = price_promo;
	}

	// Functions
	public void calculate_total_price() {
		System.out.println(product_data.returnProduct(this));
		System.out.println(product_data.pricePromotion(this));
		if ((product_data.returnProduct(this) == false) && (product_data.pricePromotion(this) == true)) {// Return
			// NO
			// Promo
			// SI
			super.setPrice_total((super.getPrice() * this.getPrice_promo() / 100));
			System.out.println("RETURN NO, PROMO SI");

		} else if ((product_data.returnProduct(this) == true) && (product_data.pricePromotion(this) == false)) {// Return
																												// SI
																												// Promo
																												// NO
			super.setPrice_total((super.getPrice() * (-1)));
			System.out.println("PROMO SI, RETURN NO");

		} else if ((product_data.returnProduct(this) == true) && (product_data.pricePromotion(this) == true)) {// Return
			// SI
			// Promo SI OK

			super.setPrice_total((super.getPrice() * (-1) * this.getPrice_promo() / 100));
			System.out.println("PROMO SI, RETURN SI");

		} else {
			super.setPrice_total(super.getPrice());

		}

	}

//	To String
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
