package framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.functions_find;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD_arrays_dummies;

public class functions_create_dummies {
	public static void create_laptop() {
		laptop l1 = null;
		int location = -1;
		l1 = CRUD_arrays_dummies.ask_laptopID(); // Demane el ID del laptop
		location = functions_find.find_product(l1); // En el find busque el laptop
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Cannot save to arraylist because this laptop already exists", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} else {

			l1 = CRUD_arrays_dummies.ask_laptop_dummies(5);
			JOptionPane.showMessageDialog(null, "Laptop create correctly", "INFORMATION",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void create_smartphone() {
		smartphone S1 = null;
		int location = -1;
		S1 = CRUD_arrays_dummies.ask_smartphoneID(); // Demane el ID del smartphone
		location = functions_find.find_product(S1); // En el find busque el smartphone
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Cannot save to arraylist because this smartphone already exists",
					"ERROR", JOptionPane.ERROR_MESSAGE);
		} else {

			S1 = CRUD_arrays_dummies.ask_smartphone_dummies(5);
			JOptionPane.showMessageDialog(null, "smartphone create correctly", "INFORMATION",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void create_accessory() {
		accessory A1 = null;
		int location = -1;
		A1 = CRUD_arrays_dummies.ask_accessoryID(); // Demane el ID del accessory
		location = functions_find.find_product(A1); // En el find busque el accessory
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Cannot save to arraylist because this accessory already exists",
					"ERROR", JOptionPane.ERROR_MESSAGE);
		} else {

			A1 = CRUD_arrays_dummies.ask_accessory_dummies(5);
			JOptionPane.showMessageDialog(null, "accessory create correctly", "INFORMATION",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
