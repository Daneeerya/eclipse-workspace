//
//EXER 2. (3,5 punts
//Imprimirem la suma dels nº que tinguen 2 dígits pars.
//7841 -> 2 dígits pars SI
//5479 -> 1 dígit par SI
//2176 -> 2 dígits pars SI
//No
//Imprimim 7841 + 2176 = 10017

package framework_examen;

import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {
		int confirmado = 0; int num =0; int copia = 0; int digit =0; int suma =0; int a =0;
		String cad = "";
		int cont_digitos_pares=0;
		do {
			num = validators.valida_int("Introduce un numero entero", "Numero entero");
			while (num > 0) {
				digit = num % 10;
				num = num/10;
			}
			if (digit % 2 == 0) {
				cont_digitos_pares++;
			}
						confirmado = JOptionPane.showConfirmDialog (null, "¿Desea continuar?");
		}while (JOptionPane.OK_OPTION == confirmado);
		num = copia;
		if(cont_digitos_pares==2) {
			suma = suma+ copia ;
			cad = "La suma de los numeros que tienen 2 digitos pares es igual a " + suma;
		}
		
        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
