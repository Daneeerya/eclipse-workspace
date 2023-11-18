package module_oop.modules.products.classes;

import module_oop.classes.date_object;
import module_oop.modules.products.utils.product_data;

public class accessory extends product {
	// Atributes
	private float price_last_units;
	private float price_sales;
	private String type_of_product;
	private float price_promo;

//		Constructor
	public accessory(int stock, float weight, float price, String iD_prod, date_object purchaseDate,
			date_object deliveryDate, date_object returnDate, date_object iniPromoDate, date_object endPromoDate,
			float price_total, float price_last_units, float price_sales, String type_of_product, float price_promo) {
		super(stock, weight, price, iD_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate, endPromoDate,
				price_total);
		this.price_last_units = price_last_units;
		this.price_sales = price_sales;
		this.type_of_product = type_of_product;
		this.price_promo = price_promo;
	}
//		Getters

	public float getPrice_last_units() {
		return price_last_units;
	}

	public float getPrice_sales() {
		return price_sales;
	}

	public String getType_of_product() {
		return type_of_product;
	}

	public float getPrice_promo() {
		return price_promo;
	}

	// Setters
	public void setPrice_last_units(float price_last_units) {
		this.price_last_units = price_last_units;
	}

	public void setPrice_sales(float price_sales) {
		this.price_sales = price_sales;
	}

	public void setType_of_product(String type_of_product) {
		this.type_of_product = type_of_product;
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
		cad = cad + ("Purchase Date: " + super.getpurchaseDate() + "\n");
		cad = cad + ("Delivery Date: " + super.getdeliveryDate() + "\n");
		cad = cad + ("Return Date: " + super.getreturnDate() + "\n");
		cad = cad + ("Return Purchase Date: " + super.getreturn_Purchase_Date() + "\n");
		cad = cad + ("Start Promotion Date: " + super.getiniPromoDate() + "\n");
		cad = cad + ("End Promotion Date: " + super.getendPromoDate() + "\n");
		cad = cad + ("Type Of Product: " + this.getType_of_product() + "\n");
		cad = cad + ("Price Last Units: " + this.getPrice_last_units() + "\n");
		cad = cad + ("Price Sales: " + this.getPrice_sales() + "\n");
		cad = cad + ("Price total: " + super.getPrice_total() + "\n");
		return cad;
	}

}
