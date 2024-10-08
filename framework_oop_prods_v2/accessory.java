package framework_oop_prods_v2;

public class accessory extends product {
// Atributes
	private float price_last_units;
	private float price_sales;
	private String f_sales;
	private String type_of_product;
	
//	Constructor
	public accessory(int stock, float weight, String iD_prod, float price, float price_last_units, float price_sales,
			String f_sales, String type_of_product) {
		super(stock, weight, price, iD_prod);
		this.price_last_units = price_last_units;
		this.price_sales = price_sales;
		this.f_sales = f_sales;
		this.type_of_product = type_of_product;
	}

//	Getters

	public float getPrice_last_units() {
		return price_last_units;
	}

	public float getPrice_sales() {
		return price_sales;
	}

	public String getF_sales() {
		return f_sales;
	}

	public String getType_of_product() {
		return type_of_product;
	}
	
//	Setters
	public void setPrice_last_units(float price_last_units) {
		this.price_last_units = price_last_units;
	}

	public void setPrice_sales(float price_sales) {
		this.price_sales = price_sales;
	}

	public void setF_sales(String f_sales) {
		this.f_sales = f_sales;
	}
	
	public void setType_of_product(String type_of_product) {
		this.type_of_product = type_of_product;
	}

	@Override
	public String toString() {
		String cad = "";
		cad = cad + ("ID: " + super.getID_prod() + "\n");
		cad = cad + ("Stock: " + super.getStock() + "\n");
		cad = cad + ("Weight: "+ super.getWeight() + "\n");
		cad = cad + ("Type Of Product: "+ this.getType_of_product() + "\n");
		cad = cad + ("Price Last Units: "+ this.getPrice_last_units() + "\n");
		cad = cad + ("Price Sales: "+ this.getPrice_sales() + "\n");
		cad = cad + ("Date of Sales: "+ this.getF_sales() + "\n");
		return cad;
	}


	

}