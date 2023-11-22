package framework_oop_arrays.modules.products.utils.CRUD_simple;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;

public class functions_print {
	public static void print_laptop(laptop l1) {
		int location = -1;
		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			l1 = CRUD_arrays.ask_laptopID();
			location = functions_find.find_product(l1);
			if (location != -1) {
				l1 = Singleton.productlaptop.get(location);
				JOptionPane.showMessageDialog(null, l1.toString());
			} else {
				JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void print_smartphone(smartphone S1) {
		int location = -1;
		if (Singleton.productsmartphone.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			S1 = CRUD_arrays.ask_smartphoneID();
			location = functions_find.find_product(S1);
			if (location != -1) {
				S1 = Singleton.productsmartphone.get(location);
				JOptionPane.showMessageDialog(null, S1.toString());
			} else {
				JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error print smartphone",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void print_accessory(accessory A1) {
		int location = -1;
		if (Singleton.productaccessory.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			A1 = CRUD_arrays.ask_accessoryID();
			location = functions_find.find_product(A1);
			if (location != -1) {
				A1 = Singleton.productaccessory.get(location);
				JOptionPane.showMessageDialog(null, A1.toString());
			} else {
				JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Errorempty",
						JOptionPane.ERROR_MESSAGE);

			}
		}
	}
}
