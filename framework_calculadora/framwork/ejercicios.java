package framwork;
import javax.swing.JOptionPane;


public class ejercicios {
	
	public static void suma() {
		int num1 = 0;
		int num2 = 0;
		int suma = 0;
		
			num1=validators.valida_int();
			num2=validators.valida_int();
			suma = num1+num2;
			JOptionPane.showMessageDialog(null, "La suma de " + num1 + " y " + num2 + " es igual a " + suma, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void resta () {
		int num1 = 0;
		int num2 = 0;
		int resta = 0;
			num1=validators.valida_int();
			num2=validators.valida_int();
			resta = num1-num2;
			JOptionPane.showMessageDialog(null, "La resta de " + num1 + " y " + num2 + " es igual a "  + resta, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void multiplicacion () {
		int num1 = 0;
		int num2 = 0;
		int multiplicacion = 0;
		char seguir = 0; 
		do{
			num1=validators.valida_int();
			num2=validators.valida_int();
			multiplicacion = num1*num2;
			JOptionPane.showMessageDialog(null, "La multiplicacion de " + num1 + " y " + num2 + " es igual a " + multiplicacion, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		}while (seguir== 'S');
	}
	
	public static void division() {
		int num1 = 0;
		int num2 = 0;
		int division = 0;
		char seguir = 0; 
		do{
			num1=validators.valida_int();
			num2=validators.valida_int();
			division = num1/num2;
			JOptionPane.showMessageDialog(null, "La division de "+ num1 + " y " + num2  + " es igual a " + division, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		}while (seguir== 'S');	}
	
	
}
