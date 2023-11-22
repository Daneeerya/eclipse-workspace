package framework_oop_arrays.modules.products.utils;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.product;

public class functions_find {
	public static int find_product(product product) {
		for (int i = 0; i <= (Singleton.productlaptop.size() - 1); i++) {
			if ((Singleton.productlaptop.get(i).equals(product))) {
				return i;
			}
		}

		for (int i = 0; i <= (Singleton.productsmartphone.size() - 1); i++) {
			if ((Singleton.productsmartphone.get(i).equals(product))) {
				return i;
			}
		}
		for (int i = 0; i <= (Singleton.productaccessory.size() - 1); i++) {

			if ((Singleton.productaccessory.get(i).equals(product))) {
				return i;
			}
		}
		return -1;
	}
}
