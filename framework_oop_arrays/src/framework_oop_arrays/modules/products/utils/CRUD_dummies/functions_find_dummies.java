package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.modules.products.classes.Singleton;

public class functions_find_dummies {
	public static int find_product(laptop_dum l1) {
		for (int i = 0; i <= (Singleton.productlaptop.size() - 1); i++) {
			l1 = CRUD_arrays_dummies.carregarDummies(i);
			if ((Singleton.productlaptop.get(i).equals(l1))) {
				return i;
			}
			System.out.println("I=" + i);
		}

		for (int i = 0; i <= (Singleton.productsmartphone.size() - 1); i++) {
//			product =  CRUD_arrays_dummies.ask_smartphone();
			if ((Singleton.productsmartphone.get(i).equals(l1))) {
				return i;
			}
		}
		for (int i = 0; i <= (Singleton.productaccessory.size() - 1); i++) {
//			product =  CRUD_arrays_dummies.ask_accessory();
			if ((Singleton.productaccessory.get(i).equals(l1))) {
				return i;
			}
		}
		return -1;
	}
}
