package framework_ejercicios;

import javax.swing.JOptionPane;

import framework_ejercicios.validators;

public class menu {
	public static void menu() {
		String [ ] opciones_menu_principal= {"Ejercicio1","Ejercicio2","Ejercicio3", "Salir"};
		int menu_principal =1, continuar=0;
		do {
			menu_principal = menus.menu_principal(opciones_menu_principal);
			switch (menu_principal) {
			case 0: //Ejercicio1
				do {

					continuar = menus.menu_secundario();
				}while (continuar==0);
				break;
			
			case 1: //Ejercicio2
				do {

					continuar = menus.menu_secundario();
				}while (continuar==0);
				break;

			case 2: //Ejercicio3
				do {

					continuar = menus.menu_secundario();
				}while (continuar==0);
				break;

				
			case 4:
				JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
				break;
			}//end-switch
			if (continuar==2) {
				System.exit(0);
			}
		}while (continuar==1);
		
	}// end-void
}//end-class
