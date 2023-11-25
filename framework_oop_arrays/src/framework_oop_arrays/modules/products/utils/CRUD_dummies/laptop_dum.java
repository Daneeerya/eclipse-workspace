package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.classes.date_object;

public class laptop_dum extends product_dum {

//	Constructor

	public laptop_dum(int stock, float weight, float price, String iD, date_object purchaseDate) {
		super(stock, weight, price, iD, purchaseDate);

	}

//	Constructor de clau primaria
	public laptop_dum(String ID) {
		super(ID);
	}

//	Setters 

	// Functions

	@Override
	public String toString() {
		String cad = "";
		cad = cad + ("ID: " + super.getID() + "\n");
		cad = cad + ("Stock: " + super.getStock() + "\n");
		cad = cad + ("Weight: " + super.getWeight() + "\n");
		cad = cad + ("Price: " + super.getPrice() + "\n");
		cad = cad + ("Purchase Date: " + super.getpurchaseDate() + "\n");

		return cad;
	}

}
