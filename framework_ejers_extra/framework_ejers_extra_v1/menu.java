package framework_ejers_extra_v1;

import javax.swing.JOptionPane;

public class menu {

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
                                                                                              