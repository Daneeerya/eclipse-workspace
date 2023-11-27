package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.product;

public class functions_find_dummies {
	public static int find_product_dum(product product_dum) {
		for (int i = 0; i <= (Singleton.productlaptop.size() - 1); i++) {
			if ((Singleton.productlaptop.get(i).equals(product_dum))) { // Singleton.productlaptop_dummies.get(i)
																		// es el producte (correcte)
																		// product_dum es unicament el ID
				return i;
			}
			System.out.println("GET I" + Singleton.productlaptop.get(i));
			System.out.println("PRDUM" + product_dum);

		}

		for (int i = 0; i <= (Singleton.productsmartphone.size() - 1); i++) {
//			product_dum =  CRUD_arrays_dummies.ask_smartphone();
			if ((Singleton.productsmartphone.get(i).equals(product_dum))) {
				return i;
			}
		}
		for (int i = 0; i <= (Singleton.productaccessory.size() - 1); i++) {
//			product_dum =  CRUD_arrays_dummies.ask_accessory();
			if ((Singleton.productaccessory.get(i).equals(product_dum))) {
				return i;
			}
		}
		return -1;
	}

}
