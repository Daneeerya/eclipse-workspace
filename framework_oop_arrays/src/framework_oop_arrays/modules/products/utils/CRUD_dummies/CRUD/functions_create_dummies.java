package framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD_arrays_dummies;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.functions_find_dummies;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.laptop_dum;

public class functions_create_dummies {
	public static void create_laptop(laptop_dum l1) {
		int location = -1;
		location = functions_find_dummies.find_product(l1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "You must create the laptop first!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			l1 = CRUD_arrays_dummies.carregarDummies(2);
			Singleton.productlaptop_dummies.add(l1);
		}
	}
}
