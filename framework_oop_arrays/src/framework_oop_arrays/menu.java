package framework_oop_arrays;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD;
import framework_oop_arrays.modules.products.utils.CRUD_array.functions_create;
import framework_oop_arrays.modules.products.utils.CRUD_array.functions_delete;
import framework_oop_arrays.modules.products.utils.CRUD_array.functions_print;
import framework_oop_arrays.modules.products.utils.CRUD_array.functions_read;
import framework_oop_arrays.modules.products.utils.CRUD_array.functions_update;
import framework_oop_arrays.utils.menus;

public class menu {
	public static laptop L = null;
	public static smartphone S = null;
	public static accessory A = null;

	public static void menu() {
		int option = 0, option1 = 0;
		String[] mother = { "Laptop", "Smartphone", "Accessory", "Exit" };
		String[] child = { "Create", "Read", "Update", "Delete", "Print", "Return" };
		do {
			option = menus.menu(mother, " What option do you choose?", "Primary Menu");
			switch (option) {
			case 0: // Laptop
				do {
					option1 = menus.menu(child, " What option do you choose?", "CRUD Menu");
					switch (option1) { // CRUD menu
					// Create Laptop
					case 0:
						functions_create.create_laptop(L);
						break;
					// Read laptop
					case 1:
						functions_read.read_laptop(L);
						// Update laptop
					case 2:
						functions_update.update_laptop(L);
						break;
					// Delete laptop
					case 3:
						functions_delete.delete_laptop(L);
						break;
					// Print laptop
					case 4:
						functions_print.read_laptop(L);
						break;
					case 5: // Exit
						break;
					default:
						option1 = 5;
						break;
					}
				} while (option1 != 5);
				break;
			case 1: // Smartphone
				do {
					option1 = menus.menu(child, " What option do you choose?", "CRUD Menu");
					switch (option1) { // CRUD menu
					case 0:// Create Smartphone
						functions_create.create_smartphone(S);
						break;
					case 1: // Read Smartphone
						functions_print.read_smartphone(S);
						break;
					case 2: // Update Smartphone
						functions_update.update_smartphone(S);
						break;
					case 3: // Delete Smartphone
						functions_delete.delete_smartphone(S);
						break;
					case 4: // Print Smartphone
						if (menu.S == null) {
							JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							CRUD.read_all(menu.S);
						}
						break;
					case 5: // Exit
						break;
					default:
						option1 = 5;
						break;
					}
				} while (option1 != 5);
				break;
			case 2: // Accessory
				do {
					option1 = menus.menu(child, " What option do you choose?", "CRUD Menu");
					switch (option1) { // CRUD menu
					case 0:// Create accessory
						functions_create.create_accessory(A);
						break;
					case 1: // Read accessory
						functions_print.read_accessory(A);
						break;
					case 2: // Update accessory
						functions_update.update_accessory(A);
						break;
					case 3: // Delete accessory
						functions_delete.delete_accessory(A);
						break;
					case 4: // Print Accessory
						if (menu.A == null) {
							JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							CRUD.read_all(menu.A);
						}
						break;
					case 5: // Return
						break;
					default:
						option = 5;
						break;
					}
				} while (option1 != 5);
				break;
			case 3: // Exit
				JOptionPane.showMessageDialog(null, "Thanks for use the aplication");
				break;
			default:
				option = 3;
				break;
			}

		} while (option != 3);

	}
}