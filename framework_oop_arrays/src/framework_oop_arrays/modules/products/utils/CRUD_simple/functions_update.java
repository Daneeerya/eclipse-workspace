package framework_oop_arrays.modules.products.utils.CRUD_simple;

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
		int location = 0;
		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			l1 = CRUD_arrays.ask_laptopID();
			System.out.println("Ask ID" + l1);
			location = functions_find.find_product(l1); // Busca el producte
			System.out.println("Ask location" + location);

			if (location != -1) {
				l1 = Singleton.productlaptop.get(location); // L'extrau del ArrayList
				CRUD_arrays.updateProduct(l1); // Actualitza el producte
				Singleton.productlaptop.set(location, l1); // Actualitza el Singleton
				location = -1;
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
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
			location = functions_find.find_product(S1); // Busca el producte
			if (location != -1) {
				S1 = Singleton.productsmartphone.get(location); // L'extrau del ArrayList
				CRUD_arrays.updateProduct(S1); // Actualitza el producte
				Singleton.productsmartphone.set(location, S1); // Actualitza el Singleton
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void update_accessory(accessory A1) {
		String cad = "";
		int location = -1;
		if (Singleton.productaccessory.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Errorempty",
					JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			A1 = CRUD_arrays.ask_accessoryID();
			location = functions_find.find_product(A1); // Busca el producte
			if (location != -1) {
				A1 = Singleton.productaccessory.get(location); // L'extrau del ArrayList
				CRUD_arrays.updateProduct(A1); // Actualitza el producte
				Singleton.productaccessory.set(location, A1); // Actualitza el Singleton
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
