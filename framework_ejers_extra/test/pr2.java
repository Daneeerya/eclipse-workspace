package test;

import javax.swing.JOptionPane;

import framework_ejers_extra_v1.validators;
import javax.swing.JOptionPane;

public class pr2 {
    public static void main(String[] args) {
        String cad = "";
        int num = 0, cont_mitja = 0;
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            num = validators.valida_int("Introduce un numero entero", "Numero int");
            
            if (num % 3 == 0) {
                int temp = num;
                int digitSum = 0;
                int digitCount = 0;
                
                while (temp > 0) {
                    int digit = temp % 10;
                    digitSum += digit;
                    temp /= 10;
                    digitCount++;
                }
                
                if (digitCount > 0) {
                    suma += digitSum;
                    cont_mitja++;
                }
            }
        }

        if (cont_mitja != 0) {
            float media = (float) suma / cont_mitja;
            cad = "La media de los dígitos de los números múltiplos de 3 es: " + media + "\n";
        } else {
            cad = "No se encontraron números múltiplos de 3 o no tenían dígitos.\n";
        }

        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
