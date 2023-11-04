package framework_oop_prods_v2;

public class laptop extends product {
	
	private int n_days_with_promo;
	private float price_promo;
	private String creation_date;
	private String promo_date;
	
	
	
//	Constructor
public laptop(int stock, float weight, float price, String iD_prod, int n_days_with_promo, float price_promo,
		String creation_date, String promo_date) {
	super(stock, weight, price, iD_prod);
	this.n_days_with_promo = n_days_with_promo;
	this.price_promo = price_promo;
	this.creation_date = creation_date;
	this.promo_date = promo_date;
}

//Getters 
public int getN_days_with_promo() {
	return n_days_with_promo;
}

public float getPrice_promo() {
	return price_promo;
}

public String getCreation_date() {
	return creation_date;
}

public String getPromo_date() {
	return promo_date;
}

//	Setters 
public void setN_days_with_promo(int n_days_with_promo) {
	this.n_days_with_promo = n_days_with_promo;
}

public void setPrice_promo(float price_promo) {
	this.price_promo = price_promo;
}

public void setCreation_date(String creation_date) {
	this.creation_date = creation_date;
}

public void setPromo_date(String promo_date) {
	this.promo_date = promo_date;
}

//To String float price_promo,String creation_date, String promo_date)

	@Override
	public String toString() {
		String cad = "";
		cad = cad + ("ID: " + super.getID_prod() + "\n");
		cad = cad + ("Stock: " + super.getStock() + "\n");
		cad = cad + ("Weight: "+ super.getWeight() + "\n");
		cad = cad + ("Price: "+ super.getPrice() + "\n");
		cad = cad + ("Number days with promo: "+ this.getN_days_with_promo() + "\n");
		cad = cad + ("Price with promo: "+ this.getPrice_promo() + "\n");
		cad = cad + ("Creation date: "+ this.getCreation_date() + "\n");
		cad = cad + ("Date with last units: "+ this.getPromo_date() + "\n");
		return cad;	}
}
