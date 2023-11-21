package framework_oop_arrays.modules.products.utils.CRUD_array;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;

public class functions_print {
	public static void read_laptop(laptop l1) {
		int location = -1;
		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			l1 = CRUD_arrays.ask_laptopID();
			location = functions_find.find_laptop(l1);
			if (location != -1) {
				l1 = Singleton.productlaptop.get(location);
				JOptionPane.showMessageDialog(null, l1.toString());
			} else {
				JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
						JOptionPane.ERROR_MESSAGE);

			}
		}
	}

	public static void read_smartphone(smartphone S1) {
		// TODO Auto-generated method stub

	}

	public static void read_accessory(accessory A1) {
		// TODO Auto-generated method stub

	}
}
