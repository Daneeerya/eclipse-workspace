package PROVES;
import javax.swing.*;

public class calculadora {
	public static void main(String[] args) {
		boolean valido=true;
		int opcio_menu_principal,opcio_menu_secundari;
		int num = 0; 
		String intro_num; 
		int num_2 = 0; 
		String intro_num2; 
		String cad = "";
		int suma = 0;
		int resta = 0;
		boolean correcto = false;
		int mult = 0; 
		int div = 0;
		int opcion =0;
		
		do{
			String[]menu_principal={"Sumar","Restar","Multiplicar","Dividir","Acabar"};
			opcio_menu_principal=JOptionPane.showOptionDialog(null, "¿Que operación desea realizar?", "Operación a realizar",0, JOptionPane.QUESTION_MESSAGE,null ,menu_principal,menu_principal[0]);
			
			switch(opcio_menu_principal){
				case 0:
					do{
						//Comença valida int
						do{
							try{
								intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num=Integer.parseInt(intro_num);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						//Comença valida int
						do{
							try{
								intro_num2=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num2==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num_2=Integer.parseInt(intro_num2);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						suma = num + num_2;
						JOptionPane.showMessageDialog(null, "La suma de " + num + " + " + num_2 +  " tiene un resultado de " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
						String[]menu_secundari={"Repetir operación","Volver","Acabar"};
						opcio_menu_secundari=JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Continuar",0, JOptionPane.QUESTION_MESSAGE,null ,menu_secundari,menu_secundari[0]);
						switch(opcio_menu_secundari){
						//si opcio_menu_secundari==0 entra en default, pero tb entra en el bucle do-while y no sale del prog
							case 1: //si opcio_menu_secundari==1 es pq el usuario ha pulsado Volver
								valido=true;
								break;
							case 2: //si opcio_menu_secundari==2 es pq el usuario ha pulsado Acabar
								valido=false;
								break;
							default:	//si se cierra la ventana, opcio_menu_secundari=-1
								valido=false;
						}
						//Mejora: todo el bloque anterior se debe realizar con una función, ya que se repite en todos los case siguientes
					}while(opcio_menu_secundari==0);	//si opcio_menu_secundari==0 es pq el usuario ha pulsado sumar
					break;
				case 1:
					do{
						//Comença valida int
						do{
							try{
								intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num=Integer.parseInt(intro_num);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						//Comença valida int
						do{
							try{
								intro_num2=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num2==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num_2=Integer.parseInt(intro_num2);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						resta = num - num_2;
						JOptionPane.showMessageDialog(null,"La resta de " + num + " - " + num_2 + " tiene un resultado de " + resta, "Resultado", JOptionPane.INFORMATION_MESSAGE);						
						String[]menu_secundari={"Repetir operación","Volver","Acabar"};
						opcio_menu_secundari=JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Continuar",0, JOptionPane.QUESTION_MESSAGE,null ,menu_secundari,menu_secundari[0]);
						switch(opcio_menu_secundari){
							case 1:
								valido=true;
								break;
							case 2:
								valido=false;
								break;
							default:	
								valido=false;
						}
					}while(opcio_menu_secundari==0);	
					break;
				case 2:
					do{
						//Comença valida int
						do{
							try{
								intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num=Integer.parseInt(intro_num);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						//Comença valida int
						do{
							try{
								intro_num2=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num2==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num_2=Integer.parseInt(intro_num2);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						mult = num * num_2;
						JOptionPane.showMessageDialog(null, "La multiplicación de " + num + " * " + num_2 + " tiene un resultado de " + mult, "Resultado", JOptionPane.INFORMATION_MESSAGE);						
						String[]menu_secundari={"Repetir operación","Volver","Acabar"};
						opcio_menu_secundari=JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Continuar",0, JOptionPane.QUESTION_MESSAGE,null ,menu_secundari,menu_secundari[0]);
						switch(opcio_menu_secundari){
							case 1:
								valido=true;
								break;
							case 2:
								valido=false;
								break;
							default:	
								valido=false;
						}
					}while(opcio_menu_secundari==0);	
					break;
				case 3:
					do{
						//Comença valida int
						do{
							try{
								intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num=Integer.parseInt(intro_num);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						//Comença valida int
						do{
							try{
								intro_num2=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
								if(intro_num2==null){
									JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
								}else {
									num_2=Integer.parseInt(intro_num2);
									correcto=true;
								}
							}catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
							}
						}while(correcto==false);
						// Acaba valida int
						
						if (num_2 == 0){
							cad = "Error 303";
						} else {
							div = num / num_2;
							cad = "La división de " + num + " / " + num_2 +  " tiene un resultado de " + div;
						}
						JOptionPane.showMessageDialog(null,cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);						
						String[]menu_secundari={"Repetir operación","Volver","Acabar"};
						opcio_menu_secundari=JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Continuar",0, JOptionPane.QUESTION_MESSAGE,null ,menu_secundari,menu_secundari[0]);
						switch(opcio_menu_secundari){
							case 1:
								valido=true;
								break;
							case 2:
								valido=false;
								break;
							default:	
								valido=false;
						}
						}while(opcio_menu_secundari==0);	
		}while(valido==true);
		}while (opcion !=5);
	}//end-main
}//end-class