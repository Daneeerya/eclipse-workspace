package modules.products.classes;

import classes.date_object;

public class laptop extends product {

		private int n_days_with_promo;
		private float price_promo;


//		Constructor

		public laptop(int stock, float weight, float price, String iD_prod,
				date_object purchaseDate, date_object deliveryDate, date_object returnDate,
				 date_object iniPromoDate, date_object endPromoDate, int n_days_with_promo,
				float price_promo) {
			super(stock, weight, price, iD_prod, purchaseDate, deliveryDate, returnDate,
					iniPromoDate, endPromoDate);
			this.n_days_with_promo = n_days_with_promo;
			this.price_promo = price_promo;
		}
		
//		date_object return_Purchase_Date,

	//Getters 
		public int getN_days_with_promo() {
			return n_days_with_promo;
		}

		public float getPrice_promo() {
			return price_promo;
		}


//		Setters 
		public void setN_days_with_promo(int n_days_with_promo) {
			this.n_days_with_promo = n_days_with_promo;
		}

		public void setPrice_promo(float price_promo) {
			this.price_promo = price_promo;
		}


	//To String float price_promo,String creation_date, String promo_date)

		@Override
		public String toString() {
			String cad = "";
			cad = cad + ("ID: " + super.getID_prod() + "\n");
			cad = cad + ("Stock: " + super.getStock() + "\n");
			cad = cad + ("Weight: " + super.getWeight() + "\n");
			cad = cad + ("Price: " + super.getPrice() + "\n");
			cad = cad + ("Number days with promo: " + this.getN_days_with_promo() + "\n");
			cad = cad + ("Price with promo: " + this.getPrice_promo() + "\n");
			return cad;
		}
	}

