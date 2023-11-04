package framework_examen_eng;

import javax.swing.JOptionPane;

public class validators {

	//________validate_int________________________
	public static int validate_int(String message, String tittle){
		int num = 0; 
		String num_input; 
		boolean correct=true;
		
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, message, tittle,JOptionPane.QUESTION_MESSAGE);
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Coming out de la aplicaci�n","Coming out",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);;//the user clicks cancel or closes the showinputdialog window, the execution ends
				}else {
					num=Integer.parseInt(num_input);
					correct=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "You have not entered a number int", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		return num;
	}//end-static
	
//________validate_float________________________
	public static float validate_float(String message, String tittle){
		float num_float = 0.0f; // this is how you make a float
		String intro_num_float;
		boolean correct=true;

		do{
			try{
				intro_num_float=JOptionPane.showInputDialog(null, message, tittle,JOptionPane.QUESTION_MESSAGE);
				if(intro_num_float==null){
					JOptionPane.showMessageDialog(null, "Exiting the application","Coming out",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//the user clicks cancel or closes the showinputdialog window, the execution ends
				}else {
					num_float=Float.parseFloat(intro_num_float);
					correct=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "You have not entered a number float", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);	
		return num_float;
	}//end-static
	
//________validate_String________
	public static String validate_string(String message, String tittle) {
		String s="";
		boolean correct=true;

		do{
			try{
				s=JOptionPane.showInputDialog(null, message, tittle,JOptionPane.QUESTION_MESSAGE);
				correct=true;
				if (s==null){
					JOptionPane.showMessageDialog(null, "Exiting the application","Coming out",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//the user clicks cancel or closes the showinputdialog window, the execution ends
				}
				if(s.equals("")){
					JOptionPane.showMessageDialog(null, "Data entry error","Error",JOptionPane.ERROR_MESSAGE);
					correct=false;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "You have not entered a string", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		JOptionPane.showMessageDialog(null, "You have entered: "+s,"Result",JOptionPane.INFORMATION_MESSAGE);
		return s;
	}
}
