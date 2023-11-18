package test_date;
import javax.swing.JOptionPane;
public class validators {
	//________Valida_int________________________
			public static int valida_int(String message, String tittle){
				int num = 0; 
				String num_input; 
				boolean correcto=true;
				
				do{
					try{
						num_input=JOptionPane.showInputDialog(null, message, tittle,JOptionPane.QUESTION_MESSAGE);
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
			public static float valida_float(String message, String tittle){
				float num_float = 0.0f; // así se hace un float
				String intro_num_float;
				boolean correcto=true;

				do{
					try{
						intro_num_float=JOptionPane.showInputDialog(null, message, tittle,JOptionPane.QUESTION_MESSAGE);
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
			
	//________Valida_String________
			public static String valida_string(String message, String tittle) {
				String s="";
				boolean correcto=true;

				do{
					try{
						s=JOptionPane.showInputDialog(null, message, tittle,JOptionPane.QUESTION_MESSAGE);
						correcto=true;
						if (s==null){
							JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
						}
						if(s.equals("")){
							JOptionPane.showMessageDialog(null, "Error de introducción de datos","Error",JOptionPane.ERROR_MESSAGE);
							correcto=false;
						}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "No has introducido una cadena", "Error",JOptionPane.ERROR_MESSAGE);
						correcto=false;
					}
				}while(correcto==false);
				return s;
			}
	
}

