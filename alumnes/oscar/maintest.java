package oscar;

import javax.swing.JOptionPane;

public class maintest {
	public static void main(String[] args) {
		String [] opc_main_menu={"Ejercicio 1", "Ejercicio 1 v1.1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Salir"};
		String [] opc_secondary_menu={"Ejer", "Volver", "Salir"};
		String option="";
		int opcsecondary=0;
		String result = "";
		
		do{
			option=functions.menucombo(opc_main_menu, "Seleccione la operacion deseada", "Menu principal");
			
			switch(option){
			case "Ejercicio 1":
				do{

					
					opc_secondary_menu[0]=opc_main_menu[0];
					opcsecondary=functions.menubuttons(opc_secondary_menu, "Desea repetir el ejercicio?", "Menu Secundario");
				}while(opcsecondary==0);
				break;
				
			case "Ejercicio 1 v1.1":
				do{

					
					opc_secondary_menu[0]=opc_main_menu[1];
					opcsecondary=functions.menubuttons(opc_secondary_menu, "Desea repetir el ejercicio?", "Menu Secundario");
				}while(opcsecondary==0);
				break;
			
			case "Ejercicio 2":
				do{

					
					opc_secondary_menu[0]=opc_main_menu[2];
					opcsecondary=functions.menubuttons(opc_secondary_menu, "Desea repetir el ejercicio", "Menu Secundario");
				}while(opcsecondary==0);
				break;
				
			case "Ejercicio 3":
				do{

					
					opc_secondary_menu[0]=opc_main_menu[3];
					opcsecondary=functions.menubuttons(opc_secondary_menu, "Desea repetir el ejercicio", "Menu Secundario");
				}while(opcsecondary==0);
				break;
				
			case "Ejercicio 4":
				do{

					
					opc_secondary_menu[0]=opc_main_menu[4];
					opcsecondary=functions.menubuttons(opc_secondary_menu, "Desea repetir el ejercicio", "Menu Secundario");
				}while(opcsecondary==0);
				break;
			
			}
			
		}while(!option.equals("Salir") && (opcsecondary!=2));
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicacion");
	}
}
