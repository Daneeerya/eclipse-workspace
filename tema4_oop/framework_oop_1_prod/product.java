package framework_oop_1_prod;

public class product {
	private int stock ;
	private float weight ;
	private String ID_prod ;

	
//Constructor
	public product(int stock, float weight, String iD_prod) {
		super();
		this.stock = stock;
		this.weight = weight;
		this.ID_prod = iD_prod;
	}

	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(double newWeight) {
		this.weight = (float) newWeight;
	}


	public String getID_prod() {
		return ID_prod;
	}


	public void setID_prod(String iD_prod) {
		this.ID_prod = iD_prod;
	}


	@Override
	public String toString() {
		return "product [stock=" + stock + ", weight=" + weight + ", ID_prod=" + ID_prod + "]";
	}
	
}
