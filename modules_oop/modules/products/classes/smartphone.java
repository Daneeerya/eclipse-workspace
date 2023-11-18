package modules.products.classes;

import classes.date_object;

public class smartphone extends product {
	// Atributes
		private int n_days_last_units;
		private int n_sales_days;
		private String brand;

//		Constructor
		public smartphone(int stock, float weight, float price, String iD_prod,
				date_object purchaseDate, date_object deliveryDate, date_object returnDate,
				 date_object iniPromoDate, date_object endPromoDate, int n_days_last_units,
				int n_sales_days, String brand) {
			super(stock, weight, price, iD_prod, purchaseDate, deliveryDate, returnDate, 
					iniPromoDate, endPromoDate);
			this.n_days_last_units = n_days_last_units;
			this.n_sales_days = n_sales_days;
			this.brand = brand;
		}
	//date_object return_Purchase_Date,
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


//		To String
		@Override
		public String toString() {
			String cad = "";
			cad = cad + ("ID: " + super.getID_prod() + "\n");
			cad = cad + ("Stock: " + super.getStock() + "\n");
			cad = cad + ("Weight: " + super.getWeight() + "\n");
			cad = cad + ("Price: " + super.getPrice() + "\n");
			cad = cad + ("Number days with last units: " + this.getN_days_last_units() + "\n");
			cad = cad + ("Number with sales days: " + this.getN_sales_days() + "\n");
			cad = cad + ("Brand: " + this.getBrand() + "\n");
			return cad;
		}

	}

