package test;

import javax.swing.JOptionPane;

public class num_perfecto {

	public static void main(String[] args) {
		String resultado ="";
		int suma_divisors = 0, num = 0, cont_num_perf = 0;
		boolean quatreperf = false;
		while (quatreperf== false) {
			num++;
			suma_divisors = 0;

			for(int i = 1; i<num; i++){
				
				if( (num%i)==0 ){
					suma_divisors += i;
				}
			}
			
			if ( num==suma_divisors ){
				resultado += num +" es perfecto \n";// += para concatenar strings
				cont_num_perf++;
			}
			if( cont_num_perf==4 ){
				quatreperf = true;
			}
		}
		JOptionPane.showMessageDialog(null, resultado);
		}
		
}

