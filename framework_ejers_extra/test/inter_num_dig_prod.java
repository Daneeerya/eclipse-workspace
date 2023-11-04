//Bucle interruptor -5, los que tienen dos digitos impares calcular el producto del número, no de los digitos.
package test;

import javax.swing.JOptionPane;

import framework_ejers_extra_v1.validators;

public class inter_num_dig_prod {

    public static void main(String[] args) {
        int num = 0;
        int prodNumeros = 1;
        boolean interruptor = true;
        String cad = "El producto de los números que tienen 2 dígitos impares es:";
        
        while (interruptor) {
            num = validators.valida_int("Introduce un número entero", "Número int");
            
            if (num == -5) {
                interruptor = false;
            } else {
                int copia = num;
                int contDigitosImpares = 0;
                
                while (copia > 0) {
                    int digito = copia % 10;
                    
                    if (digito % 2 != 0) {
                        contDigitosImpares++;
                    }	
                    
                    copia /= 10;
                }
                
                if (contDigitosImpares == 2) {
                    prodNumeros *= num;
                }
            }
        }
        
        if (prodNumeros != 1) {
            cad += " " + prodNumeros;
        } else {
            cad = " No has introducido números con 2 dígitos impares.";
        }
        
        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

