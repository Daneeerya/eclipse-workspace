package framwork;

import javax.swing.JOptionPane;

public class validators {

//________Valida_int________________________
		public static int valida_int(){
			int num = 0; 
			String num_input; 
			boolean correcto=true;
			
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Introduce un número","Número entero",JOptionPane.QUESTION_MESSAGE);
					if(num_input==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
					}else {
						num=Integer.parseInt(num_input);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un número entero", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);
			return num;
		}//end-static
		
//________Valida_float________________________
		public static float valida_float(){
			float num_float = 0.0f; // así se hace un float
			String intro_num_float;
			boolean correcto=true;

			do{
				try{
					intro_num_float=JOptionPane.showInputDialog(null, "Escribe un número float","Num float",JOptionPane.QUESTION_MESSAGE);
					if(intro_num_float==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
					}else {
						num_float=Float.parseFloat(intro_num_float);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un número float", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);	
			return num_float;
		}//end-static
	
			
//intro_num1
			public static int intro_num1 () {
				int num =0;
				try {
					String intro_num1 =JOptionPane.showInputDialog(null, 
					 "Introduce un numero"+"\n", 
					 "Introducción de datos", 
					 JOptionPane.QUESTION_MESSAGE); 
					num=Integer.parseInt(intro_num1);
				}catch (Exception e) {
					System.err.println("Error"+ e.getMessage());
					num =Integer.MIN_VALUE;
				}
				return num;
			}
	

//Menu_principal 
public static int menu_principal(String[] menu_principal) {
		
		int opcion=0;
		
		opcion = JOptionPane.showOptionDialog(null,"¿Que operación quieres realizar?","Menú Principal",0,JOptionPane.QUESTION_MESSAGE,null,menu_principal,menu_principal[0]);
		
		return opcion;
		
	}

//Menu_secundario
public static int menu_secundario() {
	String[] operaciones = { "Repetir operacion","Menú","Salir" };
	int opcion=0;
	
	opcion = JOptionPane.showOptionDialog(null,"¿Que acción quieres realizar?","Menú Secundario",0,JOptionPane.QUESTION_MESSAGE,null,operaciones,operaciones[0]);
	
	return opcion;
	
}
}//end-class
