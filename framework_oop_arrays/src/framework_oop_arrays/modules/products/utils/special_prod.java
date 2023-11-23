package framework_oop_arrays.modules.products.utils;

import javax.swing.JOptionPane;

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

//	public static String ComboIDs() {
//		String[] tipo = (String[]) functions_find.find_id().toArray();
//		String field = menus.menucombo(tipo, " What ID do you want ?", "ID");
//
//		return field;
//	}

	// -------------------------------------MENU-------------------------------------
	// Menu using combobox-------------------------------------
	public static String menucombo(String[] options, String message, String title) {
		Object option = null;

		option = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options,
				options[0]);

		return option.toString();
	}

	public static String ComboIDs() {
		Object[] products = functions_find.find_id().toArray();
		String[] tipo = new String[products.length];

		for (int i = 0; i < products.length; i++) {
			tipo[i] = String.valueOf(products[i]);
		}

		String field = menus.menucombo(tipo, " What ID do you want ?", "ID");

		return field;
	}

}
