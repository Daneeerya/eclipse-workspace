package test;

import javax.swing.JOptionPane;

import framework_ejers_extra_v1.validators;

public class media_div_impares {

	public static void main(String[] args) {
		int num;
        String cad = "";
        int suma = 0;
        int cont = 0;

        num = validators.n_nums("¿Cuantos numeros quieres introducir?", "Introducir numeros");

        for (int i = 0; i < num; i++) {
            int num1 = validators.valida_int("Introduce un numero entero", "Numero int");
            System.out.println(num1 + " num");

            int cont_divisors = 0;

            for (int j = 1; j <= num1; j++) {
                if (num1 % j == 0 && j % 2 != 0) {
                    cont_divisors++;
                }
            }

            System.out.println(cont_divisors + " i");

            if (cont_divisors == 3) {
                suma += num1;
                cont++;
            }
        }

        if (cont > 0) {
            double media = (double) suma / cont;
            cad = "Media de los números con 3 divisores impares: " + media;
        } else {
            cad = "No se encontraron números con 3 divisores impares.";
        }

        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
