package framework_oop_arrays.modules.products.utils;

import javax.swing.JOptionPane;

import framework_oop_arrays.utils.insert_data;
import framework_oop_arrays.utils.validators;

public class core_product {
	public static String ID(String mensaje, String titulo) {
		String ID = "", aux = "", caracteres = "TRWAGMYFPDXBNJZSQVHLCKET";
		int revisionletra = 0;
		boolean resultado = false;
		int number = 0, module = 0;
		char character = ' ', control = ' ';

		do {

			ID = insert_data.insert_id("Insert the ID", "ID");
			aux = "";
			for (int i = 0; i < 3; i++) {
				aux += ID.charAt(i);
			}
			character = ID.charAt(4);
			number = Integer.parseInt(aux);
			module = number % 23;
			control = caracteres.charAt(module);
			revisionletra = caracteres.indexOf(character);
			if (revisionletra != 1) {
				resultado = true;
			} else {
				JOptionPane.showMessageDialog(null, "Error de confirmación", "Error", JOptionPane.ERROR_MESSAGE);

				resultado = false;
			}
		} while (resultado == false);

		return ID;
	}

	public static float pide_stock(String mensaje, String titulo) {
		float stock = 0.0f;
		stock = validators.valida_float("Enter a new Stock", "Stock");
		return stock;
	}
}
