//1.- El usuario introduce números por pantalla, de los cuales se mostrará el producto de los dígitos impares de cada número 
//y de los pares sacará la media. 
//Si la suma de todos los dígitos es mayor o igual a 40 se mostrará los dígitos pares del número más grande ingresado, 
//se debe ver por pantalla en un único mensaje. Para terminar de ingresar números el usuario debe pulsar que no en la pantalla.
package framework_ejers_extra_v3;

import javax.swing.JOptionPane;

public class test4 {
    public static void main(String[] args) {
        String cad = "";
        String cad_media = "";
        String cad_num_grande = "";
        int copia_prod_impares = 1;
        int sumaDigitosPares = 0;
        int contPares = 0;
        int copia_digit_pares = 0;
        boolean numTienePares = false;
        boolean numTieneImpares = false;
        int numMasGrande = Integer.MIN_VALUE; // Variable para rastrear el número más grande.
        String numParesMasGrande = ""; // Variable para rastrear los dígitos pares del número más grande.

        do {
            int num_int = validators.valida_int("Introduce un número entero", "Numero int");

            if (num_int > numMasGrande) {
                numMasGrande = num_int; // Actualiza el número más grande
                numParesMasGrande = ""; // Reinicia los dígitos pares del número más grande.
            }

            int copia = num_int;

            while (num_int != 0) {
                int digit = num_int % 10;
                if (digit % 2 != 0) {
                    copia_prod_impares *= digit;
                    numTieneImpares = true;
                } else {
                    sumaDigitosPares += digit;
                    contPares++;
                    copia_digit_pares = digit;
                    numTienePares = true;
                    if (sumaDigitosPares >= 40) {
                        numParesMasGrande += " " + copia_digit_pares;
                    }
                }
                num_int /= 10;
            }
        } while (JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        if (numTienePares) {
            float mediaPares = (float) sumaDigitosPares / contPares;
            cad_media += "La media de los dígitos pares es " + mediaPares + "\n";
        } else {
            cad_media = "No se ingresaron dígitos pares, por lo tanto, no se puede calcular la media.\n";
        }
        if (numTieneImpares) {
            cad = "El producto de los dígitos impares es " + copia_prod_impares + ".\n";
        } else {
            cad = "No se ingresaron dígitos impares, por lo tanto, no se puede calcular el producto. \n";
        }

        if (!numParesMasGrande.isEmpty()) {
            cad_num_grande = "Los dígitos pares del número más grande ingresado son:" + numParesMasGrande;
        }

        JOptionPane.showMessageDialog(null, cad + cad_media + cad_num_grande, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
