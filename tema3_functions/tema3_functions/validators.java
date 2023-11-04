package tema3_functions;

import javax.swing.JOptionPane;

public class validators {

	//________Valida int________________________
	public static int valida_int(String message, String title){
		int num = 0; // a es num
		String num_input; // s es num_input
		boolean correcto=true;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, message, title,JOptionPane.QUESTION_MESSAGE); //Message es per a ficar un message diferent i title el titol (canviar-ho en tots els showinputdialog
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					num=Integer.parseInt(num_input);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		return num;
	}//end-static
	
	//________Valida float________________________
	public static float valida_float(){
		float num_float = 0.0f; // así se hace un float
		String intro_num_float;
		boolean correcto=true;

		do{
			try{
				intro_num_float=JOptionPane.showInputDialog(null, "Escribe un num float","Num float",JOptionPane.QUESTION_MESSAGE);
				if(intro_num_float==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					num_float=Float.parseFloat(intro_num_float);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num float", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);	
		return num_float;
	}//end-static

	
	//________Confirm________________________
		public static String continuar() {
			int confirmado = 0;
			do {
				confirmado = JOptionPane.showConfirmDialog (null, "¿Quieres continuar?");
			}while (JOptionPane.OK_OPTION == confirmado);
			return null;
		}//end-static
		
	}//end-class

