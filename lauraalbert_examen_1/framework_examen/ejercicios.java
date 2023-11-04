package framework_examen;
import javax.swing.JOptionPane;

import framework_examen.validators;

public class ejercicios {

	public static void ejercicio1() {
			int num_intro=0; int cont_pivot=0; int major =0; int menor =0; int num =0;
			String cad = "";
			do {
				num = validators.valida_int("Introduce un numero entero", "Numero entero");
			}while (num!=-1);
			
			if (cont_pivot == 0) { //CREAR PIVOT
				cont_pivot ++;
				major = num;
				menor = num;
				}// end-if
				if (num < menor) {
					num = menor;
				}
				if (num > major) {
					major = num;
				}
			
			
			cad = "El numero major es " + major + " i el menor es " + menor;
			JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		
	
	}//end-static
	
	public static void ejercicio2() {
		int confirmado = 0; int num =0; int copia = 0; int digit =0; int suma =0;
		String cad = "";
		int cont_digitos_pares=0;
		do {
			num = validators.valida_int("Introduce un numero entero", "Numero entero");
				copia = num;
				System.out.println (num);
				while (num > 0) {
					digit = num % 10;
					num = num/10;
				}
				if (digit % 2 == 0) {
					cont_digitos_pares++;
				}
				if(cont_digitos_pares==2) {
					suma = suma+ copia ;
					cad = "La suma de los numeros que tienen 2 digitos pares es igual a " + suma;
					System.out.println (suma);

				}
			confirmado = JOptionPane.showConfirmDialog (null, "¿Desea continuar?");
		}while (JOptionPane.OK_OPTION == confirmado);
        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}//end-static
	
	public static void ejercicio3() {
		int cont_numeros_pares =0; int num = 0; int suma =0; int num_par=0;
		float media_div_pares =0.0f;
		String cad = "";
		while (cont_numeros_pares <4) {
			num = validators.valida_int("Introduce un numero entero, te diré si es <=10 o no", "Numero entero");
			if  (num%2 ==0) {
				cont_numeros_pares++;
				num_par = num;
			}
			for (int i = 1; i<=num; i++) {
				if (((num%i)==0)&& (i%2)==0){
					suma = suma + i;
				}
			}
			 if (cont_numeros_pares != 0) {
				 media_div_pares = (float)suma/cont_numeros_pares;
			 }else {
				 media_div_pares = 0.0f;
			}
			 if (media_div_pares <= 10) {
				 cad = cad +" mitja -> " + num_par + " SI es <= que 10 \n";
			 }else {
				 cad = cad +" mitja -> " + num_par + " NO es <= que 10 \n";

			 }
			}
        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}//end-static
}//end-class
