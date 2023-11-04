package test;

import javax.swing.JOptionPane;

import framework_ejers_extra_v1.validators;

public class mayor_repite {

	public static void main(String[] args) {
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
		}		
	}