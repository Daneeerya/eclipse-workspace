package framework_examen;
import javax.swing.*;
public class menu {

//	_____________________Botones__________________________
	public static void menu() {
		String [ ] opciones_menu_principal= {"Ejercicio1","Ejercicio2","Ejercicio3", "Salir"};
		int menu_principal =1, continuar=0;
		do {
			menu_principal = menus.menu_principal(opciones_menu_principal);
			switch (menu_principal) {
			case 0: //Ejercicio1
				do {
					ejercicios.ejercicio1();
					continuar = menus.menu_secundario();
					
				}while (continuar==0);
				break;
			case 1: //Ejercicio2
				do {
					ejercicios.ejercicio2();
					continuar = menus.menu_secundario();
					
				}while (continuar==0);
				break;
			case 2: //Ejercicio3
				do {
					ejercicios.ejercicio3();
					continuar = menus.menu_secundario();
					
				}while (continuar==0);
				break;
				
			case 3: //Salir
					JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
				break;
				
			default:
				continuar=2;
				break;
			}//end-switch
		}while (continuar==1);
		
	}// end-void
}//end-class
