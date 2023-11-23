package framework_oop_arrays.modules.products.utils.CRUD_simple;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;
import framework_oop_arrays.modules.products.utils.special_prod;

public class functions_update {
	public static void update_laptop() {
		int location = -1;

		if (Singleton.productlaptop.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			String selectedID = special_prod.ComboIDs(); // Obtener el ID como String
			System.out.println("Ask ID" + selectedID);

			// Crear una instancia de laptop con el ID seleccionado
			laptop l1 = new laptop(selectedID);

			location = functions_find.find_product(l1); // Buscar el producto por la instancia de laptop

			System.out.println("Ask location" + location);

			if (location != -1) {
				laptop updatedLaptop = Singleton.productlaptop.get(location); // Extraer del ArrayList
				CRUD_arrays.updateProduct(updatedLaptop); // Actualizar el producto
				Singleton.productlaptop.set(location, updatedLaptop); // Actualizar el Singleton
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
