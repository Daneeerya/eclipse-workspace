package prueba;

import java.util.Scanner; // Aquí habia un fallo

public class GeneraNum {
		public static void main(String[] args) {  
			int num2=0;// No estaba declarada la variable
			Scanner sc = new Scanner(System.in); System.out.println("Introduce el primero numero");
			int num1=sc.nextInt(); // Estaba 2 veces declarado
			System.out.println("Introduce el segundo numero");
			for (int i=0;i<10;i++){ //Generamos un numero aleatorio y la x debía ser una i ya que es nuestra variable 
			int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2); System.out.println(numAleatorio); // Aquí estaba (numAleatori) y es (numAleatorio)
			}
		}
	}