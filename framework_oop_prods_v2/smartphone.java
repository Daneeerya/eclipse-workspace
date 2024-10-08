package framework_oop_prods_sincad;

public class smartphone extends product {
// Atributes
	private int n_days_last_units;
	private int n_sales_days;
	private String brand;
	private String date_last_units;
	
	public smartphone(int stock, float weight, float price, String iD_prod,  int n_days_last_units, int n_sales_days, 
			String brand, String date_last_units) {
		super(stock, weight, price, iD_prod);
		this.n_days_last_units = n_days_last_units;
		this.n_sales_days = n_sales_days;
		this.brand = brand;
		this.date_last_units = date_last_units;
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
	
	public String getDate_last_units() {
		return date_last_units;
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


	public void setDate_last_units(String date_last_units) {
		this.date_last_units = date_last_units;
	}

//	To String
	@Override
	public String toString() {
		String cad = "";
		cad = cad + ("ID: " + super.getID_prod() + "\n");
		cad = cad + ("Stock: " + super.getStock() + "\n");
		cad = cad + ("Weight: "+ super.getWeight() + "\n");
		cad = cad + ("Price: "+ super.getPrice() + "\n");
		cad = cad + ("Number days with last units: "+ this.getN_days_last_units() + "\n");
		cad = cad + ("Number with sales days: "+ this.getN_sales_days() + "\n");
		cad = cad + ("Brand: "+ this.getBrand() + "\n");
		cad = cad + ("Date with last units: "+ this.getDate_last_units() + "\n");
		return cad;	}
	
	
}
