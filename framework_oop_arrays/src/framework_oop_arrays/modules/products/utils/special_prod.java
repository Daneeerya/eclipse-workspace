package framework_oop_arrays.modules.products.utils;

import framework_oop_arrays.utils.menus;

public class special_prod {
	public static String comboBrand(String product) {
		String brand = "";
		String[] tipo = { "Samsung", "Apple" };
		String field = menus.menucombo(tipo, " What brand of " + product + " do you want ?", "Brand");
		switch (field) {
		case "Samsung":
			brand = "Samsung";
			break;
		case "Apple":
			brand = "Apple";
			break;
		}
		return brand;
	}

	public static String comboAccessory(String product) {
		String accessory = "";
		String[] tipo = { "Headphone", "Mouse", "Screen" };
		String field = menus.menucombo(tipo, " What accessory do you want ?", "accessory");
		switch (field) {
		case "Headphone":
			accessory = "Headphone";
			break;
		case "Mouse":
			accessory = "Mouse";
			break;
		case "Screen":
			accessory = "Screen";
			break;
		}
		return accessory;
	}
}
