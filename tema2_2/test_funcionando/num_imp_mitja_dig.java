//Per als 5 1rs num impars, traure de cada uno, la mitja dels seus digits multiplos de 3 num_imp_mitja_dig
//La mitja dels seus digits multiples de 3 (dels 5 1rs nums)
package test_funcionando;

import javax.swing.JOptionPane;

import framework_ejercicios.validators;

public class num_imp_mitja_dig {
	    public static void main(String[] args) {
	        String cad = "";
	        int num = 0;
	        int sumaDigitos = 0;
	        int cantDigitos = 0;

	        for (int i = 0; i < 5; i++) {
	            num = framework_ejercicios.validators.valida_int("Introduce un numero entero", "Numero int");
	            
	            int temp = num;
	            while (temp > 0) {
	                int digit = temp % 10;
	                if (digit % 3 == 0) {
	                    sumaDigitos += digit;
	                    cantDigitos++;
	                }
	                temp /= 10;
	            }
	        }

	        if (cantDigitos != 0) {
	            float mediaDigitos = (float) sumaDigitos / cantDigitos;
	            cad = "La media de los dígitos múltiplos de 3 en los 5 primeros números es: " + mediaDigitos + "\n";
	        } else {
	            cad = "No se encontraron dígitos múltiplos de 3 en los números ingresados.\n";
	        }

	        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	    }
	}
