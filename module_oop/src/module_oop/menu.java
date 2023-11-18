package module_oop;

import javax.swing.JOptionPane;

import module_oop.modules.products.classes.laptop;
import module_oop.modules.products.classes.accessory;
import module_oop.modules.products.classes.smartphone;
import module_oop.modules.products.utils.CRUD;
import module_oop.utils.menus;

public class menu {
	public static laptop L = null;
	public static smartphone S = null;
	public static  accessory A = null;
	public static void menu(){
	int option = 0, option1 = 0;
	String [] mother = {"Laptop", "Smartphone", "Accessory", "Exit"};
	String [] child = {"Create", "Read", "Update", "Delete", "Print", "Return"};
	do {
		option = menus.menu(mother, " What option do you choose?", "Primary Menu");
		switch (option) {
		case 0 : // Laptop
			do {
				option1 = menus.menu(child, " What option do you choose?", "CRUD Menu");
					switch (option1) { //CRUD menu
					case 0:// Create Laptop
						CRUD.create(0);
						JOptionPane.showMessageDialog(null, "Laptop create correctly");
						break;
						
					case 1: // Read laptop
						if (menu.L == null) {
							JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.read_one(menu.L);
						}
						break;
					case 2: //Update laptop
						if (menu.L == null) {
							JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.update(menu.L);
						}
						break;
					case 3: // Delete laptop
						if (menu.L == null) {
							JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.delete (menu.L);
							JOptionPane.showMessageDialog(null, "Laptop delete", "Information", JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 4: // Print laptop
						if (menu.L == null) {
							JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.read_all(menu.L); 
						}
						break;
					case 5: // Exit
						break;
					default: 
						option1=5;
						break;
					}
			}while (option1!=5);
			break;
		case 1: //Smartphone
			do {
				option1 = menus.menu(child, " What option do you choose?", "CRUD Menu");
					switch (option1) { //CRUD menu
					case 0:// Create Smartphone
						CRUD.create(1);
						JOptionPane.showMessageDialog(null, "Smartphone create correctly");
						break;
						
					case 1: // Read Smartphone
						if (menu.S == null) {
							JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.read_one(menu.S);
						}
						break;
					case 2: //Update Smartphone
						if (menu.S == null) {
							JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.update(menu.S);
						}
						break;
					case 3: // Delete Smartphone
						if (menu.S == null) {
							JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.delete (menu.S);
							JOptionPane.showMessageDialog(null, "Smartphone delete", "Information", JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 4: // Print Smartphone
						if (menu.S == null) {
							JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.read_all(menu.S); 
						}
						break;
					case 5: // Delete Smartphone
						break;
					default: 
						option1 =5;
						break;
					}
			}while (option1!=5);
			break;
		case 2: //Accessory
			do {
				option1 = menus.menu(child, " What option do you choose?", "CRUD Menu");
					switch (option1) { //CRUD menu
					case 0:// Create Accessory
						CRUD.create(2);
						JOptionPane.showMessageDialog(null, "Accessory create correctly");
						break;
						
					case 1: // Read Accessory
						if (menu.A == null) {
							JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.read_one(menu.A);
						}
						break;
					case 2: //Update Accessory
						if (menu.A == null) {
							JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.update(menu.A);
						}
						break;
					case 3: // Delete Accessory
						if (menu.A == null) {
							JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.delete (menu.A);
							JOptionPane.showMessageDialog(null, "Smartphone delete", "Information", JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 4: // Print Accessory
						if (menu.A == null) {
							JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							CRUD.read_all(menu.A); 
						}
						break;
					case 5: // Return
						break;
					default: 
						option =5;
						break;
					}
			}while (option1!=5);
			break;
		case 3: // Exit
			JOptionPane.showMessageDialog(null, "Thanks for use the aplication");
			break;
		default: 
			option =3;
			break;
		}
		
	}while (option!=3);


}
}
