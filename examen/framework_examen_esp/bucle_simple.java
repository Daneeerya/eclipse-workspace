package framework_examen_esp;
import javax.swing.*;
public class bucle_simple {
//	_____________________Combo_____________________

	public static void combo() {
		int n = 0; int continuar=0;
		String s = "";
		boolean correcto = false;
		Object seleccion1 = null;
		

		for(int i=0; i<n; i++) {
			seleccion1 = JOptionPane.showInputDialog(
					   null,
					   "Selecciona una opción",
					   "Selector de opciones",
					   JOptionPane.QUESTION_MESSAGE,
					   null,  // null para icono defecto
					   new Object[] { "Ejercicio1", "Ejercicio2", "Ejercicio3", "Salir" },
					   "letra_a");
			System.out.println(seleccion1.toString());
			
			switch (seleccion1.toString()) {
				case "Ejercicio1":
					ejercicios.ejercicio1();
					break;
				case "Ejercicio2":
					ejercicios.ejercicio2();
					break;
				case "Ejercicio3":
					ejercicios.ejercicio3();
					break;
				case "letra_o":
					do {
						JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
						break;
					}while (continuar==0);
				
					if (continuar==2) {
						System.exit(0);
					}
			}//end_case
		}//end_for
		
	}//end_static

//	_____________________Buttons__________________________
	public static void menu() {
		String [ ] opciones_menu_principal= {"Ejercicio1","Ejercicio2","Ejercicio3", "Salir"};
		String [] opc_menu_sec= {"Repetir operacion","Menú","Salir" };
		int menu_principal =1, continuar=0;
		do {
			menu_principal = menus.menu_principal(opciones_menu_principal);
			switch (menu_principal) {
			case 0: //Ejercicio1
				do {
					ejercicios.ejercicio1();
					continuar = menus.menu_secundario();
				}while (continuar==0);
			
			case 1: //Ejercicio2
				do {
					ejercicios.ejercicio2();
					continuar = menus.menu_secundario();
				}while (continuar==0);
			case 2: //Ejercicio3
				do {
					ejercicios.ejercicio3();
					continuar = menus.menu_secundario();
				}while (continuar==0);
				
			case 3: //Salir
				do {
					JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
					break;
				}while (continuar==0);
			
			if (continuar==2) {
				System.exit(0);
			}
			
			}//end-switch
		}while (continuar==1);
		
	}// end-void
}//end-class
