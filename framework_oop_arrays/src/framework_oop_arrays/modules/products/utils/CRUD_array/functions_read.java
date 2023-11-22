package framework_oop_arrays.modules.products.utils.CRUD_array;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;

public class functions_read {
	public static void read_laptop(laptop l1) {
		int menu = 0, location = -1;
		String cad = "";
		int attrs = 0;

		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			l1 = CRUD_arrays.ask_laptopID();
			location = functions_find.find_laptop(l1);
			if (location == -1) {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				l1 = Singleton.productlaptop.get(location); // L'extrau del ArrayList
				CRUD_arrays.readProduct(l1);
			}
		}
	}

	public static void read_smartphone(smartphone S1) {
		int menu = 0, location = -1;
		String cad = "";
		int attrs = 0;

		if (Singleton.productsmartphone.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			S1 = CRUD_arrays.ask_smartphoneID();
			location = functions_find.find_smartphone(S1);
			if (location == -1) {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				S1 = Singleton.productsmartphone.get(location); // L'extrau del ArrayList
				CRUD_arrays.readProduct(S1);
			}
		}

	}

	public static void read_accessory(accessory A1) {
		int menu = 0, location = -1;
		String cad = "";
		int attrs = 0;

		if (Singleton.productaccessory.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			A1 = CRUD_arrays.ask_accessoryID();
			location = functions_find.find_accessory(A1);
			if (location == -1) {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				A1 = Singleton.productaccessory.get(location); // L'extrau del ArrayList
				CRUD_arrays.readProduct(A1);
			}
		}

	}
}
