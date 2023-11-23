package framework_oop_arrays.modules.products.utils;

import java.util.ArrayList;

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

	public static ArrayList<String> find_id() {
		ArrayList<String> products = new ArrayList<>();

		for (int i = 0; i <= (Singleton.productlaptop.size() - 1); i++) {
			products.add(Singleton.productlaptop.get(i).getID());
		}

		for (int i = 0; i <= (Singleton.productsmartphone.size() - 1); i++) {
			products.add(Singleton.productsmartphone.get(i).getID());
		}

		for (int i = 0; i <= (Singleton.productaccessory.size() - 1); i++) {
			products.add(Singleton.productaccessory.get(i).getID());
		}
		return products;
	}

}
