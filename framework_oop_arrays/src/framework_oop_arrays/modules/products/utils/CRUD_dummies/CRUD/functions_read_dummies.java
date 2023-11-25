package framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;
import framework_oop_arrays.modules.products.utils.special_prod;

public class functions_read_dummies {
	public static void read_laptop_dummies(laptop l1) {
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
}
