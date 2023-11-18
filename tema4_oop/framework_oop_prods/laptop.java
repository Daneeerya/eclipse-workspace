package framework_oop_prods;

public class laptop extends product {

	private int n_days_with_promo;
	private boolean isPromo;


//	Constructor

	public laptop(int stock, float weight, float price, float price_total, String iD_prod,
			date_object purchaseDate, date_object deliveryDate, date_object returnDate, date_object return_Purchase_Date,
			 date_object iniPromoDate, date_object endPromoDate, int n_days_with_promo,
			boolean isPromo) {
		super(stock, weight, price, price_total, iD_prod, purchaseDate, deliveryDate, returnDate,return_Purchase_Date,
				iniPromoDate, endPromoDate);
		this.n_days_with_promo = n_days_with_promo;
		this.isPromo = isPromo;
	}
	
//	date_object return_Purchase_Date,

//Getters 
	public int getN_days_with_promo() {
		return n_days_with_promo;
	}

	public boolean getisPromo() {
		return isPromo;
	}


//	Setters 
	public void setN_days_with_promo(int n_days_with_promo) {
		this.n_days_with_promo = n_days_with_promo;
	}

	public void setisPromo(boolean isPromo) {
		this.isPromo = isPromo;
	}


//To String float isPromo,String creation_date, String promo_date)
// purchaseDate, deliveryDate, returnDate, iniPromoDate, endPromoDate)
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
		cad = cad + ("Number days with promo: " + this.getN_days_with_promo() + "\n");
		cad = cad + ("Price with promo: " + this.getisPromo() + "\n");
		return cad;
	}
}
