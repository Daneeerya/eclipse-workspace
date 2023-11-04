package framework_oop;

import javax.swing.JOptionPane;

import framework_oop.validators;

public class menu {
	public static void menu() {
		product p1 = null;
		String [] opciones_menu_principal= {"Create","Read","Update", "Delete", "Out"};
		String cad = "";
		String [] opc_menu_sec= {"Repetir operacion","Menú","Salir" };
		int menu_principal =1, continuar=0;
		do {
			menu_principal = menus.menu_principal(opciones_menu_principal);
			switch (menu_principal) {
			case 0: //Create
					p1= CRUD_products.create();
			
			case 1: //Read
				do {
					if (p1!= null) {
						CRUD_products.read(p1);
					}else {
						cad = "No hay producto creado";
					}
					continuar = menus.menu_secundario();
					break;
				}while (continuar==0);
			case 2: //Update
				do {
					if (p1!=null) {
						CRUD_products.update(p1);
					}else {
					cad = "No puedes borrarlo... No existe el producto";
				}
					break;

				}while (continuar==0);
					continuar = menus.menu_secundario();

			case 3: //Delete
				if (p1!=null) {
					CRUD_products.delete(p1);
				}else {
					cad = "No puedes borrarlo... No existe el producto";
				}
			case 4: //Exit
				JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
			break;
			
			default:
				continuar=2;
				break;
				}//end-switch
		}while (continuar==1);

	}// end-void
}//end-class
