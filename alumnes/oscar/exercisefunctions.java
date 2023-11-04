package oscar;

import javax.swing.JOptionPane;

import oscar.functions;

public class exercisefunctions {
	
	public static String exercise1(){
		String result="";
		String [] optiondialog = {"Si", "No"};
		int optcontinue = 0, number = 0, aux = 0, digit = 0, contmult = 0;
		
		do{
			number = functions.askinteger("Introduce un numero", "Pide numeros ejercicio 1");
			aux = number;
			contmult = 0;
			
			while ( number>0 ){
				digit = number%10;
				number = number/10;
				
				if( (digit%3)==0 ){
					contmult++;
				}
			}
			
			if ( contmult==2 ){
				result += aux +" tiene 2 numeros multiplos de 3\n";
			}
			else{
				result += aux + " no tiene 2 numeros multiplos de 3\n";
			}
						
			optcontinue = functions.menubuttons(optiondialog , "Desea continuar introduciendo numeros?", "Ejercicio 2");
		}while( optcontinue==JOptionPane.OK_OPTION);
		
		return result;
	}
	
	public static String exercise2(){
		String result="";
		String [] optiondialog = {"Si", "No"};
		int optcontinue = 0, number = 0, aux = 0, digit = 0, contmult = 0, sumnumbers = 0, count = 0;
		float average = 0.0f;
		
		
		do{
			number = functions.askinteger("Introduce un numero", "Pide numeros ejercicio 1");
			aux = number;
			contmult = 0;
	
			while ( number>0 ){
				digit = number%10;
				number = number/10;
				
				if( (digit%3)==0 ){
					contmult++;
				}
			}
			
			if ( contmult==2 ){
				sumnumbers += aux;
				count++;
			}
			
			optcontinue = functions.menubuttons(optiondialog , "Desea continuar introduciendo numeros?", "Ejercicio 2");
		}while( optcontinue==JOptionPane.OK_OPTION);
		
		if(count>1){
			average = (float)sumnumbers/count;
			result = "La media de los nº con 2 digitos multiplos de 3 es "+ average;
		}
		else{
			result = "No hay suficientes numeros para calcular la media";
		}
		
		return result;
	}
	
	public static String exercise3(){
		String result = "";
		int sumdivisors = 0, num = 0, contperf = 0;
		boolean threeperf = false;
		
		while ( threeperf == false ){
			num++;
			sumdivisors = 0;
			
			for( int i = 1; i<num; i++){
				
				if( (num%i)==0 ){
					sumdivisors += i;
				}
				
			}
			
			if ( num==sumdivisors ){
				result += num +" es perfecto\n";
				contperf++;
			}
			if( contperf==3 ){
				threeperf = true;
			}
		}
		
		return result;
	}
	
	
}
