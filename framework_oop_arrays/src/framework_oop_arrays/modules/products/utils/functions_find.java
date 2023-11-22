package framework_oop_arrays.modules.products.utils;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;

public class functions_find {
	public static int find_laptop(laptop laptop) {
		for (int i = 0; i <= (Singleton.productlaptop.size() - 1); i++) {
			if ((Singleton.productlaptop.get(i).equals(laptop))) {
				return i;
			}
		}
		return -1;
	}

	public static int find_smartphone(smartphone smartphone) {
		for (int i = 0; i <= (Singleton.productsmartphone.size() - 1); i++) {
			if ((Singleton.productsmartphone.get(i).equals(smartphone))) {
				return i;
			}
		}
		return -1;
	}

	public static int find_accessory(accessory accessory) {
		for (int i = 0; i <= (Singleton.productaccessory.size() - 1); i++) {

			if ((Singleton.productaccessory.get(i).equals(accessory))) {
				return i;
			}
		}
		return -1;
	}
}
