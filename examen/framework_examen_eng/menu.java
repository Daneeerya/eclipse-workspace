package framework_examen_eng;

import javax.swing.JOptionPane;

import framework_examen_esp.validators;

public class menu {
	public static void menu() {
		String [ ] options_main_menu= {"Exercise1","Exercise2","Exercise3", "Out"};
		String [] opt_menu_sec= {"Repeate operation","Menu","Out" };
		int main_menu =1, continuar=0;
		do {
			main_menu = menus.main_menu(options_main_menu);
			switch (main_menu) {
			case 0: //Exercise1
				do {

					continuar = menus.secondary_menu();
				}while (continuar==0);
			
			case 1: //Exercise2
				do {

					continuar = menus.secondary_menu();
				}while (continuar==0);
			case 2: //Exercise3
				do {

					continuar = menus.secondary_menu();
				}while (continuar==0);
				
			case 3: //Out
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
