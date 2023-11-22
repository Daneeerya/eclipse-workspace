package framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_arrays;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.functions_find_dummies;

public class functions_create_dummies {
	public static void create_laptop(laptop l1) {
		String cad = "";
		int location = -1;
		l1 = CRUD_arrays.ask_laptopID(); // Demane el ID del laptop
		location = functions_find_dummies.find_accessory(l1); // En el find busque el laptop
		if (location != -1) {
			cad = "Cannot save to arraylist because laptop already exists";
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
		S1 = CRUD_arrays.ask_smartphoneID();
		location = functions_find.find_smartphone(S1);
		if (location != -1) {
			cad = "Cannot save to arraylist because smartphone already exists";
		} else {
			S1 = CRUD_arrays.ask_smartphone();
			Singleton.productsmartphone.add(S1);
			cad = "Smartphone create correctly";
		}
	}

	public static void create_accessory(accessory A1) {
		String cad = "";
		int location = -1;
		A1 = CRUD_arrays.ask_accessoryID();
		location = functions_find.find_accessory(A1);
		if (location != -1) {
			cad = "Cannot save to arraylist because accessory already exists";
		} else {
			A1 = CRUD_arrays.ask_accessory();
			Singleton.productaccessory.add(A1);
			cad = "Accessory create correctly";
		}
		JOptionPane.showMessageDialog(null, cad, "Informative", JOptionPane.INFORMATION_MESSAGE);
	}
}
