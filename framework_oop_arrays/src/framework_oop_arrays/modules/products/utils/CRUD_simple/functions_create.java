package framework_oop_arrays.modules.products.utils.CRUD_simple;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.functions_find;

public class functions_create {
	public static void create_laptop(laptop l1) {
		String cad = "";
		int location = -1;
		l1 = CRUD_arrays.ask_laptopID(); // Demane el ID del laptop
		location = functions_find.find_product(l1); // En el find busque el laptop
//		location = functions_find.find_product(S1);
		if (location != -1) {
			cad = "Cannot save to arraylist because this product already exists";
		} else {
			l1 = CRUD_arrays.ask_laptop();
			Singleton.productlaptop.add(l1);
			cad = "Laptop create correctly";
		}
		JOptionPane.showMessageDialog(null, cad, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public static void create_smartphone(smartphone S1) {
		String cad = "";
		int location = -1;
		S1 = CRUD_arrays.ask_smartphoneID(); // Demane el ID del smartphone
		location = functions_find.find_product(S1); // En el find busque el smartphone
		if (location != -1) {
			cad = "Cannot save to arraylist because this product already exists";
		} else {
			S1 = CRUD_arrays.ask_smartphone();
			Singleton.productsmartphone.add(S1);
			cad = "smartphone create correctly";
		}
		JOptionPane.showMessageDialog(null, cad, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public static void create_accessory(accessory A1) {
		String cad = "";
		int location = -1;
		A1 = CRUD_arrays.ask_accessoryID();
		location = functions_find.find_product(A1);
		if (location != -1) {
			cad = "Cannot save to arraylist because this product already exists";
		} else {
			A1 = CRUD_arrays.ask_accessory();
			Singleton.productaccessory.add(A1);
			cad = "Accessory create correctly";
		}
		JOptionPane.showMessageDialog(null, cad, "Informative", JOptionPane.INFORMATION_MESSAGE);
	}
}
