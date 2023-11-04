// Desea continuar, sacar media de sus divisores impares y decir si es mayor igual que 10
package test;

import javax.swing.JOptionPane;

import framework_ejers_extra_v1.validators;

public class mitja_div_imp {

	 public static void main(String[] args) {
	        int confirmado = 0;
	        int suma = 0;
	        int cont_Divisores_Impar = 0;
	        int num = 0;
	        float media = 0.0f;
	        String cad = "";

	        do {
	            num = validators.valida_int("Introduce un numero entero", "Numero int");
	            cont_Divisores_Impar = 0; // Reiniciar el contador de divisores impares en cada iteración
	            suma = 0; // Reiniciar la suma en cada iteración
	            for (int i = 1; i <= num; i++) {
	                if ((num % i == 0) && (i % 2 != 0)) {
	                    cont_Divisores_Impar++;
	                    suma = suma + i;
	                }
	            }

	            if (cont_Divisores_Impar != 0) {
	                media = (float) suma / cont_Divisores_Impar;
	            } else {
	                media = 0.0f;
	            }

	            confirmado = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	            if (media >= 10) {
	                cad += "La media de los divisores impares sí es mayor o igual que 10 y es " + media;
	            } else {
	                cad = "La media de los divisores impares NO es mayor ni igual que 10.";
	            }
	        } while (JOptionPane.OK_OPTION == confirmado);
	        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	    }
	}