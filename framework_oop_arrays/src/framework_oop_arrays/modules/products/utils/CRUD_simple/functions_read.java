package framework_oop_arrays.modules.products.utils.CRUD_simple;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;
import framework_oop_arrays.modules.products.utils.special_prod;

public class functions_read {
	public static void read_laptop(laptop l1) {
		int location = -1;
		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			l1 = new laptop(special_prod.ComboIDs());
//			l1 = CRUD_arrays.ask_laptopID();
			location = functions_find.find_product(l1);
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
		int location = -1;
		if (Singleton.productsmartphone.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			S1 = new smartphone(special_prod.ComboIDs());
			location = functions_find.find_product(S1);
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
		int location = -1;
		if (Singleton.productaccessory.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			A1 = new accessory(special_prod.ComboIDs());
			location = functions_find.find_product(A1);
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
