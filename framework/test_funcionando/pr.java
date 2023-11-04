// n numeros dels numeros que tinguen 3 divisors impars la mitja d'eixos numeros, dels nums ingresats per l'usuari
package test_funcionando;
import javax.swing.JOptionPane;

import framework_ejercicios.validators;

import javax.swing.JOptionPane;

public class pr {
    public static void main(String[] args) {
        int num;
        String cad = "";
        int sum = 0;
        int count = 0;

        num = framework_ejercicios.validators.n_nums("¿Cuantos numeros quieres introducir?", "Introducir numeros");

        for (int i = 0; i < num; i++) {
            int num1 = framework_ejercicios.validators.valida_int("Introduce un numero entero", "Numero int");
            System.out.println(num1 + " num");

            int cont_divisors = 0;

            for (int j = 1; j <= num1; j++) {
                if (num1 % j == 0 && j % 2 != 0) {
                    cont_divisors++;
                }
            }

            System.out.println(cont_divisors + " i");

            if (cont_divisors == 3) {
                sum += num1;
                count++;
            }
        }

        if (count > 0) {
            double media = (double) sum / count;
            cad = "Media de los números con 3 divisores impares: " + media;
        } else {
            cad = "No se encontraron números con 3 divisores impares.";
        }

        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
