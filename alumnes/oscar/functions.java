package oscar;

import javax.swing.JOptionPane;

public class functions {
	
	//-------------------------------------INT-----------------er--------------------
	//Function that ask for a number to the user and return an integer -------------------------------------
	public static int askinteger(String message, String title){
		String string="";
		int num = 0;
		boolean correct=false;

		do{
			try{
				string=JOptionPane.showInputDialog(null, message, title,JOptionPane.QUESTION_MESSAGE);
				num=Integer.parseInt(string);
				correct=true;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un numero entero", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		
		
		return num;
	}
	
	//Function that ask for an integer different to 0 for the division
	
	public static int askinteger_nozero(){
		int num=0;
		boolean goon = false;
		
		do{
			num= askinteger("Introduce un numero distinto de cero para el divisor", "Entero no cero");
			if(num!=0)
				goon=true;
			else
				JOptionPane.showMessageDialog(null, "Error, la division entre cero es una indeterminacion", "Paradoja Matematica", JOptionPane.ERROR_MESSAGE);
		}while(goon==false);
		
		return num;
	}
	
	//-------------------------------------FLOAT-------------------------------------
	//Function that ask for a number to the user and return a float -------------------------------------
	
	public static float askfloat(String message, String title){
		String string = "";
		float num = 0.0f;
		boolean correct = false;
		
		do{
			try{
				string=JOptionPane.showInputDialog(null, message, title,JOptionPane.QUESTION_MESSAGE);
				
				if(string==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicacion","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					num=Float.parseFloat(string);
					correct=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un numero", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		
		return num;
	}
	
	//Function that ask for a number different to 0 for the division
	
	public static float askfloat_nozero(){
		float num=0.0f;
		boolean goon = false;
		
		do{
			num= askfloat("Introduce un numero distinto de cero para el divisor", "Entero no cero");
			if(num!=0)
				goon=true;	
			else
				JOptionPane.showMessageDialog(null, "Error, la division entre cero es una indeterminacion", "Paradoja Matematica", JOptionPane.ERROR_MESSAGE);
		}while(goon==false);
		
		return num;
	}
	
	//-------------------------------------CHAR---------------------------------------------
	///Function that ask for a char to the user and return it-------------------------------------
	
	public static char askcharacter(String message, String title){
		char neoChar=' ';
		String string="";
		boolean correct=true;

		do{
			try{
				string=JOptionPane.showInputDialog(null, message, title,JOptionPane.QUESTION_MESSAGE);
				neoChar=string.charAt(0);
				correct=true;
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una letra", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
	
		return neoChar;
	}
		
	//-------------------------------------STRING-------------------------------------
	///Function that ask for a string and return it -------------------------------------
	
	public static String askString(String message, String title){
		String string="";
		boolean correct=false;
		
		do{
			try{
				string = JOptionPane.showInputDialog(null, message , title , JOptionPane.QUESTION_MESSAGE);
				correct = true;
				if(string.equals("")){
					JOptionPane.showMessageDialog(null, "Error de introduccion de datos","Error",JOptionPane.ERROR_MESSAGE);
					correct=false;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una cadena", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		
		return string;
		
	}
	
	//-------------------------------------MENU-------------------------------------
	//Menu using combobox-------------------------------------
	public static String menucombo(String[] options, String message, String title){
		Object option=null;
		
		option=JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		
		return option.toString();
	}
	
	//Menu ussing buttons-------------------------------------
	public static int menubuttons(String[] options, String message, String title){
		int option=0;
		
		option=JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		
		return option;
	}
	
	//----------------------------------------SHOW----------------------------------------
	//Function show string
	public static void showString( String message, String title){
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	//-------------------------------------OPERAtions-------------------------------------
	//Function sum
	public static void operaSum( int[] operands ){
		operands[0]=askinteger("Introduce el primer operando de la suma", "Numero 1 suma");
		operands[1]=askinteger("Introduce el segundo operando de la suma", "Numero 2 suma");
		
		operands[2]=operands[0]+operands[1];
	}
	
	//Function sum float
	public static void operaSum( float[] operands ){
		operands[0]=askfloat("Introduce el primer operando de la suma", "Numero 1 suma");
		operands[1]=askfloat("Introduce el segundo operando de la suma", "Numero 2 suma");
		
		operands[2]=operands[0]+operands[1];
	}
	
	//Function subtraction
	public static void operaSubtraction( int[] operands ){
		operands[0]=askinteger("Introduce el primer operando de la resta", "Numero 1 resta");
		operands[1]=askinteger("Introduce el segundo operando de la resta", "Numero 2 resta");
		
		operands[2]=operands[0]-operands[1];
	}
	
	//Function subtraction float
	public static void operaSubtraction( float[] operands ){
		operands[0]=askfloat("Introduce el primer operando de la resta", "Numero 1 resta");
		operands[1]=askfloat("Introduce el segundo operando de la resta", "Numero 2 resta");
		
		operands[2]=operands[0]-operands[1];
	}
	
	//Function Multiply
	public static void operaMultiply( int[] operands ){
		operands[0]=askinteger("Introduce el primer operando", "Numero 1 producto");
		operands[1]=askinteger("Introduce el segundo operando", "Numero 2 producto");
		
		operands[2]=operands[0]*operands[1];
	}
	
	//Function Multiply float
	public static void operaMultiply( float[] operands ){
		operands[0]=askfloat("Introduce el primer operando", "Numero 1 producto");
		operands[1]=askfloat("Introduce el segundo operando", "Numero 2 producto");
		
		operands[2]=operands[0]*operands[1];
	}
	
	//Function divide
	public static void operaDivide( int[] operands ){
		operands[0]=askinteger("Introduce el dividendo", "Division");
		operands[1]=askinteger_nozero();
		
		operands[2]=operands[0]/operands[1];
	}
	
	//Function divide float
	public static void operaDivide( float[] operands ){		
		operands[0]=askfloat("Introduce el dividendo", "Division");
		operands[1]=askfloat_nozero();
		
		operands[2]=operands[0]/operands[1];
	}
}
