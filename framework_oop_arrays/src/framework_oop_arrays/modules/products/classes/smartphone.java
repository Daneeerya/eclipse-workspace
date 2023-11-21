package framework_oop_arrays.modules.products.classes;

import framework_oop_arrays.classes.date_object;
import framework_oop_arrays.modules.products.utils.product_data;

public class smartphone extends product {

	// Atributes
	private String brand;
	private float price_promo;

//	Constructor
	public smartphone(int stock, float weight, float price, String ID, date_object purchaseDate,
			date_object deliveryDate, date_object returnDate, date_object startPromoDate, date_object endPromoDate,
			String brand, float price_total, float price_promo) {
		super(stock, weight, price, ID, purchaseDate, deliveryDate, returnDate, startPromoDate, endPromoDate,
				price_total);
		this.brand = brand;
		this.price_promo = price_promo;

	}

	public smartphone() {
		super();
	}

//	Constructor de clau primaria
	public smartphone(String ID) {
		super(ID);
	}

// Getters
	public String getBrand() {
		return brand;
	}

	public float getPrice_promo() {
		return price_promo;
	}

// Setters	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice_promo(float price_promo) {
		this.price_promo = price_promo;
	}

	// Functions
	public void calculate_total_price() {
		if ((product_data.returnProduct(this) == false) && (product_data.pricePromotion(this) == true)) {
			super.setPrice_total((super.getPrice() * this.getPrice_promo() / 100));
		} else if ((product_data.returnProduct(this) == true) && (product_data.pricePromotion(this) == false)) {
			super.setPrice_total((super.getPrice() * (-1)));
		} else if ((product_data.returnProduct(this) == true) && (product_data.pricePromotion(this) == true)) {
			super.setPrice_total((super.getPrice() * (-1) * this.getPrice_promo() / 100));
		} else {
			super.setPrice_total(super.getPrice());
		}

	}

//	To String
	@Override
	public String toString() {
		String cad = "";
		cad = cad + ("ID: " + super.getID() + "\n");
		cad = cad + ("Stock: " + super.getStock() + "\n");
		cad = cad + ("Weight: " + super.getWeight() + "\n");
		cad = cad + ("Price: " + super.getPrice() + "\n");
		cad = cad + ("Purchase Date: " + super.getpurchaseDate() + "\n");
		cad = cad + ("Delivery Date: " + super.getdeliveryDate() + "\n");
		cad = cad + ("Return Date: " + super.getreturnDate() + "\n");
		cad = cad + ("Return Purchase Date: " + super.getreturn_Purchase_Date() + "\n");
		cad = cad + ("Start Promotion Date: " + super.getstartPromoDate() + "\n");
		cad = cad + ("End Promotion Date: " + super.getendPromoDate() + "\n");
		cad = cad + ("Brand: " + this.getBrand() + "\n");
		cad = cad + ("Price total: " + super.getPrice_total() + "\n");
		return cad;
	}

}
