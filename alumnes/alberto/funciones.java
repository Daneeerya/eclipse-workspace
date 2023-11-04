package alberto;

import javax.swing.JOptionPane;

public class funciones {

	public static int pedirnum() {
		String nume1="";
		int num = 0;
		boolean correcto = false;
		
		do{
			try{
				nume1=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
				if(nume1==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					num=Integer.parseInt(nume1);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		
		return num;
		
	}
	
	public static char pedircaracter() {
		String caracter="";
		char carac = 'x';
		boolean correcto = false;
		
		do{
			try{
				caracter=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
				if(caracter==null){
					JOptionPane.showMessageDialog(null, "Introduce un valor","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					//System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					carac=caracter.charAt(0);;
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		
		return carac;
		
	}
	
	public static float pedirfloat() {
		String nume="";
		float num = 0.0f;
		boolean correcto = false;
		
		do{
			try{
				nume=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
				if(nume==null){
					JOptionPane.showMessageDialog(null, "Introduce un valor","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					//System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					num=Float.parseFloat(nume);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		
		return num;
		
	}

	public static int menu(String[] operaciones) {
		
		int opcion=0;
		
		opcion = JOptionPane.showOptionDialog(null,"Pulsa la opción de menú","Menú",0,JOptionPane.QUESTION_MESSAGE,null,operaciones,operaciones[0]);
		
		return opcion;
		
	}
	
	public static float suma() {
		
		float resultado=0.0f;
		float nume1=0.0f, nume2=0.0f;
		
		nume1= funciones.pedirfloat();
		nume2= funciones.pedirfloat();
		resultado=nume1 + nume2;
		
		return resultado;
		
	}
	
	public static int menuconti() {
		String[] operaciones = { "volver a hacer la operacion","menu","salir" };
		int opcion=0;
		
		opcion = JOptionPane.showOptionDialog(null,"Pulsa la opción de menú","Menú",0,JOptionPane.QUESTION_MESSAGE,null,operaciones,operaciones[0]);
		
		return opcion;
		
	}
	
	public static float restar() {
		
		float resultado=0.0f;
		float nume1=0.0f, nume2=0.0f;
		
		nume1= funciones.pedirfloat();
		nume2= funciones.pedirfloat();
		resultado=nume1 - nume2;
		
		return resultado;
		
	}

	public static float multiplicar() {
	
		float resultado=0.0f;
		float nume1=0.0f, nume2=0.0f;
	
		nume1= funciones.pedirfloat();
		nume2= funciones.pedirfloat();
		resultado=nume1 * nume2;
	
		return resultado;
	
	}	

	public static float dividir() {
	
		float resultado=0.0f;
		float nume1=0.0f, nume2=0.0f;
	
		nume1= funciones.pedirfloat();
		do {
		nume2= funciones.pedirfloat();
		if (nume2==0) {
			JOptionPane.showMessageDialog(null, "El numero tiene que ser diferente a 0");
		}
		}while(nume2==0);
		resultado=nume1 / nume2;
	
		return resultado;
	
	}
	
}

