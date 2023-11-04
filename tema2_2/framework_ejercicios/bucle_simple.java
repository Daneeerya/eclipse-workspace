package framework_ejercicios;

import javax.swing.JOptionPane;

import framework_ejercicios.ejercicios;
import framework_ejercicios.menus;

public class bucle_simple {
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
		
	}// end_static
	
	public static void combo() {
		int n = 0; int continuar=0;
		String s = "";
		boolean correcto = false;
		Object seleccion1 = null;
		

		do {
			seleccion1 = JOptionPane.showInputDialog(
					   null,
					   "Selecciona una opción",
					   "Selector de opciones",
					   JOptionPane.QUESTION_MESSAGE,
					   null,  // null para icono defecto
					   new Object[] { "Ejercicio1", "Ejercicio2", "Ejercicio3", "Salir" },
					   "letra_a");
			
			switch (seleccion1.toString()) {
				case "Ejercicio1":
					ejercicios.ejercicio1();
					continuar = menus.menu_secundario();
					break;
				case "Ejercicio2":
					ejercicios.ejercicio2();
					continuar = menus.menu_secundario();
					break;
				case "Ejercicio3":
					ejercicios.ejercicio3();
					continuar = menus.menu_secundario();
					break;
				case "Salir":
						JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
						break;
				default:
					JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteriores opciones");
					}//end-switch
					if (continuar==2) {
						System.exit(0);
					}
				
			}while (continuar==1);


		
	}//end_static
}//end-class


