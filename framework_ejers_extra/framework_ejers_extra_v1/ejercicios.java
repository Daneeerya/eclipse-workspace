package framework_ejers_extra_v1;
import javax.swing.JOptionPane;

public class ejercicios {

	public static void ejercicio1() {

        int num = 0;
        int prodNumeros = 1;
        boolean interruptor = true;
        String cad = "El producto de los números que tienen 2 dígitos impares es:";
        
        while (interruptor) {
            num = validators.valida_int("Introduce números que tengan 2 digitos impares ", "Número int");
            
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
    
	}//end-static
	
	public static void ejercicio2() {
		int cont =0, cont_pivot=0, mayor=0, num=0, menor=0, cont_mayor =0;
		String cad ="";
		while (cont_mayor < 5) {
			num = validators.valida_int("Introduce un numero entero", "Numero int");
			System.out.println(cont_mayor);
			if (cont_pivot ==0) {
				cont_pivot ++;
				mayor = menor = num;
			}if (num > mayor) {
				mayor = num;
				cont_mayor=0;
			}if (num==mayor) {
				cont_mayor++;
			}
			}
		
		cad ="El numero mayor es "+ mayor +" y se ha repetido " + (cont_mayor-1) + " veces ";

			JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end-static
	
	public static void ejercicio3() {
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
	}//end-static
}//end-class
