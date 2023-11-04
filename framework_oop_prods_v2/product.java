package framework_oop_prods_sincad;

public abstract class product {
	private int stock;
	private float weight;
	private float price;
	private String ID_prod;
	
	
	
//	Constructor
	public product(int stock, float weight, float price, String iD_prod) {
		super();
		this.stock = stock;
		this.weight = weight;
		this.price = price;
		this.ID_prod = iD_prod;
	}

//	Getters
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

//	Setters
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
		ID_prod = iD_prod;
	}

// To string
	@Override
	public abstract String toString ();
}
