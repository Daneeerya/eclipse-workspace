package framework_oop_prods;

public abstract class product {
	private int stock;
	private float weight;
	private float price;
	private String ID_prod;
	private date_object purchaseDate;
	private date_object deliveryDate;
	private date_object returnDate;
	private date_object return_Purchase_Date;
	private date_object iniPromoDate;
	private date_object endPromoDate;
	private float price_total;

//	Constructor
	public product(int stock, float weight, float price,float price_total, String iD_prod, date_object purchaseDate, 
			date_object deliveryDate, date_object returnDate, date_object return_Purchase_Date,  date_object iniPromoDate, date_object endPromoDate) {
		super();
		this.stock = stock;
		this.weight = weight;
		this.price = price;
		this.price_total = price_total;
		this.ID_prod = iD_prod;
		this.purchaseDate = purchaseDate;
		this.deliveryDate = deliveryDate;
		this.returnDate = returnDate;
		this.return_Purchase_Date  = return_Purchase_Date;
		this.iniPromoDate = iniPromoDate;
		this.endPromoDate = endPromoDate;
	}
//	date_object return_Purchase_Date,

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
	
	public float getPrice_total() {
		return price_total;
	}

	public String getID_prod() {
		return ID_prod;
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
	
	public void setPrice_total(float price_total) {
		this.price_total = price_total;
	}

	public void setID_prod(String iD_prod) {
		this.ID_prod = iD_prod;
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
