package framework_oop_arrays.modules.products.utils.CRUD_array;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;
import framework_oop_arrays.utils.menus;

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
				JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
						JOptionPane.ERROR_MESSAGE);
			} else {
				l1 = Singleton.productlaptop.get(location);
				String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date",
						"Return Date", "Start Promo Date", "End Promo Date", "N Days with promo", "Price Promotion" };
				attrs = menus.menu(opt_attrs, "What attribute do you want to read?", "Attributes");
				switch (attrs) {
				case 0: // Stock

					JOptionPane.showMessageDialog(null, l1.getStock());

					break;
				case 1:
					location = -1;

					JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Errorempty",
							JOptionPane.ERROR_MESSAGE);

					break;
				}
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
