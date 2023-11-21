package module_oop.modules.products.utils;

import module_oop.utils.menus;

public class special_prod {
	public static String comboBrand() {
		String brand = "";
		String[] tipo = { "Samsung", "Apple" };
		String field = menus.menucombo(tipo, " What brand do you want ?", "Brand");
		switch (field) {
		case "Samsung":
			brand = "Samsung";
			break;
		case "Apple":
			brand = "A";
			break;
		}
		return brand;
	}
}
