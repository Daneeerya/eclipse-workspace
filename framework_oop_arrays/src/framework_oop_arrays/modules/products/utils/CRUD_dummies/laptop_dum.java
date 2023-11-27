package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.classes.date_object;

public class laptop_dum extends product_dum {

//	Constructor
	private float price_promo;

	public laptop_dum(int stock, float weight, float price, String iD, date_object purchaseDate,
			date_object deliveryDate, date_object returnDate, date_object startPromoDate, date_object endPromoDate,
			float price_promo) {
		super(stock, weight, price, iD, purchaseDate, deliveryDate, returnDate, startPromoDate, endPromoDate);
		this.price_promo = price_promo;
	}

	// Constructor de clau primaria
	public laptop_dum(String iD_dummies) {
		super(iD_dummies);
	}

//	Setters 
	public float getPrice_promo() {
		return price_promo;
	}

	public void setPrice_promo(float price_promo) {
		this.price_promo = price_promo;
	}

	@Override
	public String toString() {
		String cad = "";
		cad = cad + ("ID: " + super.getID() + "\n");
		cad = cad + ("Stock: " + super.getStock() + "\n");
		cad = cad + ("Weight: " + super.getWeight() + "\n");
		cad = cad + ("Price: " + super.getPrice() + "\n");
		cad = cad + ("Purchase Date: " + super.getPurchaseDate() + "\n");
		cad = cad + ("Purchase Date: " + super.getPurchaseDate() + "\n");
		cad = cad + ("Delivery Date: " + super.getDeliveryDate() + "\n");
		cad = cad + ("Return Date: " + super.getReturnDate() + "\n");
		cad = cad + ("Start Promotion Date: " + super.getStartPromoDate() + "\n");
		cad = cad + ("End Promotion Date: " + super.getEndPromoDate() + "\n");
		cad = cad + ("Price with promo: " + this.getPrice_promo() + "\n");
		return cad;
	}

}
