package framework_oop_arrays.modules.products.utils.CRUD_array;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;

public class functions_update {
	public static void update_laptop(laptop l1) {
		String cad = "";
		int location = -1;
		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			l1 = CRUD_arrays.ask_laptopID();
			location = functions_find.find_laptop(l1); // Busca el producte
			if (location != -1) {
				l1 = Singleton.productlaptop.get(location); // L'extrau del ArrayList
				CRUD_arrays.updateProduct(l1); // Actualitza el producte
				Singleton.productlaptop.set(location, l1); // Actualitza el Singleton
			} else {
				JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void update_smartphone(smartphone S1) {
		String cad = "";
		int location = -1;
		if (Singleton.productsmartphone.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			S1 = CRUD_arrays.ask_smartphoneID();
			location = functions_find.find_smartphone(S1); // Busca el producte
			if (location != -1) {
				S1 = Singleton.productsmartphone.get(location); // L'extrau del ArrayList
				CRUD_arrays.updateProduct(S1); // Actualitza el producte
				Singleton.productsmartphone.set(location, S1); // Actualitza el Singleton
			} else {
				JOptionPane.showMessageDialog(null, "You must create the 0 first!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void update_accessory(accessory A1) {

	}
}
