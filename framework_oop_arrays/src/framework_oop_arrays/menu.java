package framework_oop_arrays;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD.functions_create_dummies;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD.functions_update_dummies;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_create;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_delete;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_print;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_read;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_update;
import framework_oop_arrays.utils.menus;

public class menu {

	public static void menu() {
		int option_prod = 0, option_dum = 0, option_CRUD = 0;
		String[] mother = { "Laptop", "Smartphone", "Accessory", "Exit" };
		String[] child = { "Create", "Read", "Update", "Delete", "Print", "Return" };
		String[] dummies_o_no = { "With dummies", "Without dummies", "Exit" };
		do {
			option_dum = menus.menu(dummies_o_no, " What option do you choose?", "Menu Dummies/no dummies");
			switch (option_dum) {
			case 0:
				do {
					option_prod = menus.menu(mother, " What option do you choose?", "Primary Menu");
					switch (option_prod) {
					case 0: // Laptop
						do {
							option_CRUD = menus.menu(child, " What option do you choose?", "CRUD Menu Dummies");
							switch (option_CRUD) { // CRUD menu DUMMIES
							// Create Laptop
							case 0:
								functions_create_dummies.create_laptop();
								break;
							// Read laptop
							case 1:
								functions_read.read_laptop();
								break;
							// Update laptop
							case 2:
								functions_update_dummies.update_laptop();
								break;
							// Delete laptop
							case 3:
								functions_delete.delete_laptop();
								break;
							// Print laptop
							case 4:
								functions_print.print_laptop();
								break;
							case 5: // Exit
								break;
							default:
								option_CRUD = 5;
								break;
							}
						} while (option_CRUD != 5);
						break;
					case 1: // Smartphone
						do {
							option_CRUD = menus.menu(child, " What option do you choose?", "CRUD Menu");
							switch (option_CRUD) { // CRUD menu
							case 0:// Create Smartphone
								functions_create_dummies.create_smartphone();
								break;
							case 1: // Read Smartphone
								functions_read.read_smartphone();
								break;
							case 2: // Update Smartphone
								functions_update_dummies.update_smartphone();
								break;
							case 3: // Delete Smartphone
								functions_delete.delete_smartphone();
								break;
							case 4: // Print Smartphone
								functions_print.print_smartphone();
								break;
							case 5: // Exit
								break;
							default:
								option_CRUD = 5;
								break;
							}
						} while (option_CRUD != 5);
						break;
					case 2: // Accessory
						do {
							option_CRUD = menus.menu(child, " What option do you choose?", "CRUD Menu");
							switch (option_CRUD) { // CRUD menu
							case 0:// Create accessory
								functions_create_dummies.create_accessory();
								break;
							case 1: // Read accessory
								functions_read.read_accessory();
								break;
							case 2: // Update accessory
								functions_update_dummies.update_accessory();
								break;
							case 3: // Delete accessory
								functions_delete.delete_accessory();
								break;
							case 4: // Print Accessory
								functions_print.print_accessory();
								break;
							case 5: // Return
								break;
							default:
								option_CRUD = 5;
								break;
							}
						} while (option_CRUD != 5);
						break;
					case 3: // Exit
						break;
					default:
						option_prod = 3;
						break;
					}

				} while (option_prod != 3);
				break;

			case 1: // Without dummies
				do {
					option_CRUD = menus.menu(mother, " What option do you choose?", "Primary Menu");
					switch (option_CRUD) {
					case 0: // Laptop
						do {
							option_CRUD = menus.menu(child, " What option do you choose?", "CRUD Menu");
							switch (option_CRUD) { // CRUD menu
							// Create Laptop
							case 0:
								functions_create.create_laptop();
								break;
							// Read laptop
							case 1:
								functions_read.read_laptop();
								break;
							// Update laptop
							case 2:
								functions_update.update_laptop();
								break;
							// Delete laptop
							case 3:
								functions_delete.delete_laptop();
								break;
							// Print laptop
							case 4:
								functions_print.print_laptop();
								break;
							case 5: // Exit
								break;
							default:
								option_prod = 5;
								break;
							}
						} while (option_prod != 5);
						break;
					case 1: // Smartphone
						do {
							option_prod = menus.menu(child, " What option do you choose?", "CRUD Menu");
							switch (option_prod) { // CRUD menu
							case 0:// Create Smartphone
								functions_create.create_smartphone();
								break;
							case 1: // Read Smartphone
								functions_read.read_smartphone();
								break;
							case 2: // Update Smartphone
								functions_update.update_smartphone();
								break;
							case 3: // Delete Smartphone
								functions_delete.delete_smartphone();
								break;
							case 4: // Print Smartphone
								functions_print.print_smartphone();
								break;
							case 5: // Exit
								break;
							default:
								option_prod = 5;
								break;
							}
						} while (option_prod != 5);
						break;
					case 2: // Accessory
						do {
							option_prod = menus.menu(child, " What option do you choose?", "CRUD Menu");
							switch (option_prod) { // CRUD menu
							case 0:// Create accessory
								functions_create.create_accessory();
								break;
							case 1: // Read accessory
								functions_read.read_accessory();
								break;
							case 2: // Update accessory
								functions_update.update_accessory();
								break;
							case 3: // Delete accessory
								functions_delete.delete_accessory();
								break;
							case 4: // Print Accessory
								functions_print.print_accessory();
								break;
							case 5: // Return
								break;
							default:
								option_prod = 5;
								break;
							}
						} while (option_prod != 5);
						break;
					case 3: // Exit
						break;
					default:
						option_prod = 3;
						break;
					}

				} while (option_CRUD != 3);
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "Thanks for use the aplication");
				break;
			default:
				option_dum = 2;
				break;
			}
		} while (option_dum != 2);
	}
}