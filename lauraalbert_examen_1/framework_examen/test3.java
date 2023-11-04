////Dissenya una aplicació amb Java que acabarà quan l’usuari introduïsca els 4 primers nums pars.
//Calcularem per a cada nº si la mitja dels seus divisors pars es <= que 10 o no.
//num=6 -> mitja -> 4 SI es <= que 10
//num=12 -> mitja -> 6 SI es <= que 10
//num=8 -> mitja -> 4 SI es <= que 10
//num=10 -> mitja -> 6 SI es <= que 10
//cont>4

package framework_examen;

import javax.swing.JOptionPane;

public class test3 {

	public static void main(String[] args) {
		int cont_numeros_pares =0; int num = 0; int suma =0; int num_par=0;
		float media_div_pares =0.0f;
		String cad = "";
		while (cont_numeros_pares <4) {
			num = validators.valida_int("Introduce un numero entero", "Numero entero");
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
		}
	}


