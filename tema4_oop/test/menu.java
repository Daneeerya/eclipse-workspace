package test;

import java.util.Calendar;

import javax.swing.JOptionPane;

import framework_oop_prods.CRUD;
import framework_oop_prods.accessory;
import framework_oop_prods.laptop;
import framework_oop_prods.menus;
import framework_oop_prods.smartphone;

public class menu {
	public static void menu() {
		int option = 0, option1 = 0;
		laptop L = null;
		smartphone S = null;
		accessory A = null;
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
							L = (laptop) CRUD.create(0);
							JOptionPane.showMessageDialog(null, "Laptop create correctly");
							break;
							
						case 1: // Read laptop
							if (L == null) {
								JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								CRUD.read_one();
							}
							break;
						case 2: //Update laptop
							if (L == null) {
								JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								CRUD.update();
							}
							break;
						case 3: // Delete laptop
							if (L == null) {
								JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								L = (laptop)CRUD.delete (L);
								JOptionPane.showMessageDialog(null, "Laptop delete", "Information", JOptionPane.INFORMATION_MESSAGE);
							}
							break;
						case 4: // Print laptop
							if (L == null) {
								JOptionPane.showMessageDialog(null, "You must create the product first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								CRUD.read_all(L); 
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
							S = (smartphone) CRUD.create(1);
							JOptionPane.showMessageDialog(null, "Smartphone create correctly");
							break;
							
						case 1: // Read Smartphone
							if (S == null) {
								JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								CRUD.read_one(S);
							}
							break;
						case 2: //Update Smartphone
							if (S == null) {
								JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								S = (smartphone)CRUD.update(S);
							}
							break;
						case 3: // Delete Smartphone
							if (S == null) {
								JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								S = (smartphone)CRUD.delete (S);
								JOptionPane.showMessageDialog(null, "Smartphone delete", "Information", JOptionPane.INFORMATION_MESSAGE);
							}
							break;
						case 4: // Print Smartphone
							if (S == null) {
								JOptionPane.showMessageDialog(null, "You must create the smartphone first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								CRUD.read_all(S); 
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
							A = (accessory) CRUD.create(2);
							JOptionPane.showMessageDialog(null, "Accessory create correctly");
							break;
							
						case 1: // Read Accessory
							if (A == null) {
								JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								CRUD.read_one(A);
							}
							break;
						case 2: //Update Accessory
							if (A == null) {
								JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								A = (accessory)CRUD.update(A);
							}
							break;
						case 3: // Delete Accessory
							if (A == null) {
								JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								A = (accessory)CRUD.delete (A);
								JOptionPane.showMessageDialog(null, "Smartphone delete", "Information", JOptionPane.INFORMATION_MESSAGE);
							}
							break;
						case 4: // Print Accessory
							if (A == null) {
								JOptionPane.showMessageDialog(null, "You must create the accessory first!", "Error", JOptionPane.ERROR_MESSAGE);
							}else {
								CRUD.read_all(A); 
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
