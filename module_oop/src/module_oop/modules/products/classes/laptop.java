package module_oop.modules.products.classes;

import module_oop.classes.date_object;
import module_oop.modules.products.utils.product_data;

public class laptop extends product {

	private int n_days_with_promo;
	private float price_promo;

//	Constructor

	public laptop(int stock, float weight, float price, String iD_prod, date_object purchaseDate,
			date_object deliveryDate, date_object returnDate, date_object iniPromoDate, date_object endPromoDate,
			int n_days_with_promo, float price_promo, float price_total) {
		super(stock, weight, price, iD_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate, endPromoDate,
				price_total);
		this.n_days_with_promo = n_days_with_promo;
		this.price_promo = price_promo;
	}

//	date_object return_Purchase_Date,

//Getters 
	public int getN_days_with_promo() {
		return n_days_with_promo;
	}

	public float getPrice_promo() {
		return price_promo;
	}

//	Setters 
	public void setN_days_with_promo(int n_days_with_promo) {
		this.n_days_with_promo = n_days_with_promo;
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
		cad = cad + ("Start Promotion Date: " + super.getiniPromoDate() + "\n");
		cad = cad + ("End Promotion Date: " + super.getendPromoDate() + "\n");
		cad = cad + ("Number days with promo: " + this.getN_days_with_promo() + "\n");
		cad = cad + ("Price with promo: " + this.getPrice_promo() + "\n");
		cad = cad + ("Price total: " + super.getPrice_total() + "\n");
		return cad;
	}

}
