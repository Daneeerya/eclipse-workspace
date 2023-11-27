package framework_oop_arrays.modules.products.utils.CRUD_simple;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.functions_find;
import framework_oop_arrays.modules.products.utils.special_prod;

public class functions_delete {
	public static void delete_laptop() {
		int location = -1;
		laptop l1 = null;
		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the product first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			l1 = new laptop(special_prod.ComboIDs());
			location = functions_find.find_product(l1);
			if (location != -1) {
				Singleton.productlaptop.remove(location);
				JOptionPane.showMessageDialog(null, "Laptop DELETED", "Laptop " + l1, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void delete_smartphone() {
		smartphone S1 = null;
		int location = -1;
		if (Singleton.productsmartphone.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the product first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			S1 = new smartphone(special_prod.ComboIDs());
//			S1 = CRUD_arrays.ask_smartphoneID();
			location = functions_find.find_product(S1);
			if (location != -1) {
				Singleton.productsmartphone.remove(location);
				JOptionPane.showMessageDialog(null, "Smartphone DELETED", "Smartphone " + S1,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

	}

	public static void delete_accessory() {
		int location = -1;
		accessory A1 = null;
		if (Singleton.productaccessory.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the product first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			A1 = new accessory(special_prod.ComboIDs());
//			A1 = CRUD_arrays.ask_accessoryID();
			location = functions_find.find_product(A1);
			if (location != -1) {
				Singleton.productaccessory.remove(location);
				JOptionPane.showMessageDialog(null, "Accessory DELETED", "Accessory " + A1,
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
