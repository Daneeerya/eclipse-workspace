package framework_oop_1_prod;

import javax.swing.JOptionPane;

import framework_oop.validators;

public class menu {
	public static void menu() {
		product p1 = null;
		String [] opciones_menu_principal= {"Create","Read","Update", "Delete", "Exit"};
		String cad = "";
		int menu_principal =1, continuar=0;
			do {
			menu_principal = menus.menu_principal(opciones_menu_principal);
			switch (menu_principal) {
			case 0: //Create
				do {
					p1= CRUD_product.create();
					continuar = menus.menu_secundario();
				}while (continuar==0);
				break;
			case 1: //Read
				do {
					if (p1!= null) {
						CRUD_product.read(p1);
					}else {
						cad = "No hay producto creado";
						JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
					}
					continuar = menus.menu_secundario();	
				}while (continuar==0);
				break;
			case 2: //Update
				do {
					if (p1!=null) {
						CRUD_product.update(p1);
					}else {
					cad = "No puedes actualizar nada... No hay producto";
					JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
					}
					continuar = menus.menu_secundario();
				}while (continuar==0);
				break;
			case 3: //Delete
				do {
					if (p1!=null) {
						p1 = null;
						CRUD_product.delete(p1);
					}else {
						cad = "No puedes borrarlo... No existe el producto";
						JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
					}
					continuar = menus.menu_secundario();
				}while (continuar==0);
				break;
			case 4: //Salir
				JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
				break;
			default:
				continuar=2;
				break;
			}//end-switch
		}while (continuar==1);
	}// end-void
}//end-class
