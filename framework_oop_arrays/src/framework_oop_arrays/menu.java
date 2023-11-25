package framework_oop_arrays;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.laptop_dum;
import framework_oop_arrays.modules.products.utils.CRUD_dummies.CRUD.functions_create_dummies;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_create;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_delete;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_print;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_read;
import framework_oop_arrays.modules.products.utils.CRUD_simple.functions_update;
import framework_oop_arrays.utils.menus;

public class menu {
	public static laptop L = null;
	public static laptop_dum L_dum = null;

	public static smartphone S = null;
	public static accessory A = null;

	public static void menu() {
		int option_prod = 0, option_dum = 0, option_CRUD = 0;
		String[] mother = { "Laptop", "Smartphone", "Accessory", "Exit" };
		String[] child = { "Create", "Read", "Update", "Delete", "Print", "Return" };
		String[] dummies_o_no = { "With dummies", "Without dummies", "Exit" };
		do {
//			option_dum = menus.menu(dummies_o_no, " What option do you choose?", "Primary Menu");
//			switch (option_dum) {
//			case 0:
//				do {
			option_prod = menus.menu(mother, " What option do you choose?", "Primary Menu");
			switch (option_prod) {
			case 0: // Laptop
				do {
					option_CRUD = menus.menu(child, " What option do you choose?", "CRUD Menu");
					switch (option_CRUD) { // CRUD menu
					// Create Laptop
					case 0:
//						functions_create.create_laptop(L);
						functions_create_dummies.create_laptop(L_dum);
						break;
					// Read laptop
					case 1:
						functions_read.read_laptop(L);
						break;
					// Update laptop
					case 2:
						functions_update.update_laptop();
						break;
					// Delete laptop
					case 3:
						functions_delete.delete_laptop(L);
						break;
					// Print laptop
					case 4:
						functions_print.print_laptop(L);
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
						functions_create.create_smartphone(S);
						break;
					case 1: // Read Smartphone
						functions_read.read_smartphone(S);
						break;
					case 2: // Update Smartphone
						functions_update.update_smartphone(S);
						break;
					case 3: // Delete Smartphone
						functions_delete.delete_smartphone(S);
						break;
					case 4: // Print Smartphone
						functions_print.print_smartphone(S);
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
						functions_create.create_accessory(A);
						break;
					case 1: // Read accessory
						functions_read.read_accessory(A);
						break;
					case 2: // Update accessory
						functions_update.update_accessory(A);
						break;
					case 3: // Delete accessory
						functions_delete.delete_accessory(A);
						break;
					case 4: // Print Accessory
						functions_print.print_accessory(A);
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
				JOptionPane.showMessageDialog(null, "Thanks for use the aplication");
				break;
			default:
				option_prod = 3;
				break;
			}

		} while (option_prod != 3);
//		break;

//			case 1:
//				do {
//					option_prod = menus.menu(mother, " What option do you choose?", "Primary Menu");
//					switch (option_prod) {
//					case 0: // Laptop
//						do {
//							option_dum = menus.menu(child, " What option do you choose?", "CRUD Menu");
//							switch (option_prod) { // CRUD menu
//							// Create Laptop
//							case 0:
//								functions_create.create_laptop(L);
//								break;
//							// Read laptop
//							case 1:
//								functions_read.read_laptop(L);
//								break;
//							// Update laptop
//							case 2:
//								functions_update.update_laptop(L);
//								break;
//							// Delete laptop
//							case 3:
//								functions_delete.delete_laptop(L);
//								break;
//							// Print laptop
//							case 4:
//								functions_print.print_laptop(L);
//								break;
//							case 5: // Exit
//								break;
//							default:
//								option_prod = 5;
//								break;
//							}
//						} while (option_prod != 5);
//						break;
//					case 1: // Smartphone
//						do {
//							option_prod = menus.menu(child, " What option do you choose?", "CRUD Menu");
//							switch (option_prod) { // CRUD menu
//							case 0:// Create Smartphone
//								functions_create.create_smartphone(S);
//								break;
//							case 1: // Read Smartphone
//								functions_read.read_smartphone(S);
//								break;
//							case 2: // Update Smartphone
//								functions_update.update_smartphone(S);
//								break;
//							case 3: // Delete Smartphone
//								functions_delete.delete_smartphone(S);
//								break;
//							case 4: // Print Smartphone
//								functions_print.print_smartphone(S);
//								break;
//							case 5: // Exit
//								break;
//							default:
//								option_prod = 5;
//								break;
//							}
//						} while (option_prod != 5);
//						break;
//					case 2: // Accessory
//						do {
//							option_prod = menus.menu(child, " What option do you choose?", "CRUD Menu");
//							switch (option_prod) { // CRUD menu
//							case 0:// Create accessory
//								functions_create.create_accessory(A);
//								break;
//							case 1: // Read accessory
//								functions_read.read_accessory(A);
//								break;
//							case 2: // Update accessory
//								functions_update.update_accessory(A);
//								break;
//							case 3: // Delete accessory
//								functions_delete.delete_accessory(A);
//								break;
//							case 4: // Print Accessory
//								functions_print.print_accessory(A);
//								break;
//							case 5: // Return
//								break;
//							default:
//								option_dum = 5;
//								break;
//							}
//						} while (option_dum != 5);
//						break;
//					case 3: // Exit
//						JOptionPane.showMessageDialog(null, "Thanks for use the aplication");
//						break;
//					default:
//						option_prod = 3;
//						break;
//					}
//
//				} while (option_prod != 3);
//				break;
//			}
//		}while(option_dum!=2);
	}
}