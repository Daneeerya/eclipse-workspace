package framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.functions_find;
import framework_oop_arrays.modules.products.utils.special_prod;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD_arrays_dummies;

public class functions_update_dummies {
	public static void update_laptop() {
		int location = -1;
		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Informative",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			String IDs = special_prod.ComboIDs(); // Obtener el ID como String
			laptop l1 = new laptop(IDs);
			location = functions_find.find_product(l1);
			if (location != -1) {
				laptop updatedLaptopDum = Singleton.productlaptop.get(location);
				CRUD_arrays_dummies.updateProduct(updatedLaptopDum);
				Singleton.productlaptop.set(location, l1);
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Informative",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public static void update_smartphone() {
		int location = -1;
		if (Singleton.productsmartphone.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Informative",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			String IDs = special_prod.ComboIDs(); // Obtener el ID como String
			smartphone S1 = new smartphone(IDs);
			location = functions_find.find_product(S1);
			if (location != -1) {
				smartphone updatedsmartphoneDum = Singleton.productsmartphone.get(location);
				CRUD_arrays_dummies.updateProduct(updatedsmartphoneDum);
				Singleton.productsmartphone.set(location, S1);
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Informative",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public static void update_accessory() {
		int location = -1;
		if (Singleton.productaccessory.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Informative",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			String IDs = special_prod.ComboIDs(); // Obtener el ID como String
			accessory A1 = new accessory(IDs);
			location = functions_find.find_product(A1);
			if (location != -1) {
				accessory updatedaccessoryDum = Singleton.productaccessory.get(location);
				CRUD_arrays_dummies.updateProduct(updatedaccessoryDum);
				Singleton.productaccessory.set(location, A1);
			} else {
				JOptionPane.showMessageDialog(null,
						"You deleted this product before, now you can't recover it, create it again", "Informative",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
