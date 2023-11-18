package modules.products.classes;

import classes.date_object;

	public abstract class product {
		private int stock;
		private float weight;
		private float price;
		private String ID_prod;
		private date_object creationDate;
		private date_object purchaseDate;
		private date_object deliveryDate;
		private date_object returnDate;
		private date_object return_Purchase_Date;
		private date_object iniPromoDate;
		private date_object endPromoDate;

		
//		creation
		//fecha pidepurchaseDate (); la demane i valide
		//fecha pidefechaentrega (fcompra) --> la fecha de entrega valida i que hi haja 1 dia de difereia (compara fecha + resta)nc
		//fecha pidereturnDate (frecogida) --> diferencia de __ dies
		//fecha pidereturn_Purchase_Date (fcompra) --> diferencia de x dies
		//fecha pidefechainipromo (ffinpromo) --> diferencia de x dies
		//fecha pidefechainipromo (ffinpromo, fcompra) 

//		Constructor
		public product(int stock, float weight, float price, String iD_prod, date_object purchaseDate, 
				date_object deliveryDate, date_object returnDate,  date_object iniPromoDate, date_object endPromoDate) {
			super();
			this.stock = stock;
			this.weight = weight;
			this.price = price;
			this.ID_prod = iD_prod;
			this.purchaseDate = purchaseDate;
			this.deliveryDate = deliveryDate;
			this.returnDate = returnDate;
//			this.return_Purchase_Date  = return_Purchase_Date;
			this.iniPromoDate = iniPromoDate;
			this.endPromoDate = endPromoDate;
		}
//		date_object return_Purchase_Date,

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
		
		public String getID_prod() {
			return ID_prod;
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
		
		public date_object getiniPromoDate() {
			return iniPromoDate;
		}
		
		public date_object getendPromoDate() {
			return endPromoDate;
		}
		
//		Setters
		public void setStock(int stock) {
			this.stock = stock;
		}

		public void setWeight(float weight) {
			this.weight = weight;
		}
		
		public void setPrice(float price) {
			this.price = price;
		}

		public void setID_prod(String iD_prod) {
			this.ID_prod = iD_prod;
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

		public void setiniPromoDate(date_object iniPromoDate) {
			this.iniPromoDate = iniPromoDate;
		}

		public void setendPromoDate(date_object endPromoDate) {
			this.endPromoDate = endPromoDate;
		}
		
	// To string
		@Override
		public abstract String toString ();
	}
