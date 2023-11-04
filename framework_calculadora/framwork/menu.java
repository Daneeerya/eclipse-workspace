package framwork;

import javax.swing.JOptionPane;

public class menu {
	public static void menu() {
		String [ ] opciones_menu_principal= {"Suma","Resta","Multiplicación","División", "Salir"};
		int menu_principal =1, continuar=0;
		do {
		menu_principal = validators.menu_principal(opciones_menu_principal);

		switch(menu_principal){
		
		case 0://suma
				do {
					ejercicios.suma();
					continuar = validators.menu_secundario();
				}while(continuar == 0);
				break;
			
		case 1://resta
			do {
				ejercicios.resta();
				continuar = validators.menu_secundario();
			}while(continuar == 0);
			break;
		case 2://multiplicación
			do {
				ejercicios.multiplicacion();
				continuar = validators.menu_secundario();
			}while(continuar == 0);
			break;
		case 3://división
			do {
				ejercicios.division();
				continuar = validators.menu_secundario();
			}while(continuar == 0);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
			break;
		}
		if (continuar==2) {
			System.exit(0);
		}
	
		}while(continuar==1);
	}

}
